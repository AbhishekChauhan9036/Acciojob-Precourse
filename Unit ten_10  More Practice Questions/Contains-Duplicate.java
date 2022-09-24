import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; ++ i) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    
    System.out.println(containsDuplicate(arr));
	}
}