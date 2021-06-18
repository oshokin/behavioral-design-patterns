package responsibility.chain;

public class ByteBufferToString extends Handler {

    private boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }

    public boolean process(Object message) {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Surprise, motherfucker!");
        }
        boolean isSomethingWrong = getRandomBoolean();
        if (!isSomethingWrong) return false;
        return processNext(message);
    }

}