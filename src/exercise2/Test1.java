package exercise2;

public class Test1 {
    public static void main(String[] args) {
        KaKi();
        Test1 t = new Test1();
        t.KaKi2();

        // １台目
        Car c = new Car();
        c.accelerate();
        Car.count();
        c.show();

        // ２台目
        Car c2 = new Car();
        c2.accelerate();
        Car.count();
        c2.show();
    }
    public static void KaKi(){
        System.out.println("KaKi");
    }
    public void KaKi2(){
        System.out.println("かき");
    }
}
