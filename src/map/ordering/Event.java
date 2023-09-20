package map.ordering;


import java.util.Set;

public class Event {

    private final String eventName;
    private final Set<String> featuring;

    public Event(String eventName, Set<String> featuring) {
        this.eventName = eventName;
        this.featuring = featuring;
    }

    @Override
    public String toString() {
        return "Evento: " +
                eventName +
                ", Atrações: '" + featuring
                + '\n' ;
    }

    public String getEventName() {
        return eventName;
    }

    public Set<String> getFeaturing() {
        return featuring;
    }
}
