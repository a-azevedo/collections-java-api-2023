package map.ordering;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class EventSchedule {

    private final Map<LocalDate, Event> eventSchedule;

    public EventSchedule(){
        eventSchedule = new TreeMap<>();
    }

    public void addEvent(LocalDate eventDate, String name, String featuring){
        eventSchedule.put(eventDate, new Event(name, featuring));
    }

    public void showEvents(){
        System.out.println(eventSchedule);
    }

    public Event getNextEvent(){
        Event nextEvent = null;
        if (!eventSchedule.isEmpty()){
            for (Map.Entry<LocalDate, Event> entry : eventSchedule.entrySet()){
                if (entry.getKey().isAfter(LocalDate.now())){
                    nextEvent = entry.getValue();
                    break;
                }
            }
        }
        return nextEvent;
    }

    public static void main(String[] args) {

        EventSchedule es = new EventSchedule();

        es.addEvent(LocalDate.parse("30/11/2023",DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Anivesário", "Aelmajan");
        es.addEvent(LocalDate.parse("25/12/2023",DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Natal", "Papai Noel");
        es.addEvent(LocalDate.parse("25/11/2023",DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Aniversário", "Antonio");
        es.addEvent(LocalDate.parse("11/10/2023",DateTimeFormatter.ofPattern("dd/MM/yyyy")), "ExpoFunk", "MC Paiva");

        es.showEvents();
        System.out.println(es.getNextEvent());
    }
}
