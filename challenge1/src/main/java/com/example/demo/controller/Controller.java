package com.example.demo.controller;


import java.net.URI;

import com.example.demo.dao.ItemDao;
import com.example.demo.model.Item;
import org.springframework.beans
        .factory.annotation.Autowired;
import org.springframework.http
        .ResponseEntity;
import org.springframework.web.bind
        .annotation.GetMapping;
import org.springframework.web.bind
        .annotation.PostMapping;
import org.springframework.web.bind
        .annotation.RequestBody;
import org.springframework.web.bind
        .annotation.RequestMapping;
import org.springframework.web.bind
        .annotation.RestController;
import org.springframework.web.servlet
        .support.ServletUriComponentsBuilder;

// Import the above-defined classes
// to use the properties of those
// classes


// Creating the REST controller
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RestController
@RequestMapping(path = "/items")
public class Controller {

    @Autowired
    private ItemDao itemDao;

    // Implementing a GET method
    // to get the list of all
    // the employees
    @GetMapping(
            path = "/",
            produces = "application/json")

    public Item getItems()
    {

        return (Item) itemDao
                .getAllItem();
    }



    @PostMapping(
            path = "/",
            consumes = "application/json",
            produces = "application/json")

    public ResponseEntity<Object> addItems(
            @RequestBody Item item)
    {

        // Creating an ID of an employee
        // from the number of employees
        Integer id
                = itemDao
                .getAllItem()
                .getItemsList()
                .size()
                + 1;

        item.setId(id);

        itemDao
                .additem(item);

        URI location
                = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(
                        item.getId())
                .toUri();

        return ResponseEntity
                .created(location)
                .build();
    }
}
