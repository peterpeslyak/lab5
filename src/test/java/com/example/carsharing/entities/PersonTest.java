package com.example.carsharing.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PersonTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Person#Person()}
     *   <li>{@link Person#setAge(int)}
     *   <li>{@link Person#setExperience(int)}
     *   <li>{@link Person#setId(Long)}
     *   <li>{@link Person#setName(String)}
     *   <li>{@link Person#setViolations(List)}
     *   <li>{@link Person#toString()}
     *   <li>{@link Person#getAge()}
     *   <li>{@link Person#getExperience()}
     *   <li>{@link Person#getId()}
     *   <li>{@link Person#getName()}
     *   <li>{@link Person#getViolations()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Person actualPerson = new Person();
        actualPerson.setAge(1);
        actualPerson.setExperience(1);
        actualPerson.setId(1L);
        actualPerson.setName("Name");
        ArrayList<Violation> violations = new ArrayList<>();
        actualPerson.setViolations(violations);
        String actualToStringResult = actualPerson.toString();
        assertEquals(1, actualPerson.getAge());
        assertEquals(1, actualPerson.getExperience());
        assertEquals(1L, actualPerson.getId().longValue());
        assertEquals("Name", actualPerson.getName());
        assertSame(violations, actualPerson.getViolations());
        assertEquals("Person{id=1, name='Name', age=1, experience=1, violations=[]}", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Person#Person(String, int, int)}
     *   <li>{@link Person#setAge(int)}
     *   <li>{@link Person#setExperience(int)}
     *   <li>{@link Person#setId(Long)}
     *   <li>{@link Person#setName(String)}
     *   <li>{@link Person#setViolations(List)}
     *   <li>{@link Person#toString()}
     *   <li>{@link Person#getAge()}
     *   <li>{@link Person#getExperience()}
     *   <li>{@link Person#getId()}
     *   <li>{@link Person#getName()}
     *   <li>{@link Person#getViolations()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Person actualPerson = new Person("Name", 1, 1);
        actualPerson.setAge(1);
        actualPerson.setExperience(1);
        actualPerson.setId(1L);
        actualPerson.setName("Name");
        ArrayList<Violation> violations = new ArrayList<>();
        actualPerson.setViolations(violations);
        String actualToStringResult = actualPerson.toString();
        assertEquals(1, actualPerson.getAge());
        assertEquals(1, actualPerson.getExperience());
        assertEquals(1L, actualPerson.getId().longValue());
        assertEquals("Name", actualPerson.getName());
        assertSame(violations, actualPerson.getViolations());
        assertEquals("Person{id=1, name='Name', age=1, experience=1, violations=[]}", actualToStringResult);
    }
}

