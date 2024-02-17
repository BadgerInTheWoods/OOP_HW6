package homework;

public class UserSaver {
    private final User user;

    public UserSaver(User user){
        this.user = user;
    }

    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}
