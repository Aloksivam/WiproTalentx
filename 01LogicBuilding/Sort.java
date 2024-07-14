import java.util.*;

// import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        System.out.println("");
        //Remove Duplicates from an array
        int[] arr = {1,67,2,46,7,2,1,34,56,67};
        HashSet<Integer> sett = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            sett.add(arr[i]);
        }
        // Integer[] uniqueArray = sett.toArray(new Integer[0]);
        System.out.println(Arrays.toString(sett.toArray()));
        //find maximum number and its firstposition
        // System.out.println(Arrays.toString(arr));
        int first=0,last=0,count=1;
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {
            if(max<=arr[i]){
                if(max==arr[i]){
                    count++;
                    last=i;
                }
                else
                {max = arr[i];
                first=i;
                if(count==1){
                    last=i;
                }}
            }
            System.out.printf("maximum %d occured first at %d position and last at %d position total at %d times",max,first,last,count);
            
        }
    }
}
