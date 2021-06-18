package observer;

public class DeepBlueSeaTester {
    public static void main(String[] args) {
        WaterThermometer thermo = new WaterThermometer();
        thermo.addListener(new Sharky("Vasiliy"));
        thermo.addListener(new Sharky("Pyotr"));
        thermo.addListener(new Sharky("Valeriy"));
        thermo.addListener(new Walrus("Afanasiy"));
        thermo.addListener(new Walrus("Vladimir"));
        thermo.addListener(new Walrus("Sergey"));

        for (int i = 0; i < 10; i++) {
            thermo.measureTemperature();
        }
    }
}
