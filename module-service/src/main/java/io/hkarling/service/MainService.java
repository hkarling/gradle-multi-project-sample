package io.hkarling.service;

import io.hkarling.model.TrainTime;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@Service
public class MainService {
    public List<TrainTime> listTrainTimes() {
        return Arrays.asList(
                new TrainTime("London", "BRIGHTON", LocalTime.of(9, 35), LocalTime.of(10, 30)),
                new TrainTime("London", "BRIGHTON", LocalTime.of(15, 5), LocalTime.of(16, 0)),
                new TrainTime("Brighton", "LONDON", LocalTime.of(11, 0), LocalTime.of(12, 0)),
                new TrainTime("Brighton", "LONDON", LocalTime.of(16, 30), LocalTime.of(17, 30)));
    }
}
