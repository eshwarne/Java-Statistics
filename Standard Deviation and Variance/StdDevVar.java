import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static double computeMean(int[] arr){
        double mean=0;
        for(int ele: arr){
            mean+=ele;
        }
        mean=mean/arr.length;
        return mean;
    }
    public static double computeStandardDeviation(int[] arr){
        double mean=computeMean(arr);
        double variance=0;
        for(int ele :arr){
            variance+=Math.pow((ele-mean),2);
        }
        variance=variance/arr.length;
        return(Math.sqrt(variance));

    }

    public static void main(String[] args) {
        DecimalFormat value=new DecimalFormat("#.#");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println(value.format(computeStandardDeviation(arr)));
    }
}

