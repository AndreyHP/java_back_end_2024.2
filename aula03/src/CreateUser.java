public class CreateUser {
    static User[] users = new User[5];
    public static void create(String name, int age, int index){

        int i = index;

        for (int j = 1; j < 5; j++) {
            users[j] = new User();
        }

        users[i + 1].name = name;
        users[i + 1].age = age;

    }
}
