package com.example.carsharing.controllers;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.carsharing.entities.Violation;
import com.example.carsharing.exeptions.ViolationNotFoundException;
import com.example.carsharing.repositories.ViolationRepository;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ViolationControllerTest {
    /**
     * Method under test: {@link ViolationController#all()}
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

        ViolationRepository repository = mock(ViolationRepository.class);
        ArrayList<Violation> violationList = new ArrayList<>();
        when(repository.findAll()).thenReturn(violationList);
        List<Violation> actualAllResult = (new ViolationController(repository)).all();
        assertSame(violationList, actualAllResult);
        assertTrue(actualAllResult.isEmpty());
        verify(repository).findAll();
    }

    /**
     * Method under test: {@link ViolationController#all()}
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

        ViolationRepository repository = mock(ViolationRepository.class);
        when(repository.findAll()).thenThrow(new ViolationNotFoundException(1L));
        assertThrows(ViolationNotFoundException.class, () -> (new ViolationController(repository)).all());
        verify(repository).findAll();
    }
}

