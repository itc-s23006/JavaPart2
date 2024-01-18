package exercise3;

public class Window {
    /* Windowsのクラスのオブジェクトを作り、
           このメインクラスからheightとwidthを変更できるようにする。
            */
    private int height;
    private int width;

    public Window(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
