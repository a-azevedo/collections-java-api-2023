package map.ordering;

public class Event {

    private String eventName;
    private String featuring;

    public Event(String eventName, String featuring) {
        this.eventName = eventName;
        this.featuring = featuring;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", featuring='" + featuring + '\'' +
                '}';
    }

    public String getEventName() {
        return eventName;
    }

    public String getFeaturing() {
        return featuring;
    }
}
