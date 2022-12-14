package org.campus02.collectionsAPI;

public class DemoApp {
    public static void main(String[] args) {
        EventCalender eventCalender = new EventCalender();
        eventCalender.add(new Event("David Haselhoff", "Graz", 69));
        eventCalender.add(new Event("David Haselhoff", "Schladming", 79));
        eventCalender.add(new Event("Spnge Bob Musical","Graz",39));
        eventCalender.add(new Event("Grundlagen Softwareentwicklung Klausur", "Graz", 0));

        eventCalender.printEvents();

        System.out.println("eventCalender.findByTitle(\"David Haselhoff\") = " + eventCalender.findByTitle("David Haselhoff"));
        System.out.println("eventCalender = " + eventCalender.findByTitle("U2"));

        System.out.println("eventCalender = " + eventCalender.getByLocation("Graz"));

        System.out.println("eventCalender.getMostExpensiveByOrt(\"Graz\") = " + eventCalender.getMostExpensiveByOrt("Graz"));

        System.out.println("eventCalender.getCountEventsByLocation() = " + eventCalender.getCountEventsByLocation());
    }
}
