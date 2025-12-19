import java.util.Scanner;

public class Array {

    public static int sum(int [] arr)
    {
        int sum=0;
        for(int i : arr)
        {
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int []arr=new int[5];
        //int n= arr.length;
        System.out.println("Enter elements:");
        for(int i=0;i<arr.length;i++)
        {
        arr[i]=sc.nextInt();
        }
        System.out.println("Array is :");
        for(int i: arr)
        {
            System.out.print(i + " ");
        }
        System.out.println("Sum of the array is : " + sum(arr));
        sc.close();
    }
}
