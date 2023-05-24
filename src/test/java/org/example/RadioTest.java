package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void belowMinBorderChanel() {
        Radio radio = new Radio();

        radio.setChanel(-1);

        int expected = 0;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minBorderChanel() {
        Radio radio = new Radio();

        radio.setChanel(0);

        int expected = 0;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void middleChanel() {
        Radio radio = new Radio();

        radio.setChanel(5);

        int expected = 5;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxBorderChanel() {
        Radio radio = new Radio();

        radio.setChanel(9);

        int expected = 9;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxBorderChanel() {
        Radio radio = new Radio();

        radio.setChanel(10);

        int expected = 0;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChanelMin() {
        Radio radio = new Radio();

        radio.setChanel(0);
        radio.nextChanel();

        int expected = 1;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChanelMiddle() {
        Radio radio = new Radio();

        radio.setChanel(5);
        radio.nextChanel();

        int expected = 6;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChanelMax() {
        Radio radio = new Radio();

        radio.setChanel(8);
        radio.nextChanel();

        int expected = 9;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChanelJumpMaxMin() {
        Radio radio = new Radio();

        radio.setChanel(9);
        radio.nextChanel();

        int expected = 0;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChanelMin() {
        Radio radio = new Radio();

        radio.setChanel(1);
        radio.prevChanel();

        int expected = 0;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChanelMiddle() {
        Radio radio = new Radio();

        radio.setChanel(5);
        radio.prevChanel();

        int expected = 4;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChanelMax() {
        Radio radio = new Radio();

        radio.setChanel(9);
        radio.prevChanel();

        int expected = 8;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChanelJumpMinMax() {
        Radio radio = new Radio();

        radio.setChanel(0);
        radio.prevChanel();

        int expected = 9;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowMinBorderVolume() {
        Radio radio = new Radio();

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minBorderVolume() {
        Radio radio = new Radio();

        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void middleVolume() {
        Radio radio = new Radio();

        radio.setVolume(50);

        int expected = 50;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxBorderVolume() {
        Radio radio = new Radio();

        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxBorderVolume() {
        Radio radio = new Radio();

        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMaxMinusOne() {
        Radio radio = new Radio();

        radio.setVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMinPlusOne() {
        Radio radio = new Radio();

        radio.setVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMin() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}
