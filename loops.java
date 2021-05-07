import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int s1 = 0;
        int s2=0;
        for(int i=0;i<t;i++){
            //Fetching input
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            //first summation
            s1 = a + 1*b;
            System.out.print(s1+" ");
            for(int j=1;j<n;j++){
                //adding term 2^j*b to previous summation to make series 
                //Originally power function returns double value...hence parsing it to                     integer
                s1 = s1 + (int)(Math.pow(2,j)*b);
                //printing output on same line seperated by single space
                System.out.print(s1+" ");
            }
            System.out.println();
        }
        in.close();
    }
}