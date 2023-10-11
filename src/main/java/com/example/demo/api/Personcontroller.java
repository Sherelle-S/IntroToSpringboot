package com.example.demo.api;

import com.example.demo.api.model.dao.service.PersonService;

public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    public void  addPerson(Person person){
        personService.addPerson(person);
    }
}
