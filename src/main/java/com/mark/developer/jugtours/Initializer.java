package com.mark.developer.jugtours;

import com.github.javafaker.Faker;
import com.mark.developer.jugtours.model.Event;
import com.mark.developer.jugtours.model.Group;
import com.mark.developer.jugtours.model.GroupRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Collections;
import java.util.stream.Stream;

@Component
public class Initializer implements CommandLineRunner {
    private final GroupRepository repository;

    private final Faker faker = new Faker();

    public Initializer(GroupRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) {
//        Stream.of("Seattle JUG", "Denver JUG", "Dublin JUG",
//                "London JUG").forEach(name ->
//                repository.save(new Group(name)));

        for(int i=0; i<10; i++){
            repository.save(new Group(faker.name().name(), faker.address().cityName(), faker.address().state(), faker.address().country(), faker.address().countryCode()));
        }

//        Group djug = repository.findByName("Seattle JUG");
//        Event e = Event.builder().title("Micro Frontends for Java Developers")
//                .description("JHipster now has microfrontend support!")
//                .date(Instant.parse("2022-09-13T17:00:00.000Z"))
//                .build();
//        djug.setEvents(Collections.singleton(e));
//        repository.save(djug);

        repository.findAll().forEach(System.out::println);
    }
}
