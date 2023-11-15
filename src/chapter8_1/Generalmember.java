package chapter8_1;

public class Generalmember {
    private long id;
    private String name;

    public Generalmember(long id, String name) {
        this.id = id;
        this.name = name;
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
