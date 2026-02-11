package Observer.src;

public class Client implements Observer {

    private final String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification pour " + name + " : " + message);
    }
}
