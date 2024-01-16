package exercise2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("１番めの値を入力してください");
        int x = sc.nextInt();
        System.out.println("２番めの値を入力してください");
        int y = sc.nextInt();
        System.out.println("３番めの値を入力してください");
        int z = sc.nextInt();

        int result = small(x,y,z);
        System.out.println(result);
    }
    public static int small(int a, int b, int c){
        int r = Math.min(Math.min(a, b), c);
        return r;
    }
}
