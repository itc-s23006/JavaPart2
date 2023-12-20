package exercise1;

public class Test1 {
    public static void main(String[] args) {
        // for文でHelloを100回表示
        // for (int f = 0; f < 100; f++) {
        // System.out.println("Hello");
        // }

        // while文でHelloを100回表示
        // int w = 0;
        // while (w<100) {
        // System.out.println("Hello");
        // w++;
        // }

        // for文で8を縦8横8で表示
        // for (int K = 0; K < 8; K++) {
        // for (int H = 0; H < 8; H++) {
        // System.out.print("8");
        // }
        // System.out.println();
        // }

        // for文で8を縦10横20で表示
        // ↓表示
        // 88888888888888888888
        // 8                  8
        // 8                  8
        // 8                  8
        // 8                  8
        // 8                  8
        // 8                  8
        // 8                  8
        // 8                  8
        // 88888888888888888888
        for (int A = 1; A <= 10; A++) {
        for (int R = 1; R <= 20; R++) {
        if (A == 1 || A == 10) {
        System.out.print("8");
        } else if (R == 1 || R == 20) {
        System.out.print("8");
        } else {
        System.out.print(" ");
        }
        }
        System.out.println();
    }

    }
}



