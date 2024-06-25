package io.hkarling.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainServiceTest {

    @Test
    public void swapsDestinationStationToUpperClass() {
        MainService mainService = new MainService();
        assertEquals("BRIGHTON", mainService.listTrainTimes().get(0).destination());
        assertEquals("BRIGHTON", mainService.listTrainTimes().get(1).destination());
        assertEquals("LONDON", mainService.listTrainTimes().get(2).destination());
        assertEquals("LONDON", mainService.listTrainTimes().get(3).destination());
    }
}