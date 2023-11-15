package chapter8_2;

public class Generalmember {
    private long id;
    private String name;
    private Lesson lesson;

    public Generalmember(long id, String name, Lesson lesson) {
        this.id = id;
        this.name = name;
        this.lesson = lesson;
    }

    public int membershipFee() {
        return 1000;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
