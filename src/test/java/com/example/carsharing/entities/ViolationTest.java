package com.example.carsharing.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;

class ViolationTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Violation#Violation()}
     *   <li>{@link Violation#setId(Long)}
     *   <li>{@link Violation#setPerson(Person)}
     *   <li>{@link Violation#setViolation_date(Date)}
     *   <li>{@link Violation#setViolation_name(String)}
     *   <li>{@link Violation#toString()}
     *   <li>{@link Violation#getId()}
     *   <li>{@link Violation#getPerson()}
     *   <li>{@link Violation#getViolation_date()}
     *   <li>{@link Violation#getViolation_name()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Violation actualViolation = new Violation();
        actualViolation.setId(1L);
        Person person = new Person("Name", 1, 1);

        actualViolation.setPerson(person);
        Date violation_date = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualViolation.setViolation_date(violation_date);
        actualViolation.setViolation_name("Violation name");
        actualViolation.toString();
        assertEquals(1L, actualViolation.getId().longValue());
        assertSame(person, actualViolation.getPerson());
        assertSame(violation_date, actualViolation.getViolation_date());
        assertEquals("Violation name", actualViolation.getViolation_name());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Violation#Violation(String)}
     *   <li>{@link Violation#setId(Long)}
     *   <li>{@link Violation#setPerson(Person)}
     *   <li>{@link Violation#setViolation_date(Date)}
     *   <li>{@link Violation#setViolation_name(String)}
     *   <li>{@link Violation#toString()}
     *   <li>{@link Violation#getId()}
     *   <li>{@link Violation#getPerson()}
     *   <li>{@link Violation#getViolation_date()}
     *   <li>{@link Violation#getViolation_name()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Violation actualViolation = new Violation("Violation name");
        actualViolation.setId(1L);
        Person person = new Person("Name", 1, 1);

        actualViolation.setPerson(person);
        Date violation_date = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualViolation.setViolation_date(violation_date);
        actualViolation.setViolation_name("Violation name");
        actualViolation.toString();
        assertEquals(1L, actualViolation.getId().longValue());
        assertSame(person, actualViolation.getPerson());
        assertSame(violation_date, actualViolation.getViolation_date());
        assertEquals("Violation name", actualViolation.getViolation_name());
    }
}

