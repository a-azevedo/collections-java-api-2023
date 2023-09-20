package map.ordering;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Map;
import java.util.TreeMap;

public class EventSchedule {

    private Map<LocalDate, Event> eventSchedule;

    public EventSchedule(){
        eventSchedule = new TreeMap<>();
    }

    public void addEvent(LocalDate eventDate, String name, String featuring){
        eventSchedule.put(eventDate, new Event(name, featuring));
    }

    public static void main(String[] args) {
        EventSchedule es = new EventSchedule();
        es.addEvent(LocalDate.parse("30/11/1987",DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Anivesário", "Aelmajan");
        System.out.println(es.eventSchedule);
    }
}
