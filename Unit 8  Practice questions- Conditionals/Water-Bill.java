
import java.io.*;
import java.util.*;
public class Main{
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int water=sc.nextInt();
        int k=water;
        int sum=0;
        for(int i=1;i<=water;i++){
            if(i<=100){
                sum+=15;
            }else if(i<=200){
                sum+=14;
            }else{
                sum+=12;
            }
        }

        System.out.println(sum);
    }
}