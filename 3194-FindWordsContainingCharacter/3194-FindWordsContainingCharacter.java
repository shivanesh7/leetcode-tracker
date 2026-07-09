// Last updated: 7/9/2026, 9:45:45 AM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        char m =x;
        for(int i=0;i<words.length;i++)
        {
            int count=0;
            char[]ch=words[i].toCharArray();
            for(int j=0;j<ch.length;j++)
            {
                if(ch[j]==m)
                {
                   list.add(i);
                   break;
                }
               

            }
        }
        return list;
        
    }
}