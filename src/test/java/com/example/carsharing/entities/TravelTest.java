package com.example.carsharing.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;

class TravelTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Travel#Travel()}
     *   <li>{@link Travel#setCar(Car)}
     *   <li>{@link Travel#setId(Long)}
     *   <li>{@link Travel#setPerson(Person)}
     *   <li>{@link Travel#setTravel_cost(String)}
     *   <li>{@link Travel#setTravel_date(Date)}
     *   <li>{@link Travel#setTravel_date(LocalDate)}
     *   <li>{@link Travel#toString()}
     *   <li>{@link Travel#getCar()}
     *   <li>{@link Travel#getId()}
     *   <li>{@link Travel#getPerson()}
     *   <li>{@link Travel#getTravel_cost()}
     *   <li>{@link Travel#getTravel_date()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Travel actualTravel = new Travel();
        Car car = new Car("Vin", 10, "Model", 1);

        actualTravel.setCar(car);
        actualTravel.setId(1L);
        Person person = new Person("Name", 1, 1);

        actualTravel.setPerson(person);
        actualTravel.setTravel_cost("Travel cost");
        Date travel_date = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualTravel.setTravel_date(travel_date);
        actualTravel.setTravel_date(LocalDate.of(1970, 1, 1));
        actualTravel.toString();
        assertSame(car, actualTravel.getCar());
        assertEquals(1L, actualTravel.getId().longValue());
        assertSame(person, actualTravel.getPerson());
        assertEquals("Travel cost", actualTravel.getTravel_cost());
        assertSame(travel_date, actualTravel.getTravel_date());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Travel#Travel(String, Date)}
     *   <li>{@link Travel#setCar(Car)}
     *   <li>{@link Travel#setId(Long)}
     *   <li>{@link Travel#setPerson(Person)}
     *   <li>{@link Travel#setTravel_cost(String)}
     *   <li>{@link Travel#setTravel_date(Date)}
     *   <li>{@link Travel#setTravel_date(LocalDate)}
     *   <li>{@link Travel#toString()}
     *   <li>{@link Travel#getCar()}
     *   <li>{@link Travel#getId()}
     *   <li>{@link Travel#getPerson()}
     *   <li>{@link Travel#getTravel_cost()}
     *   <li>{@link Travel#getTravel_date()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Travel actualTravel = new Travel("Travel cost",
                Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        Car car = new Car("Vin", 10, "Model", 1);

        actualTravel.setCar(car);
        actualTravel.setId(1L);
        Person person = new Person("Name", 1, 1);

        actualTravel.setPerson(person);
        actualTravel.setTravel_cost("Travel cost");
        Date travel_date = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualTravel.setTravel_date(travel_date);
        actualTravel.setTravel_date(LocalDate.of(1970, 1, 1));
        actualTravel.toString();
        assertSame(car, actualTravel.getCar());
        assertEquals(1L, actualTravel.getId().longValue());
        assertSame(person, actualTravel.getPerson());
        assertEquals("Travel cost", actualTravel.getTravel_cost());
        assertSame(travel_date, actualTravel.getTravel_date());
    }
}

