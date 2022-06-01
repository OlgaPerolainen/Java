package Lab9.Ex4;

import java.util.Map;

public class UserMethods {
    public static void createUsersAndScores(Map<User, Integer> sourceMap) {
        String[] names = {"Aaron", "Abraham", "Ace", "Adam",
                "Bailey", "Barney", "Barry",
                "Connell", "Conner", "Connolly", "Connor",
                "Derek", "Derick", "Derin", "Dermot", "Derren",
                "George", "Georgia", "Georgy", "Gerard",
                "Henry", "Herbert", "Heyden", "Hiro",
                "Jamal", "Jameel", "Jameil", "James",
                "Kieryn", "Kile", "Killian", "Kimi", "Kingston",
                "Lawlyn", "Lawrence", "Lawrie", "Lawson", "Layne", "Layton", "Lee",
                "Mark", "Marko", "Markus", "Marley", "Marlin"};

        for (String name : names) {
            User newUser = new User();
            newUser.setName(name);
            sourceMap.put(newUser, (int) (Math.random() * 100));
        }
    }

    public static void searchForUserScores(String name, Map<User, Integer> sourceMap) {
        for (Map.Entry<User, Integer> oneUser : sourceMap.entrySet()) {
            if (oneUser.getKey().getName().equalsIgnoreCase(name)) {
                System.out.println("Player " + oneUser.getKey() + " got " + oneUser.getValue() + " scores");
            }
        }
    }
}
