import java.io.*;
import java.util.*;
public class Main{
    public static int diagonalSum(int[][] grid) {
        int sum=0;
        outerscope:
        for(int i=0;i<grid.length;i++){
             for(int j=0;j<grid[0].length;j++){
                if(i==j||i==grid[0].length-j-1){
                     sum+=grid[i][j];
                }
            }
        }
    return sum;
}
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int arr[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(diagonalSum(arr));
    }
}