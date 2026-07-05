import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class missingnrepeating {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i = 1;i<=n;i++){
            int count = map.getOrDefault(i,0);
            if(count == 0){
                result[0] = i;
            }
            if(count == 2){
                result[1] = i; 
            }
        }
        return result;
    }
}