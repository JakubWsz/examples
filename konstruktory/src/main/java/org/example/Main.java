package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();

        Address address2 = new Address("Warszawa", "00-001", "Grzybowska",
                "123B", "12");

        Person person = new Person();

        person.setFirstname("Jan");
        person.setLastname("Kowalski");

        Person person1 = new Person("asd1-asf12-dasd-2", "Jan", "Kowalski", LocalDate.of(1996, 2, 13),
                address2, "jak.kowalski@gmail.com", "+48123123123");

        Person person2 = new Person("Jan", "Kowalski", LocalDate.of(1996, 2, 13),
                generateAddress(), "jak.kowalski@gmail.com", "+48123123123");

        Person person3 = new Person();

        System.out.println("<====================================================>");
        System.out.println(person);
        System.out.println("<====================================================>");
        System.out.println(person1);
        System.out.println("<====================================================>");
        System.out.println(person2);
        System.out.println("<====================================================>");

        //przeciążanie metod
        long number = Math.multiplyExact(1L, 4);
        long number2 = Math.multiplyExact(1L, 4L);

        person.updatePerson("Jan");
        person.updatePerson("Jan", "Kowalski");

    }

    private static Address generateAddress() {
        return new Address("Warszawa", "00-001", "Grzybowska",
                "123B", "12");
    }
}