import java.io.*;
import java.util.*;
public class Main{
   static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> result= new ArrayList<Integer> ();
        result.add(matrix[0][0]);
        int [][] visited= new int [r][c];
        visited[0][0]=1;
        int i=0;
        int j=0;
        int count=1;
       for(count=1;count<r*c*r;count++)
        {
            if((j==0 ||(j!=0 && visited[i][j-1]==1))&&  i>=1 && visited[i-1][j]==0){
            result.add(matrix[i-1][j]);
            visited[i-1][j]=1;
            i=i-1;
            }
            else if(i<r && j+1<c  && visited[i][j+1]==0){
            result.add(matrix[i][j+1]);
            visited[i][j+1]=1;
            j=j+1;
            }
            else if(i+1<r && visited[i+1][j]==0){
            result.add(matrix[i+1][j]);
            visited[i+1][j]=1;
            i=i+1;
            }
            else if(i<r && j>0 && j<c && visited[i][j-1]==0){
            result.add(matrix[i][j-1]);
            visited[i][j-1]=1;
            j=j-1;
            }
        }
        return result;
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
        List<Integer> al = new ArrayList<Integer>();
        al=spirallyTraverse(arr,r,c);
        Integer[] barr = new Integer[al.size()];
  
        for (int i = 0; i < al.size(); i++){
            barr[i] = al.get(i);
        }
  
        for (Integer x : barr){
             System.out.print(x + " ");
        }
    }
}