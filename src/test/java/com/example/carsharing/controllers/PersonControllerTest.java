package com.example.carsharing.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.carsharing.exeptions.PersonNotFoundException;
import com.example.carsharing.repositories.PersonRepository;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

class PersonControllerTest {
    /**
     * Method under test: {@link PersonController#all(Model)}
     */
    @Test
    void testAll() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        PersonRepository repository = mock(PersonRepository.class);
        when(repository.findAll()).thenReturn(new ArrayList<>());
        PersonController personController = new PersonController(repository);
        assertEquals("persons", personController.all(new ConcurrentModel()));
        verify(repository).findAll();
    }

    /**
     * Method under test: {@link PersonController#all(Model)}
     */
    @Test
    void testAll2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        PersonRepository repository = mock(PersonRepository.class);
        when(repository.findAll()).thenThrow(new PersonNotFoundException(1L));
        PersonController personController = new PersonController(repository);
        assertThrows(PersonNotFoundException.class, () -> personController.all(new ConcurrentModel()));
        verify(repository).findAll();
    }
}

