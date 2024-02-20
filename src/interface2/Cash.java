package interface2;

public class Cash implements PaymentalStrategy {
    @Override
    public void processPayment() {
        System.out.println("現金をいれてください。");
    }

    @Override
    public String getName() {
        return "現金";
    }
}
