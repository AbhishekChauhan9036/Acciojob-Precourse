import java.io.*;
import java.util.*;
public class Main{
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int index=0;
        int i=0, first=0, second=0;
        int largest=second=Integer.MIN_VALUE;
        int temp = arr[0];
        for( i=0;i<n;i++){
            if(arr[i]>temp){
                temp=arr[i];
                index=i;
            }
            
        }
        
        
        
        for(i = 0; i <n; i++){
            largest = Math.max(largest, arr[i]);
        }
        for(i = 0; i <n; i++){
            if (arr[i] != largest)
                second = Math.max(second, arr[i]);
        }

        // System.out.println(largest+" "+second);
        if(largest>=second*2){
            System.out.println(index);
        }else{
            System.out.println(-1);
        }
        
    }
}