package map.ordering;


public class Event {

    private final String eventName;
    private final String featuring;

    public Event(String eventName, String featuring) {
        this.eventName = eventName;
        this.featuring = featuring;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", featuring='" + featuring + '\'' +
                '}' + '\n' ;
    }
}
