package sample1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Dog dog = new Dog();
        Animal animal = dog;
        animal.eat(); */

        /* Person person = new Person();

        Dog dog = new Dog();
        Cat cat = new Cat();

        person.feed(dog);
        person.feed(cat); */

        /* 犬と猫。あわせて5匹誕生させる。
        * Dog d1 = new Dog();
        * Dog d2 = new Dog();
        * Dog d3 = new Dog(); */
        Animal[] animals = new Animal[5];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Dog();
        animals[4] = new Cat();

        /* ループを使い、makeSoundメソッドを実行する。
         * できるだけ、短いコードで書いてください。
         */
        for (Animal a : animals) {
            a.makeSound();
        }

        /* リストを使い、上と同じことをする。 */
        List<Animal> animals1 = new ArrayList<>();
        animals1.add(new Cat());
        animals1.add(new Dog());
        animals1.add(new Cat());
        for (Animal a : animals1) {
            a.makeSound();
        }


        System.out.println();

        for (int i = 0; i < animals1.size(); i++) {
            animals1.get(i).makeSound();
        }
    }
}
