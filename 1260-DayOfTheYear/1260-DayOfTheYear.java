// Last updated: 7/9/2026, 9:47:10 AM
class Solution 
{
    public int dayOfYear(String date) 
    {
        String[]parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int [] daysinMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        if(year%400==0 || (year%4==0 && year%100!=0))
        {
            daysinMonth[1]=29;
        }
        int totaldays=0;
        for(int i =0;i<month-1;i++)
        {
            totaldays+=daysinMonth[i];
        }
        totaldays+=day;
        return totaldays;
        
    }
}