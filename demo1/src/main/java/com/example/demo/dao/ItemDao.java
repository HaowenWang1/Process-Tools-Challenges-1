package com.example.demo.dao;

import com.example.demo.model.Item;
import com.example.demo.model.items;



public class ItemDao {
    private static items list
            = new items();

    // This static block is executed
    // before executing the main
    // block
    static
    {

        // Creating a few employees
        // and adding them to the list
        list.getItemsList().add(
                new Item(
                        1,
                        "Prem",
                        "Tiwari",
                        10));

        list.getItemsList().add(
                new Item(
                        2,
                        "Vikash",
                        "Kumar",
                        10));

        list.getItemsList().add(
                new Item(
                        3,
                        "Ritesh",
                        "Ojha",
                        20));


    }

    // Method to return the list
    public items getAllItem()
    {

        return list;
    }


    // Method to add an employee
    // to the employees list
    public void
    additem(Item items)
    {
        list.getItemsList()
                .add(items);

    }

}
