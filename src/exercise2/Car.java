package exercise2;

public class Car {
    double speed = 0.0;
    static int total = 0;

    public void accelerate(){
        speed += 1.0;
    }

    public static void count(){
        total++;
    }
    public void show(){
        System.out.println("speed:" + speed);
        System.out.println("total:" + total);
    }
}
