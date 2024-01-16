package exercise2;

public class Test3 {
    public static void main(String[] args) {
        int[] ar = {3, 5, 2, 6, 8, 4};
        /* 新しいオブジェクトを作る
 　　　　　　一番小さい値を求めて、戻り地で返す
 　　      Math.min(a, b)   で小さい値が求められる
         */
        int result = smallest(ar);
        System.out.println(result);

        int result2 = Max(ar);
        System.out.println(result2);
    }


    public static int smallest(int[] array){
    int min = Integer.MAX_VALUE;
    for (int value: array){
        min = Math.min(value, min);
    }
    return min;
    }
    public static int Max(int[] array){
        int max = Integer.MIN_VALUE;
        for (int number: array){
            max = Math.max(number, max);
        }
        return max;
    }
}

