package sample2;

public class UniversityStudent extends Student {

    public UniversityStudent(int count) {
        lessonCount = count;
    }
    @Override
    public void calcLessonTime() {
        /* 授業時間を算出して、lessonTimeに代入する。
         * 大学生の場合、1コマ90分。
        * 授業回数で掛けて、授業時間を求める。 */
        lessonTime = lessonCount = 90;
    }
}
