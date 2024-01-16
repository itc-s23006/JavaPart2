package exercise2;

public class Test3 {
    public static void main(String[] args) {
        int[] ar = {1, 5, 2, 0, 8, 4};
        /* 新しいオブジェクトを作る
 　　　　　　一番小さい値を求めて、戻り地で返す
 　　      Math.min(a, b)   で小さい値が求められる
         */
        int result = smallest(ar);
        System.out.println(result);
    }


    public static int smallest(int[] array){
    int min = Integer.MAX_VALUE;
    for (int value: array){
        min = Math.min(value, min);
    }
    return min;
    }

}

