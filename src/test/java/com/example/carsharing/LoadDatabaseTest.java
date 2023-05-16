package com.example.carsharing;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.carsharing.entities.Car;
import com.example.carsharing.entities.Person;
import com.example.carsharing.entities.Travel;
import com.example.carsharing.entities.Violation;
import com.example.carsharing.repositories.CarRepository;
import com.example.carsharing.repositories.PersonRepository;
import com.example.carsharing.repositories.TravelRepository;
import com.example.carsharing.repositories.ViolationRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LoadDatabaseTest {
    /**
     * Method under test: {@link LoadDatabase#initDatabase(PersonRepository, ViolationRepository, TravelRepository, CarRepository)}
     */
    @Test
    void testInitDatabase() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        LoadDatabase loadDatabase = new LoadDatabase();
        PersonRepository personRepository = mock(PersonRepository.class);
        when(personRepository.save(Mockito.<Person>any())).thenReturn(new Person("Name", 1, 1));
        ViolationRepository violationRepository = mock(ViolationRepository.class);
        when(violationRepository.save(Mockito.<Violation>any())).thenReturn(new Violation("Violation name"));
        TravelRepository travelRepository = mock(TravelRepository.class);
        when(travelRepository.save(Mockito.<Travel>any())).thenReturn(new Travel());
        CarRepository carRepository = mock(CarRepository.class);
        when(carRepository.save(Mockito.<Car>any())).thenReturn(new Car("Vin", 10, "Model", 1));
        loadDatabase.initDatabase(personRepository, violationRepository, travelRepository, carRepository).run("foo");
        verify(personRepository, atLeast(1)).save(Mockito.<Person>any());
        verify(violationRepository, atLeast(1)).save(Mockito.<Violation>any());
        verify(travelRepository, atLeast(1)).save(Mockito.<Travel>any());
        verify(carRepository, atLeast(1)).save(Mockito.<Car>any());
    }
}

