import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class IQR {
    public static int computeMedian(int[] data, int start, int end) {
        int median = 0;
        int n = end - start;
        if (n % 2 == 0) {
            median = (data[(n / 2) + start] + data[(((n / 2) - 1)) + start]) / 2;
            return median;
        }

        else
            median = data[(((n + 1) / 2) - 1) + start];
        return median;
    }

    public static void computeQuartiles(int[] data) {
        int quartile1;
        int quartile3;
        int quartile2 = computeMedian(data, 0, data.length);
        if (data.length % 2 != 0)

        {
            quartile1 = computeMedian(data, 0, Arrays.binarySearch(data, quartile2));
        }

        else

        {
            quartile1 = computeMedian(data, 0, data.length / 2);
        }

        if (data.length % 2 != 0) {
            quartile3 = computeMedian(data, Arrays.binarySearch(data, quartile2) + 1, data.length);
        } else {
            quartile3 = computeMedian(data, data.length / 2, data.length);
        }
        System.out.println(quartile3-quartile1);

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] x=new int[n]
        int[] frequencies=new int[5];
        int[] data=new int[n];
        for(int i=0;i<n;i++){
            data[i]=input.nextInt();
        }
        input.close();
        Arrays.sort(data);
        computeQuartiles(data);
}
}

