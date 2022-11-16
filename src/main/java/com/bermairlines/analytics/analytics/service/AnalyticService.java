package com.bermairlines.analytics.analytics.service;

import java.math.BigInteger;
import java.util.List;

public interface AnalyticService {
    List<BigInteger> getAllClicks();
    String getFlightView();
}
