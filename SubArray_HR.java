import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int subArrs = sumOfArrs(arr, n); 
        System.out.println(subArrs);
    }
    
    public static int sumOfArrs(int[] arrray, int n){
        int sumEle = 0, sumArrs = 0;
        for(int i=0;i<n;i++){
            if(arrray[i]<0)
                sumArrs += 1; // Single Elements
            // sumEle += arrray[i]; // complete array
        }
        
        ArrayList<Integer> queries = new ArrayList<>();
        int x= 1;
        while(x<n){
        for(int i = 0; i<n;i++){
            if(i+x<n){
            queries.add(i);
            queries.add(i+x);
            }
        }
        x++;
        }
        for(int q=0;q<queries.size();q+=2){
            // System.out.println(q);
            int l = queries.get(q);
            int r = queries.get(q+1);
            for(int j = l; j<=r;j++){
                sumEle += arrray[j];
            }
            if(sumEle<0){
                sumArrs+=1;
            }
            sumEle = 0;
        }
        return sumArrs;
    }
}
