package com.actuator.actuatordemo.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Controller;

@Controller
public class MyDbHealthService implements HealthIndicator {

    public boolean check() {
        // Your logic to check the health of the database
        // For now, I am returning true
        return false;
    }

    @Override
    public Health health() {
        // Your logic to check the health of the database
        // For now, I am returning UP status
        if(!check())
            return Health.down().build();
        return Health.up().build();
    }


}
