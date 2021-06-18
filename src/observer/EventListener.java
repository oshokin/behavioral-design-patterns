package observer;

public interface EventListener {
    void update(String eventType, Object data);
}