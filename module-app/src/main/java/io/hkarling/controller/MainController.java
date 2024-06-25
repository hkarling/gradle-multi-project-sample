package io.hkarling.controller;

import io.hkarling.model.TrainTime;
import io.hkarling.service.MainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/")
    public List<TrainTime> getTimes() {
        return mainService.listTrainTimes();
    }
}
