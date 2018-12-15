import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static double weightedMean(int[] weights,int[] scores){
        double weightedMean;
        double total=0;
        double n=0;
        for (int i = 0; i < weights.length; i++) {
            double temp=(weights[i]*scores[i]);
            total+=temp;
            n+=weights[i];
        }
        weightedMean=total/n;
        return weightedMean;
    }

    public static void main(String[] args) {
        DecimalFormat value = new DecimalFormat("#.#");
        Scanner input=new Scanner(System.in);
        int len=input.nextInt();
        int[] weights=new int[len];
        int[] scores=new int[len];
        
        for (int i = 0; i <len; i++) {
            scores[i] = input.nextInt();
        }
        for (int i = 0; i < len; i++) {
            weights[i] = input.nextInt();
        }
        double res=Double.parseDouble(value.format(weightedMean(weights, scores)));
        System.out.println(res);
    }

}

