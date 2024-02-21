package enum1;

import javax.swing.plaf.PanelUI;

public class Test2 {

    /* SMALL, MEDIUM, LARGE, EXTRALARGE */
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.order("EXTRASMALL");

        Drink drink1 = new Drink();
        drink1.order1(Size.LARGE);
    }
}

class Drink {
    /* public static final String SMALL = "SMALL";
    public static final String MEDIUM = "MEDIUM";
    public static final String LARGE = "LARGE";
    public static final String EXTRALARGE = "EXTRALARGE"; */

    void order(String size) {
        System.out.println(size + "が注文されました。");
    }

    /* 列挙型パターン。*/
    void order1(Size size) {
        System.out.println(size.name() + "が注文されました。");
    }
}

enum Size {
    SMALL,
    MEDIUM,
    LARGE,
    EXTRALARGE
}