package com.example.carsharing;

import com.example.carsharing.entities.Car;
import com.example.carsharing.entities.Person;
import com.example.carsharing.entities.Travel;
import com.example.carsharing.entities.Violation;
import com.example.carsharing.repositories.PersonRepository;
import com.example.carsharing.repositories.TravelRepository;
import com.example.carsharing.repositories.ViolationRepository;
import com.example.carsharing.repositories.CarRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(PersonRepository personRepository, ViolationRepository violationRepository, TravelRepository travelRepository,CarRepository carRepository) {
        return args -> {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

            Person person1 = new Person("Peter", 19, 1);
            log.info("Preloading " + personRepository.save(person1));
            Violation violation1 = new Violation("Speeding", new Date());
            violation1.setPerson(person1);
            log.info("Preloading " + violationRepository.save(violation1));

            Violation violation2 = new Violation("Speeding", new Date());
            violation2.setPerson(person1);
            log.info("Preloading " + violationRepository.save(violation2));

            Violation violation3 = new Violation("Parking", new Date());
            violation3.setPerson(person1);
            log.info("Preloading " + violationRepository.save(violation3));

            Car car1 = new Car( "ert345fert54t",10,"Geely Atlas Pro",10381);
            log.info("Preloading " + carRepository.save(car1));
            Car car2 = new Car( "ert34sdfsd345",12,"Tesla model X",1232);
            log.info("Preloading " + carRepository.save(car2));
            Car car3 = new Car( "ert3g55fsd345",13,"Tesla model S",700);
            log.info("Preloading " + carRepository.save(car3));

            Travel travel1 = new Travel("33",formatter.parse("07/01/2023"));
            travel1.setPerson(person1);
            travel1.setCar(car1);
            log.info("Preloading " + travelRepository.save(travel1));

            Travel travel2 = new Travel("40", new Date("02/04/2023"));
            travel2.setPerson(person1);
            travel2.setCar(car2);
            log.info("Preloading " + travelRepository.save(travel2));

            Travel travel3 = new Travel("45", new Date("09/05/2023"));
            travel2.setCar(car2);
            travel3.setPerson(person1);
            log.info("Preloading " + travelRepository.save(travel3));

            log.info("Preloading " + person1);

            Person person2 = new Person("Vasily", 51, 32);
            log.info("Preloading " + personRepository.save(person2));
            Travel travel4 = new Travel("12",formatter.parse("08/04/2023"));
            travel4.setCar(car3);
            travel4.setPerson(person2);
            log.info("Preloading " + travelRepository.save(travel4));

            Travel travel5 = new Travel("22", formatter.parse("09/04/2023"));
            travel5.setCar(car3);
            travel5.setPerson(person2);
            log.info("Preloading " + travelRepository.save(travel5));

            Travel travel6 = new Travel("25",formatter.parse("30/04/2023"));
            travel6.setCar(car3);
            travel6.setPerson(person2);
            log.info("Preloading " + travelRepository.save(travel6));

            log.info("Preloading " + person2);

            Person person3 = new Person("Angelina", 32, 11);
            log.info("Preloading " + personRepository.save(person3));
            Travel travel7 = new Travel("12",formatter.parse("01/05/2023"));
            travel7.setCar(car2);
            travel7.setPerson(person3);
            log.info("Preloading " + travelRepository.save(travel4));

            Travel travel8 = new Travel("22", formatter.parse("08/05/2023"));
            travel8.setCar(car1);
            travel8.setPerson(person3);
            log.info("Preloading " + travelRepository.save(travel8));

            log.info("Preloading " + personRepository.save(person3));
            Violation violation4 = new Violation("Parking", new Date());
            violation4.setPerson(person3);
            log.info("Preloading " + violationRepository.save(violation4));

            log.info("Preloading " + person3);
        };
    }
}
