package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WaterThermometer implements EventManager {

    private List<EventListener> listeners = new ArrayList<>();
    private Random randGen = new Random();
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void measureTemperature() {
        this.temperature = randGen.nextInt(45);
        System.out.println("Temperature is " + temperature + " degrees!");
        notifyListeners();
    }

    public void addListener(EventListener listener) {
        listeners.add(listener);
    }

    public void notifyListeners() {
        listeners.forEach(listener -> listener.update("temperatureChanged", getTemperature()));
    }

}
