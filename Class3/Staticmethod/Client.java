package Class3.Staticmethod;

import java.util.Arrays;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        int h=10;
        A obj=new A();
        obj.sfunc(3,5);
        obj.func(38,46);
        A.sfunc(293,49); ///Static level call or class level call
//        A.func(3,4);// Error object level function cant be accessed on class level
        int[] arr={283,482,282,2,392,2983,382,24}; //Static
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        HashMap<Integer, Integer> hash=new HashMap<Integer, Integer>();
//        for(int i=0;i<arr.length;i++){
//            hash.put(i,arr[i]);
//        }







    }
}
