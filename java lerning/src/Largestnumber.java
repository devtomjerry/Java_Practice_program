public class Largestnumber {
    public static void main(String args[])
    {
        int x[]={10,5,15,2,1};
        int max=x[0];
        for(int i=1;i<x.length;i++)
        {
            if(x[i]>max) {
                max = x[i];
            }
        }
        System.out.println("The largest number in the array is: " + max);
    }
}
