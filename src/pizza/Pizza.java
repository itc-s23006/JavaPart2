package pizza;

public abstract class Pizza {

    /* フィールドは何が必要? */
    int id; // ピザのID
    String name; // ピザの名前
    int price; // ピザの値段

    public void baking() {
        System.out.println(name + "を作っています...");
    }

    public void cutting() {
        System.out.println(name + "をカットしています...");
    }

    public void boxing() {
        System.out.println(name + "を箱に入れています...");
    }
    public void compleated() {
        System.out.println("出来上がりました!");
    }
}
