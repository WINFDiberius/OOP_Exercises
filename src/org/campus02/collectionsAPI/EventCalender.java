package org.campus02.collectionsAPI;

import java.util.ArrayList;
import java.util.HashMap;

public class EventCalender {
    private ArrayList<Event> events;

    public EventCalender() {
        this.events = new ArrayList<>();
    }

    public void add(Event newEvents){
        events.add(newEvents);
    }

    public void printEvents() {
        for (Event e:
             events) {
            System.out.println("e.toString() = " + e.toString());

        }
    }

    public Event findByTitle(String title){
        for(Event e : events){
            if(e.getTitle().equals(title)){
                // hurra, event gefunden
                return e;
            // wir müssen nicht mehr weitersuchen
            }
        }
            return null;
    }


    public ArrayList<Event> getByLocation(String location){
        ArrayList<Event> result = new ArrayList<>();
        for(Event e:events){
            if(e.getLocation().equals(location)){
                result.add(e);
            }
        }
        return result;
    }

    public Event getMostExpensiveByOrt(String location){
        ArrayList<Event> eventInLocation = getByLocation(location);

        double maxPrice = Double.MIN_VALUE;
        for(Event e:eventInLocation)
        {
            if(e.getPrice() > maxPrice){
                maxPrice = e.getPrice();
            }
        }
        //maxPrice == 69
        for(Event e : eventInLocation){
            if(e.getPrice() == maxPrice){
                return e;
            }
        }
        return null;
    }

    public HashMap<String, Integer> getCountEventsByLocation(){
        // je Location, die Anzahl der Events
        HashMap<String, Integer> result = new HashMap<>();

        //1. List durchlaufen
        for (Event e:events){
            if(result.containsKey(e.getLocation())){
                //Ist für diese Location schon ein Eintrag in der Map?
                // JA
                // 3. auslesen, modifizieren, speichern
                Integer count = result.get(e.getLocation()); //wieviele Events sind schon gezählt
                count++;
                result.put(e.getLocation(),count);
            }
            else{
                //Ist für diese Location schon ein Eintrag in der Map?
                //NEIN
                // 2. Element hinzufügen (Startwert)
                result.put(e.getLocation(), 1);
            }
        }


        return result;
    }

}
