import java.util.*;
import java.io.*;
 
class Main {
 
    static int countPairsWithDiffK(int arr[],
                                    int n, int k)
    {
        int count = 0;
 
        // Pick all elements one by one
        for (int i = 0; i < n; i++)
        {
            // See if there is a pair
            // of this picked element
            for (int j = i + 1; j < n; j++)
                if (arr[i] - arr[j] == k ||
                    arr[j] - arr[i] == k)
                    count++;
        }
        return count;
    }
 
    // Driver code
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        int k=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println(countPairsWithDiffK(arr, n, k));
    }
}
 