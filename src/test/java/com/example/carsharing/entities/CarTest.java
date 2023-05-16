package com.example.carsharing.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CarTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Car#Car()}
     *   <li>{@link Car#setId(Long)}
     *   <li>{@link Car#setModel(String)}
     *   <li>{@link Car#setNumber(int)}
     *   <li>{@link Car#setOdometr(int)}
     *   <li>{@link Car#setTravels(List)}
     *   <li>{@link Car#setVin(String)}
     *   <li>{@link Car#toString()}
     *   <li>{@link Car#getId()}
     *   <li>{@link Car#getModel()}
     *   <li>{@link Car#getNumber()}
     *   <li>{@link Car#getOdometr()}
     *   <li>{@link Car#getTravels()}
     *   <li>{@link Car#getVin()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Car actualCar = new Car();
        actualCar.setId(1L);
        actualCar.setModel("Model");
        actualCar.setNumber(10);
        actualCar.setOdometr(1);
        ArrayList<Travel> travels = new ArrayList<>();
        actualCar.setTravels(travels);
        actualCar.setVin("Vin");
        String actualToStringResult = actualCar.toString();
        assertEquals(1L, actualCar.getId().longValue());
        assertEquals("Model", actualCar.getModel());
        assertEquals(10, actualCar.getNumber());
        assertEquals(1, actualCar.getOdometr());
        assertSame(travels, actualCar.getTravels());
        assertEquals("Vin", actualCar.getVin());
        assertEquals("Car{id=1, vin='Vin', number=10, model='Model', odometr=1}", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Car#Car(String, int, String, int)}
     *   <li>{@link Car#setId(Long)}
     *   <li>{@link Car#setModel(String)}
     *   <li>{@link Car#setNumber(int)}
     *   <li>{@link Car#setOdometr(int)}
     *   <li>{@link Car#setTravels(List)}
     *   <li>{@link Car#setVin(String)}
     *   <li>{@link Car#toString()}
     *   <li>{@link Car#getId()}
     *   <li>{@link Car#getModel()}
     *   <li>{@link Car#getNumber()}
     *   <li>{@link Car#getOdometr()}
     *   <li>{@link Car#getTravels()}
     *   <li>{@link Car#getVin()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Car actualCar = new Car("Vin", 10, "Model", 1);
        actualCar.setId(1L);
        actualCar.setModel("Model");
        actualCar.setNumber(10);
        actualCar.setOdometr(1);
        ArrayList<Travel> travels = new ArrayList<>();
        actualCar.setTravels(travels);
        actualCar.setVin("Vin");
        String actualToStringResult = actualCar.toString();
        assertEquals(1L, actualCar.getId().longValue());
        assertEquals("Model", actualCar.getModel());
        assertEquals(10, actualCar.getNumber());
        assertEquals(1, actualCar.getOdometr());
        assertSame(travels, actualCar.getTravels());
        assertEquals("Vin", actualCar.getVin());
        assertEquals("Car{id=1, vin='Vin', number=10, model='Model', odometr=1}", actualToStringResult);
    }
}

