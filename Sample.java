import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sample {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "indar", new Date()));
        list.add(new User(2, "Arun", new Date()));
        list.add(new User(3, "Talk", new Date()));

        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.removeAll(list);
        System.out.println(list);
        list.add(new User(4, "JK", new Date()));
        System.out.println(list);

        System.out.println(list.isEmpty());


        User user = new User();
        user.setId(1);
        user.setName("indar");
        user.setBirthDate(new Date());
        String str = user.getId() + "-->" + user.getName() + "-->" + user.getBirthDate();
        System.out.println(str);


    }

    List<User> users = new ArrayList<>();

    public List<User> findAll() {
        System.out.println(users);
        return users;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                System.out.println(user);
                return user;
            }
        }
        return null;
    }
}
