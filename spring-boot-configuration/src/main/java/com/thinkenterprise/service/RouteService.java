package com.thinkenterprise.service;

import com.thinkenterprise.domain.route.Route;
import com.thinkenterprise.domain.route.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;


@Service("routeService")
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public int calculateFlightCount(Route route) {
        return route.getFlights().size();
    }

    public String formatTime(LocalTime time) {
        return time.toString();
    }

    public Iterable<Route> findAll() {
        return routeRepository.findAll();
    }
}
