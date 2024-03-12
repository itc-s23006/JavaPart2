package s23006_RyuKiyuna;

// メインクラス
public class MathPracticeApp {
    public static void main(String[] args) {
        MathProblemGenerator problemGenerator = new MathProblemGenerator();
        MathProblemSolver problemSolver = new MathProblemSolver();

        int numberOfProblems = 5;
        int points = 0;

        System.out.println("=== 掛け算ゲーム開始! 5問の問題に答えてね。 ===");

        // 問題を出題し、解答を受け取る
        for (int i = 0; i < numberOfProblems; i++) {
            String problem = problemGenerator.generateMultiplicationProblem();
            int correctAnswer = problemSolver.solveProblem(problem);

            // 正誤判定
            if (correctAnswer == Integer.parseInt(problem.split(" × ")[0]) * Integer.parseInt(problem.split(" × ")[1])) {
                System.out.println("正解！ポイント +1");
                points++;
            } else {
                System.out.println("不正解。正解は " + (Integer.parseInt(problem.split(" × ")[0]) * Integer.parseInt(problem.split(" × ")[1])) + " です。\n");
            }
        }

        // 最終的なポイントを表示
        System.out.println("=== 掛け算ゲーム終了 ===");
        System.out.println("獲得ポイント: " + points);
        System.out.println("掛け算ゲームを終了しました。");
    }
}