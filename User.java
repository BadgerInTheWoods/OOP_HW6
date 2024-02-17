package homework;

public class User{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void save(){
        UserSaver us = new UserSaver(this);
        us.save();
    }

    public void report(){
        UserReporter ur = new UserReporter(this);
        ur.report();
    }
}
