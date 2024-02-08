package sample2;

public class UniversityStudent extends Student implements Work{
    protected int workTime; // 労働時間
    protected int income; // 給与

    public UniversityStudent(int count, int wt) {
        lessonCount = count;
        workTime = wt;
    }

    /* 授業　*/
    @Override
    public void calcLessonTime() {

        /* 授業時間を算出して、lessonTimeに代入する。
         * 大学生の場合、1コマ90分。
        * 授業回数で掛けて、授業時間を求める。 */
        lessonTime = lessonCount * 90;
    }

    /* 労働　*/
    public void calcIncome() {
        income = 1100 * workTime;
    }

    public int getIncome() {
        return income;
    }
}
