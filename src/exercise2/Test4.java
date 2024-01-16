package exercise2;

public class Test4 {
    public static void main(String[] args) {
        /* ↓のpasswordにチェックするパスワードを入れる。 */
        String password = "KakiRyu28";

        /* 変数passwordが5文字以上かどうかチェックするメソッドを作る
         * 引数:password
         * 戻り値:boolean(正しいときtrue)
         */
        boolean isValuePassword = isPasswordValue(password);

        if (isValuePassword) {
            System.out.println("パスワードは5文字以上で、英字が2文字以上、数字が2つ以上含まれています。");
        } else {
            System.out.println("条件を満たしていないパスワードです。");
        }
    }

    /* パスワードが5文字以上かチェック　*/
    public static boolean isPasswordValue(String password) {
        if (password.length() < 5) {
            return false;
        }

        /* 英字が2文字以上入っているかチェック、入っていたらtrueを返す。
         * isLetterメソッドを使う。
         * 数字が2つ以上入っているかチェック、入っていたらtrueを返す。
         * isLetterメソッドと同様にその文字が数字化チェックするメソッドを作る。
         */
        int lettercount = 0;
        int digitcount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i))) {
                lettercount++;
            } else if (Character.isDigit(password.charAt(i))){
                digitcount++;
            }
        }
        /* 文字と数字が2文字以上入っているかチェック */
        return lettercount >= 2 && digitcount >= 2;
    }
}
