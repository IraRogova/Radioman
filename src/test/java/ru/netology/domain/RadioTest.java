package ru.netology.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(7);
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeNextRadioStationlast() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());

        radio.changeNextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangePrevRadioStationFirst() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());

        radio.changePrevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        assertEquals(0, radio.getCurrentSoundVolume());

        radio.setCurrentSoundVolume(8);
        assertEquals(8, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        assertEquals(0, radio.getCurrentSoundVolume());

        radio.setCurrentSoundVolume(11);
        assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        assertEquals(0, radio.getCurrentSoundVolume());

        radio.setCurrentSoundVolume(-1);
        assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldIncreaseCurrentSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(8);
        assertEquals(8, radio.getCurrentSoundVolume());

        radio.increaseCurrentSoundVolume();
        assertEquals(9, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldDecreaseCurrentSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(7);
        assertEquals(7, radio.getCurrentSoundVolume());

        radio.decreaseCurrentSoundVolume();
        assertEquals(6, radio.getCurrentSoundVolume());
    }




}