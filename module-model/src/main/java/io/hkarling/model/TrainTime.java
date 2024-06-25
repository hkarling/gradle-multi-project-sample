package io.hkarling.model;

import java.time.LocalTime;

public record TrainTime(
        String departure,
        String destination,
        LocalTime departureTime,
        LocalTime arrivalTime
) {
}
