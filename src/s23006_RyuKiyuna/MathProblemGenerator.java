package s23006_RyuKiyuna;

import java.util.Random;

// 問題を生成するクラス
class MathProblemGenerator {
    private Random random;

    public MathProblemGenerator() {
        this.random = new Random();
    }

    // 乱数を使って掛け算の問題を生成
    public String generateMultiplicationProblem() {
        int operand1 = random.nextInt(10) + 1;  // 1から10までの乱数
        int operand2 = random.nextInt(10) + 1;

        return operand1 + " × " + operand2;
    }
}