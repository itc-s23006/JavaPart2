package exercise3;

public class Dog {
    int size;
    String name;

    /* 吠えるメソッドを作る。
     * サイズによって吠え方を変える。(3パターン)
     * サイズに(size変数) よって吠え方を変える。(3パターン)
     * 「〇〇は〜と吠えた」と表示する。
     */
    public void bark() {
        if (size == 2) {
            System.out.println("ワンワン！");
        } else if (size == 8) {
            System.out.println("キャンキャン！");
        } else if (size == 28) {
            System.out.println("ワオーン！");
        } else {
            System.out.println("そのクラスには対応していません。");
        }
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];

        dogs[0] = new Dog();
        dogs[0].size = 1;
        dogs[0].name = "";

        dogs[1] = new Dog();
        dogs[1].size = 2;
        dogs[1].name = "";

        dogs[2] = new Dog();
        dogs[2].size = 3;
        dogs[2].name = "";

        for (Dog dog : dogs) {
            dog.bark();
        }
    }
}
