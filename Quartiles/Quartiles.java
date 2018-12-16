import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] data=new int[n];
        for(int i=0;i<n;i++){
            data[i]=input.nextInt();
        }
        input.close();
        Arrays.sort(data);
        computeQuartiles(data);
    }
}

