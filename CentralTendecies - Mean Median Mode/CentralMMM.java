import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class CentralMMM {
    public static double mean(int[] arr){
        double mean;
        double total=0;
        for(int ele:arr){
            total+=ele;
        }
        mean=total/arr.length;
        return mean;
    }
    public static double median(int[] arr){
        double median;
        List<Integer> li=new ArrayList<Integer>();
        for(int ele:arr){
            li.add(ele);
        }
        int l=arr.length;
        Collections.sort(li);
        if(arr.length%2==0){
            double left=li.get(l/2);
            double right=li.get((l/2)-1);
            median=(left+right)/2;
        }
        else{
            median=li.get(((li.size()+1)/2)-1);
        }
        return median;
    }
    public static int mode(int[] arr){
        int mode=0;
        List<Integer> li =new ArrayList<Integer>();
        for(int ele: arr){
            li.add(ele);
        }
        Collections.sort(li);
        List<Integer> frequencies=new ArrayList<Integer>();
        for(int ele:li){
            frequencies.add(Collections.frequency(li, ele));
        }
        mode=Collections.max(frequencies);
        if(Collections.frequency(frequencies,frequencies.get(0))==arr.length){
            mode=(li.get(0));
        }
        else{
            mode=li.get(frequencies.indexOf(mode));
        }
        return mode;
    }
    public static void main(String[] args) {
        DecimalFormat value = new DecimalFormat("#.#");
        Scanner input=new Scanner(System.in);
        int noOfElements=input.nextInt();
        int[] array=new int[noOfElements];
        for(int i=0;i<noOfElements;i++){
            array[i]=input.nextInt();
        }
        System.out.println(mean(array));
        System.out.println(median(array));
        System.out.println(mode(array));

    }
}