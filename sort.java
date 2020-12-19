import java.util.Scanner;
public class sort
{
    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j]; // swap temp and arr[i]
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    static void stringSort(String arr[])
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
               // compares each elements of the array to all the remaining elements 
                if (arr[i].compareTo(arr[j]) > 0)
                {
                    // swapping array elements
                    String temp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array to be sorted.\nSelect 1 for array of strings, 2 for array of integers: ");
        int c = in.nextInt();
        switch (c) 
        { // sorts array of strings or array of integers
            case 1:
                System.out.print("Enter size for array of strings: ");
                int n = in.nextInt();
                in.nextLine(); // to make sure the input is recorded correctly
                String str[] = new String[n];
                System.out.printf("Enter %d strings:\n", n);
                for (int i = 0; i < n;i++)
                {
                    str[i] = new String();
                    str[i] = in.nextLine();
                }
                System.out.println("Strings in alphabetical order:");
                stringSort(str); // function to sort strings
                for (int i = 0; i < n; i++)
                    System.out.println(str[i]);
                break;
            case 2:
                System.out.print("Enter size for array of integers: ");
                int size = in.nextInt();
                int[] arr = new int[size];
                System.out.printf("Enter %d integers: ", size);
                for (int i = 0; i < size; i++)
                    arr[i] = in.nextInt();
                System.out.print("Sorted array: ");
                bubbleSort(arr); // function to sort strings
                for (int i = 0; i < size; i++)
                    System.out.printf("%d ", arr[i]);
                break;
        }
        in.close();
    }
}