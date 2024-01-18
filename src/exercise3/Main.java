package exercise3;

public class Main {
    public static void main(String[] args) {

            Dog dog = new Dog();
            dog.size = 2;
            dog.name = "アレックス";
            dog.bark();

            Dog dog1 = new Dog();
            dog1.size = 8;
            dog1.name = "レオパルド";
            dog1.bark();

            Dog dog2 = new Dog();
            dog2.size = 28;
            dog2.name = "スペディオ";
            dog2.bark();

            /* Windowsのクラスのオブジェクトを作り、
            このメインクラスからheightとwidthを変更できるようにする。
             */

        Window w = new Window(10, 100);

        System.out.println(w.getHeight());
        System.out.println(w.getWidth());
        }
    }