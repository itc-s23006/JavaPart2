package sample1;

public class Person {

    /* feedメソッドを作る。
    *  DogクラスのeatメソッドとCatクラスのeatメソッドを呼び出す。
    * 実行結果
    * 犬が餌を食べる。
    * 猫が餌を食べる。
     */
    public void feed (Animal animal) {
        animal.eat();

        /* 犬のときは散歩させる。walkメソッド */
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.walk();
        }
    }
}
