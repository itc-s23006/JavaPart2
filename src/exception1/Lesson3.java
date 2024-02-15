package exception1;

public class Lesson3 {
    public static void main(String[] args) {
        try {
            generateNumber();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void generateNumber() throws Exception {
        /* int n = (int) (Math.random() * 100); */
        int n = 13;
        if (n == 13) {
            throw new Exception("アンラッキー");
        }
    }
}
