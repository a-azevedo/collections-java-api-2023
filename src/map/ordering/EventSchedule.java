package map.ordering;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class EventSchedule {

    private final Map<LocalDate, Event> eventSchedule;

    public EventSchedule(){
        eventSchedule = new TreeMap<>();
    }

    public void addEvent(LocalDate eventDate, String name, Set<String> featuring){
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
        Set<String> artists = new HashSet<>();
        Set<String> artists2 = new HashSet<>();
        Set<String> artists3 = new HashSet<>();

        artists.add("MC Paiva");
        artists.add("Oruan");
        artists.add("Cabelihno");
        artists2.add("MC Poze");
        artists2.add("Gaab");
        artists2.add("Orochi");
        artists3.add("Ferrugem");
        artists3.add("Sorriso Maroto");
        artists3.add("Thiaguinho");

        es.addEvent(LocalDate.parse("30/11/2023",DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Explode Funk", artists);
        es.addEvent(LocalDate.parse("25/12/2023",DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Cidade Nova", artists2);
        es.addEvent(LocalDate.parse("25/11/2023",DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Pagode de Elite", artists3);

        es.showEvents();
        System.out.println(es.getNextEvent());
    }
}
