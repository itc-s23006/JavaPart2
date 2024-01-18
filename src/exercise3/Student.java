package exercise3;

import java.util.ArrayList;

public class Student {
    /* フィールド private
    * 名前
    * 学年(1, 2, 3)

    * Mike
    * A
    * 国語、社会

    * MainクラスでStudentオブジェクトを作り、各フィールドの値を書き換えたり参照できるようにする。

    * コース (数学、英語、国語、理科、社会)複数
    * 受講しているコースの数はわからない (固定ではない)
    * コース追加はコンストラクタではなく、メソッドを作ること。
    * 引数にコース名を設定 (1教科ずつ追加。)。
     */
    private int schoolyear;
    private String name;
    private ArrayList<String> courses;

    public Student(int schoolyear, String name) {
        this.schoolyear = schoolyear;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public int getSchoolyear() {
        return schoolyear;
    }

    public String getName() {
        return name;
    }


    public void tsuika(String kyouka){
        courses.add(kyouka);
    }
}
