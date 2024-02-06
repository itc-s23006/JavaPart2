package exercise5;

public class Test3 {
    public static void main(String[] args) {
        /* 一般的なスポーツの試合人数はn人です。
        * サッカーの試合人数は11人です。*/
        Sports s = new Sports();
        s.display();

        Soccer sc = new Soccer();
        s.display();
    }
}

class Sports {
    String getName() {
        return "一般的なスポーツ";
    }

    void display() {
        System.out.println(getName() + "の試合人数はn人です。");

    }
}

class Soccer extends Sports {
    @Override
    String getName() {
        return "サッカー";
    }

    @Override
    void display() {
        System.out.println(getName() + "の試合人数は11人です。");
    }
}