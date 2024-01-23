package exercise3;

import java.util.ArrayList;

public class Book {
    /* フィールド
    * 名前　文字列
    * 作者　文字列
    * 価格　整数

    * すべての本のオブジェクトを格納するフィールド追加。
    * Book型のリストを作る。

    * そして、そのリストに追加できるメソッドが欲しい。
    * コンストラクタの引数で名前と作者と価格が入れられるようにする。

    * getterとsetterを作る。
     */
    private String name;
    private String sakusya;
    private int number;

    private ArrayList<Book> bookCollection;
    public Book(String name, String sakusya, int number) {
        this.name = name;
        this.sakusya = sakusya;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSakusya() {
        return sakusya;
    }

    public void setSakusya(String sakusya) {
        this.sakusya = sakusya;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
