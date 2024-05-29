import java.util.StringTokenizer;

public class SplitStringBySpace {
    public static void main(String args[])
    {
        String s1="my name is ram";
        StringTokenizer st=new StringTokenizer(s1," ");
        String s2[]=new String[st.countTokens()];
        int j=0;
        while(st.hasMoreTokens())
        {
            s2[j++]=st.nextToken();
        }
        for(int i=0;i<s2.length;i++)
        {
            System.out.println(s2[i]);
        }
    }
}
