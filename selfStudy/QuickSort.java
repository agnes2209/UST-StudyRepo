import java.util.Arrays;

public class QuickSort {


    public void sort(int[] numbers)
    {
        sort(numbers,0,numbers.length-1);
    }
    private void sort(int[] numbers,int start,int end)
    {
        if(start<end)
        {
            int p=partition(numbers,start,end);
            sort(numbers,start,p-1);
            sort(numbers,p+1,end);
        }
    }

    private int partition(int [] numbers,int start,int end)
    {
        int p= numbers[end];
        int i=start-1;
        for(int j=start;j<end;j++)
        {
            if(numbers[j]<p)
            {
                i++;
                swap(numbers,i,j);
                
            }
        }
         swap(numbers,i+1,end);
         return i+1;
    }

    private void swap(int[] numbers,int i,int j)
    {
        int temp=numbers[i];
        numbers[i]=numbers[j];
        numbers[j]=temp;
    }
    public static void main(StringProblems []args)
    {
        QuickSort quickSort=new QuickSort();
        int [] numbers=new int[] {9,16,8,3,6,70,12,23};
        quickSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
