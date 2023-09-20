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
        if (!eventSchedule.isEmpty()){
            for (Map.Entry<LocalDate, Event> entry : eventSchedule.entrySet()){
                System.out.println("Data: " + entry.getKey() + " |" +
                        " Evento: " + entry.getValue().getEventName() + " |" +
                        " Atrações: " + entry.getValue().getFeaturing()
                );
            }
        }else {
            System.out.println("Nenhum evento disponível");
        }
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
        Set<String> artistsOfDayOne = new HashSet<>();
        Set<String> artistsOfDayTwo = new HashSet<>();
        Set<String> artistsOfDayThree = new HashSet<>();

        artistsOfDayOne.add("MC Paiva");
        artistsOfDayOne.add("Oruan");
        artistsOfDayOne.add("Cabelihno");
        artistsOfDayTwo.add("MC Poze");
        artistsOfDayTwo.add("Gaab");
        artistsOfDayTwo.add("Orochi");
        artistsOfDayThree.add("Ferrugem");
        artistsOfDayThree.add("Sorriso Maroto");
        artistsOfDayThree.add("Thiaguinho");

        es.addEvent(LocalDate.parse("30/11/2023",DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Explode Funk", artistsOfDayOne);
        es.addEvent(LocalDate.parse("25/12/2023",DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Cidade Nova", artistsOfDayTwo);
        es.addEvent(LocalDate.parse("25/11/2023",DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Pagode de Elite", artistsOfDayThree);

        es.showEvents();
        System.out.println(es.getNextEvent());
    }
}
