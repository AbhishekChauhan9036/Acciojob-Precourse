import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc=new Scanner(System.in);
    int sum=0;
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      if(arr[i]%2!=0){
        sum+=arr[i];
      }
    }
    System.out.println(sum);
	}
}