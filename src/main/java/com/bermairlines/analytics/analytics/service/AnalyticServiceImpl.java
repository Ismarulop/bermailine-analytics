package com.bermairlines.analytics.analytics.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class AnalyticServiceImpl implements AnalyticService{
    @Override
    public List<BigInteger> getAllClicks() {
        return null;
    }

    @Override
    public String getFlightView() {
        return "In this controller we are going to show the times one flight have being visited";
    }
}
