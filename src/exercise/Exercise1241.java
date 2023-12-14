package exercise;

import java.util.HashMap;

public class Exercise1241 {
    public static void main(String[] args) {
        var map = new HashMap<String, User>();
        User u1 = new User("ab123", "田中宏");
        User u2 = new User("ab224", "佐藤修");
        User u3 = new User("ac331", "木村正一");

        map.put("ab123", u1);
        map.put("ab224", u2);
        map.put("ac331", u3);

        System.out.println(map.get("ab224"));
    }
}
