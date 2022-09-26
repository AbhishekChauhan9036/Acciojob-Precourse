import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
	
    	long sum=0;
        for(long i=1;i<=n;i++){
           sum+=(((long)Math.pow(i+1,2)-(3*i+1)) + i);
        }

       System.out.println(sum);
	}
}