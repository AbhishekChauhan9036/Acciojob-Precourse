import java.io.*;
import java.util.*;
public class Main{
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for (int[] row: matrix) {
            reverse(row);
        }
    }
    
        static void reverse(int[] arr) {
            int i = 0, j = arr.length - 1;
            while (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();

        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        rotate(arr);

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
       
    }
}