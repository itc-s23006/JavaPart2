package sample2;

public abstract class Student {
    protected int lessonTime; // 授業時間
    protected int lessonCount; // 授業回数

    public int getLessonTime() {
        return lessonTime;
    }

    public abstract void calcLessonTime();
}
