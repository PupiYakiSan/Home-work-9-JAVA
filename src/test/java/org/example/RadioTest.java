package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void size() {
        Radio radioSize = new Radio(30);

        Assertions.assertEquals(29, radioSize.getMaxChanel());
        Assertions.assertEquals(0, radioSize.getMinChanel());
    }

    @Test
    public void belowMinBorderChanel() {

        radio.setChanel(-1);
        Assertions.assertEquals(radio.getMinChanel(), radio.getChanel());
    }

    @Test
    public void minBorderChanel() {

        radio.setChanel(0);
        Assertions.assertEquals(radio.getMinChanel(), radio.getChanel());
    }

    @Test
    public void middleChanel() {

        radio.setChanel(5);
        Assertions.assertEquals(5, radio.getChanel());
    }

    @Test
    public void maxBorderChanel() {

        radio.setChanel(9);
        Assertions.assertEquals(radio.getMaxChanel(), radio.getChanel());
    }

    @Test
    public void aboveMaxBorderChanel() {

        radio.setChanel(10);
        Assertions.assertEquals(radio.getMinChanel(), radio.getChanel());
    }

    @Test
    public void nextChanel() {

        radio.setChanel(5);
        radio.nextChanel();
        Assertions.assertEquals(6, radio.getChanel());
    }

    @Test
    public void nextChanelJumpMaxMin() {

        radio.setChanel(9);
        radio.nextChanel();
        Assertions.assertEquals(radio.getMinChanel(), radio.getChanel());
    }

    @Test
    public void prevChanel() {

        radio.setChanel(5);
        radio.prevChanel();
        Assertions.assertEquals(4, radio.getChanel());
    }

    @Test
    public void prevChanelJumpMinMax() {

        radio.setChanel(0);
        radio.prevChanel();
        Assertions.assertEquals(radio.getMaxChanel(), radio.getChanel());
    }

    @Test
    public void belowMinBorderVolume() {

        radio.setVolume(-1);
        Assertions.assertEquals(radio.getMinVolume(), radio.getVolume());
    }

    @Test
    public void minBorderVolume() {

        radio.setVolume(0);
        Assertions.assertEquals(radio.getMinVolume(), radio.getVolume());
    }


    @Test
    public void middleVolume() {

        radio.setVolume(50);
        Assertions.assertEquals(50, radio.getVolume());
    }

    @Test
    public void maxBorderVolume() {

        radio.setVolume(100);
        Assertions.assertEquals(radio.getMaxVolume(), radio.getVolume());
    }

    @Test
    public void aboveMaxBorderVolume() {

        radio.setVolume(101);
        Assertions.assertEquals(radio.getMinVolume(), radio.getVolume());
    }

    @Test
    public void increaseVolumeMaxMinusOne() {

        radio.setVolume(99);
        radio.increaseVolume();
        Assertions.assertEquals(radio.getMaxVolume(), radio.getVolume());
    }

    @Test
    public void increaseVolumeMax() {

        radio.setVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(radio.getMaxVolume(), radio.getVolume());
    }

    @Test
    public void decreaseVolumeMinPlusOne() {

        radio.setVolume(1);
        radio.decreaseVolume();
        Assertions.assertEquals(radio.getMinVolume(), radio.getVolume());
    }

    @Test
    public void decreaseVolumeMin() {

        radio.setVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(radio.getMinVolume(), radio.getVolume());
    }

}
