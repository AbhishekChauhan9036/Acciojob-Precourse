import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc=new Scanner(System.in);

      int arr[]=new int[5];

      for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
      }

      Arrays.sort(arr);

      System.out.println(arr[3]);
	}
}