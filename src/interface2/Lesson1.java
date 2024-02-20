package interface2;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PaymentalStrategy[] options = new PaymentalStrategy[3];
        options[0] = new CreditCard();
        options[1] = new ElectronicMoney();
        options[2] = new Cash();

        /*
         * 標準入力で数値を受け取る。

         * お支払い方法を選んでください。
         * 1:クレジットカード
         * 2:電子マネー
         * 3:現金

         * 下記のメッセージを表示する。
         * クレジットカード番号を入力してください。
         * 端末にかざしてください。
         * 現金を入れてください。
         */
        System.out.println("お支払い方法を選んでください。");
        /* System.out.println("1: クレジットカード");
        System.out.println("2: 電子マネー");
        System.out.println("3: 現金"); */


        int num = sc.nextInt();

        PaymentProcessor p = new PaymentProcessor(options[num - 1]);
        p.pay();

            /* if (num == 1) {
                PaymentProcessor p = new PaymentProcessor(new CreditCard());
                p.pay();
            } else if (num == 2) {
                PaymentProcessor p = new PaymentProcessor(new ElectronicMoney());
                p.pay();
            } else if (num == 3) {
                PaymentProcessor p = new PaymentProcessor(new Cash());
                p.pay();
            }
        } */
        /* p.processPayment(num); */
    }
}

class PaymentProcessor {
    PaymentalStrategy ps;

    public PaymentProcessor(PaymentalStrategy ps) {
        this.ps = ps;
    }

    /* 支払い */
    public void pay() {
        ps.processPayment();
    }

    /* void processPayment(int num) {
         if (num == 1) {
            System.out.println("クレジットカード番号を入力してください。");
        } else if (num == 2) {
            System.out.println("端末にかざしてください。");
        } else if (num == 3) {
            System.out.println("現金を入れてください。");
        } */
}