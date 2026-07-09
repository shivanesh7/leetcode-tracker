// Last updated: 7/9/2026, 9:45:40 AM
class Solution {
    public String stringHash(String s, int k)
    {
        char[] ch = s.toCharArray();
        String res = "";

        for(int i = 0; i < ch.length; i += k)   
        {    
            int des = 0;

            for(int j = i; j < i + k; j++)
            {
                des += (ch[j] - 'a');
            }

            int ans = des % 26;

            res = res + (char)(ans + 'a');
        }

        return res;
    }
}