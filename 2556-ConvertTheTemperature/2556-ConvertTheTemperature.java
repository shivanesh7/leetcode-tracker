// Last updated: 7/9/2026, 9:45:49 AM
class Solution {
    public double[] convertTemperature(double celsius) 
    {
        double arr[]= new double[2];
        arr[0]=(celsius+273.15);
        arr[1]=((celsius*1.80)+32.00);
        return arr;
        
    }
}