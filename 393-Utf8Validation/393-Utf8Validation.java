// Last updated: 7/9/2026, 9:49:22 AM
class Solution {
    public boolean validUtf8(int[] data) {
        int bytes=0;

        for(int num:data){
            if(bytes==0){
                if((num>>7)==0) bytes=0;
                else if((num>>5)==0b110) bytes=1;
                else if((num>>4)==0b1110) bytes=2;
                else if((num>>3)==0b11110) bytes=3;
                else return false;
            }else{
                if((num>>6)!=0b10) return false;
                bytes--;
            }
        }

        return bytes==0;
    }
}