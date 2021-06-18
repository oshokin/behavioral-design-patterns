package responsibility.chain;

public class StringToObject extends Handler {

    private boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }

    public boolean process(Object message) {
        for (int i = 0; i < 10000; i++) {
            System.out.println("How did you get so far??!! Hail the king of hackers!");
        }
        boolean isSomethingWrong = getRandomBoolean();
        if (!isSomethingWrong) return false;
        return processNext(message);
    }

}