package observer;

public class Walrus implements EventListener {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Walrus(String name) {
        this.name = name;
    }

    @Override
    public void update(String eventType, Object data) {
        if (eventType.equals("temperatureChanged")) {
            int temperature = ((Integer) data);
            if (temperature < 10) System.out.println("Walrus " + name + " says: It's time to make a snowman! Awww, I love snowballs!");
            else if (temperature < 20) System.out.println("Walrus " + name + " says: Global warming? Nope, haven't heard of it.");
            else if (temperature < 30) System.out.println("Walrus " + name + " says: I want to go to my mom!");
        } else {
            System.out.println("Walrus " + name + " says: Event is " + eventType + ". I don't give a duck!");
        }
    }

}
