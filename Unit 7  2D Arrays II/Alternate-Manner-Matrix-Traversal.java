import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
    Scanner sc = new Scanner(System.in);
    int m,n,i,j;
    m=sc.nextInt();
    n=sc.nextInt();
    int arr[][]= new int[m][n];

    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
    boolean l2r= true;
    for(i=0;i<m;i++)
    {
      if(l2r){
        for(j=0;j<n;j++){
          System.out.print(arr[i][j]+" ");}
       // System.out.println();
      }
      else{
        for(j=n-1;j>=0;j--){
          System.out.print(arr[i][j]+" ");}
       // System.out.println();
      }
      l2r=!l2r;
    }
    }
}