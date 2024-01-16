package exercise2;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int num = 10;
        change(num);
        /* System.out.println(num); */

        int[] nums = {1, 2, 3};
        change(nums);
        System.out.println(Arrays.toString(nums));

        String name = "Mike";
        change(name);
        System.out.println(name);
    }
    /* 値を変える関数 */
    public static void change(int n){
        n = 20;
    }
    public static void change(int[] n){
        n[0] = 10;
    }
    public static void change(String s){
        s = "Lisa";
    }
}
