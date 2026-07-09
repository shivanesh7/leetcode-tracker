// Last updated: 7/9/2026, 9:45:48 AM
class Solution {
    public String sortVowels(String s) 
    {
        char[]ch = s.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
            {
                count++;
            }
        }
        char []vowels=new char[count];
        int k=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
            {
                vowels[k]=ch[i];
                ch[i]='#';
                k++;
            }
        }
        Arrays.sort(vowels);
        String result="";
        int r=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='#')
            {
                result+=vowels[r];
                r++;
                
            }
            else
            {
                result+=ch[i];
            }
        }
        return result;


        
    }
}