package observer;

public class Sharky implements EventListener {
    private String name;

    public Sharky(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String eventType, Object data) {
        if (eventType.equals("temperatureChanged")) {
            int temperature = ((Integer) data);
            if (temperature < 10) System.out.println("Sharky " + name + " says: Shit, it's getting really cold over there. Gotta eat some diver!");
            else if (temperature < 20) System.out.println("Sharky " + name + " says: Okay, now I know how mammoths felt before extinction!");
            else if (temperature < 30) System.out.println("Sharky " + name + " says: Stop! Tanning time!");
        } else {
            System.out.println("Sharky " + name + " says: Event is " + eventType + ". I don't give a duck!");
        }
    }

}
