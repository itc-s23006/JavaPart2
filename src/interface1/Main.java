package interface1;

public class Main {
    public static void main(String[] args) {
        System.out.println("キング");
        Player py = new King();
        py.setAt(new Punch());
        py.fight();

        System.out.println();

        /* クイーンとゆうしゃも同様に攻撃させる。
         * 新しいプレイヤーや攻撃方法を追加させる。
         */


        System.out.println("クイーン");
        Player pyq = new Queen();
        pyq.setAt(new Kick());
        pyq.fight();

        System.out.println();


        System.out.println("ゆうしゃ");
        Player pyb = new Brave();
        pyb.setAt(new Punch());
        pyb.setAt(new Kick());
        pyb.fight();
    }
}
