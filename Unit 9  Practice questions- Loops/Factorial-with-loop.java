import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc=new Scanner(System.in);

      int n=sc.nextInt();
      long ans=1;
      for(int i=1;i<=n;i++){
        ans*=i;
}
      System.out.println(ans);
	}
}