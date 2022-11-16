package com.bermairlines.analytics.analytics.controller;

import com.bermairlines.analytics.analytics.service.AnalyticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/analytics")
public class AnalyticController {

    @Autowired
    AnalyticService analyticService;

    @GetMapping("/allclicks")
    public List<BigInteger> getAllClicks(){
        return analyticService.getAllClicks();
    }

    @GetMapping("/flightview")
    public String getViews(){
        return analyticService.getFlightView();
    }
}