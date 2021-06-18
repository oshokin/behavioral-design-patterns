package responsibility.chain;

public abstract class Handler {

    private Handler nextHandler;

    public Handler link(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public abstract boolean process(Object message);

    protected boolean processNext(Object message) {
        if (nextHandler == null) {
            return true;
        }
        return nextHandler.process(message);
    }

}