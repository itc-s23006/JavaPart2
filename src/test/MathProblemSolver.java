package test;

import java.util.Scanner;

// 問題を解答するためのクラス
class MathProblemSolver {
    private Scanner scanner;

    public MathProblemSolver() {
        this.scanner = new Scanner(System.in);
    }

    // 問題を出題し、解答を受け取る
    public int solveProblem(String problem) {
        System.out.println("問題: " + problem + " = ?");
        System.out.print("答えを入力してください: ");

        // 解答を受け取る
        int userAnswer = scanner.nextInt();
        return userAnswer;
    }
}