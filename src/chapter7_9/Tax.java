package chapter7_9;

public final class Tax {
    private  final Id id;
    private final int shotoku; // 所得額
    private final int koujo; // 控除額

    public Tax(Id id, int shotoku, int koujo) {
        this.id = new Id(id.getNumber(), id.getName());
        this.shotoku = shotoku;
        this.koujo = koujo;
    }

    public int zeigaku() { // 所得税額を計算して返す
        return (int)((shotoku - koujo) * 0.1); // int型にキャスト
    }

    public Id getId() {
        return new Id(id.getNumber(), id.getName());
    }

    public int getShotoku() {
        return shotoku;
    }

    public int getKoujo() {
        return koujo;
    }


    @Override
    public String toString() {
        return "Tax{" +
                "id=" + id +
                ", shotoku=" + shotoku +
                ", koujo=" + koujo +
                '}';
    }
}

