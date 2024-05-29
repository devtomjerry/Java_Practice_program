public class SecondLargestNumber {
    public static void main(String[] args) {
        int x[]={10,5,15,2,1,25,30,5,66};
        int max=x[0];
        int smax=x[0];
        for(int i=1;i<x.length;i++)
        {
            if(x[i]>max) {
                smax=max;
                max = x[i];
            }
            else if ( smax<x[i] && x[i] !=max )
            {
                smax=max;
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
