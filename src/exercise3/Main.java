package exercise3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

            /* Dog dog = new Dog();
            dog.size = 2;
            dog.name = "ポチ";
            dog.bark();

            Dog dog1 = new Dog();
            dog1.size = 8;
            dog1.name = "レオパルド";
            dog1.bark();

            Dog dog2 = new Dog();
            dog2.size = 28;
            dog2.name = "スペディオ";
            dog2.bark(); */

        /* Window w = new Window(10, 100);

        System.out.println(w.getHeight());
        System.out.println(w.getWidth());
        System.out.println(w.setHeight());
        System.out.println(w.setWidth()); */

        /* Student s1 = new Student(3, "Mike");

        System.out.println(s1.getSchoolyear());
        System.out.println(s1.getName()); */

        /* Studentクラスのオブジェクトを作る。
        * 教科を追加するメソッドを呼び出し、
         登録されている教科を表示する。
         */

        /* s1.tsuika("数学");
        s1.tsuika("英語"); */


        /* Studentが登録しているコースを表示する */
        /* System.out.println(s1.getCourses());
        ArrayList<String> cs = s1.getCourses();
        for (String kyoka : cs) {
            System.out.println(kyoka);
        } */

        Book book = new Book("java", "Kaki", 2800);
        book.setName("java2");
        System.out.println(book.getName());

        Book book2 = new Book("Pyhon", "Mai", 2800);

    }
}