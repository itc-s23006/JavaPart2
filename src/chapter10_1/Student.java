package chapter10_1;

import chapter9_1.StudentMember;

import java.time.LocalDate;

public class Student extends User implements Attendable {
    private LocalDate expDate;
    public Student(int id, String name, String mail, int role, LocalDate expDate) {
        super(id, name, mail, role);
        this.expDate = expDate;
    }
    public boolean isExpired() {
        LocalDate today = LocalDate.now();
        return today.isAfter(expDate);
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    @Override
    public void writeAttendance() {
        System.out.println("出席報告を完了しました");

    }

    @Override
    public void readAttendance() {
        System.out.println("出席情報を読み込みました");
    }
}
