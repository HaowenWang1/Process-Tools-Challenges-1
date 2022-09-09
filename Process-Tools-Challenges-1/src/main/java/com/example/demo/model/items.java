package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

// Class to store the list of
// all the employees in an
// Array List
public class items {

    private List<items> itemsList;

    // Method to return the list
    // of employees
    public List<items> getItemsList()
    {

        if (itemsList == null) {

            itemsList
                    = new ArrayList<>();


        }

        return itemsList;


    }

    public void
    setItemsList(
            List<items> itemsList)
    {
        this.itemsList
                = itemsList;
    }
}
