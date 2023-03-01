import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccuranceOfNo {
   private static int i;

public static void main(String[] args) {
    int n=20;
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Enter numbers between 0 to 9 again and again 20 times -");
        while((i)<n)
        {
            arr[i]=sc.nextInt();
            i++;
        }


    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    for(int i=0;i<arr.length;i++){
        if(hm.containsKey(arr[i])){
            hm.put(arr[i],hm.get(arr[i])+1);
        }
        else{
            hm.put(arr[i],1);
        }
    }
    for(Map.Entry entry:hm.entrySet()){
        System.out.println("Element | Frequency");
        System.out.println(entry.getKey()+"             "+entry.getValue());
    }

   }
} 