package exercise5;

public class Test1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
    }
}

class Animal {
    void makeSound() {
        System.out.println("動物が鳴く。");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("猫が鳴く。");
    }
}
