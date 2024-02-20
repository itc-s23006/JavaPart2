package interface2;

public class ElectronicMoney implements PaymentalStrategy {
    @Override
    public void processPayment() {
        System.out.println("端末にかざしてください。");
    }

    @Override
    public String getName() {
        return "電子マネー";
    }
}
