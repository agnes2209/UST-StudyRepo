public class StringProblems {
    public static void main(String[] args)
    {
        String str="Agnes";
        String rev=" ";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
}
