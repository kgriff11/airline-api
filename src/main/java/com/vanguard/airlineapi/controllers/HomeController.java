package com.vanguard.airlineapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanguard.airlineapi.model.Flight;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HomeController {

    @RequestMapping(value = "/flights", method = RequestMethod.GET)
    public List <Flight> getFlights(Model model) {
        // Requesting all Flights
        List <Flight> flightList = new ArrayList<Flight>();
        flightList.add(new Flight ("1728", "Dallas, TX", "Detroit, MI"));
        flightList.add(new Flight ("2516", "Fort Lauderdale, FL", "Los Angeles, CA"));

        return flightList;
    }
}