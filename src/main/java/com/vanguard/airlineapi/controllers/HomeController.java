package com.vanguard.airlineapi.controllers;

import java.util.ArrayList;
import java.util.List;


import com.vanguard.airlineapi.model.Flight;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HomeController {
    // Creating a logger
    private static Logger LOGGER = LogManager.getLogger();

    @RequestMapping(value = "/flights", method = RequestMethod.GET)
    public List <Flight> getFlights(Model model) {
        // Requesting all Flights
        List <Flight> flightList = new ArrayList<Flight>();

        Flight f1 = new Flight ("1728", "Dallas, TX", "Detroit, MI");
        Flight f2 = new Flight ("2516", "Fort Lauderdale, FL", "Los Angeles, CA");

        flightList.add(f1);
        LOGGER.info("Added to the Flight List - Flight number: " + f1.getFlightNumber() + ", origin: " + f1.getOrigin() + ", destination: " + f1.getDestination());
        flightList.add(f2);
        LOGGER.info("Added to the Flight List - Flight number: " + f2.getFlightNumber() + ", origin: " + f2.getOrigin() + ", destination: " + f2.getDestination());
        LOGGER.trace("Flight List contains : " + flightList.size() + " flights in the system.");
        LOGGER.error("" +flightList.size());
        LOGGER.warn("" + flightList.size());
        return flightList;
    }
}