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
    public void nextChanel() {
        Radio radio = new Radio();

        radio.setChanel(5);
        radio.nextChanel();

        int expected = 6;
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
    public void prevChanel() {
        Radio radio = new Radio();

        radio.setChanel(5);
        radio.prevChanel();

        int expected = 4;
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
    public void increaseVolumeMaxMinusOne() {
        Radio radio = new Radio();

        // т.к. напрямую нельзя устанавливать звук, то необходимо исключить то, что звук стоит на максимуме через функцию уменьшения звука
        for (int i = 0; i < 10; i++) {
            radio.decreaseVolume();
        }

        // определение счетчика до максимума
        int count = 100 - radio.volume;

        for (int i = 0; i < (count - 1); i++) {
            radio.increaseVolume();
        }

        int expected = 99;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio();

        // т.к. напрямую нельзя устанавливать звук, то необходимо исключить то, что звук стоит на максимуме через функцию уменьшения звука
        for (int i = 0; i < 10; i++) {
            radio.decreaseVolume();
        }

        // определение счетчика до максимума
        int count = 100 - radio.volume;

        for (int i = 0; i < count; i++) {
            radio.increaseVolume();
        }

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMaxPlusOne() {
        Radio radio = new Radio();

        // т.к. напрямую нельзя устанавливать звук, то необходимо исключить то, что звук стоит на максимуме через функцию уменьшения звука
        for (int i = 0; i < 10; i++) {
            radio.decreaseVolume();
        }

        // определение счетчика до максимума
        int count = 100 - radio.volume;

        for (int i = 0; i < (count + 1); i++) {
            radio.increaseVolume();
        }

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMinPlusOne() {
        Radio radio = new Radio();

        // т.к. напрямую нельзя устанавливать звук, то необходимо исключить то, что звук стоит на минимуме через функцию увеличения звука
        for (int i = 0; i < 10; i++) {
            radio.increaseVolume();
        }

        int count = radio.volume;

        for (int i = 0; i < (count - 1); i++) {
            radio.decreaseVolume();
        }

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMin() {
        Radio radio = new Radio();

        // т.к. напрямую нельзя устанавливать звук, то необходимо исключить то, что звук стоит на минимуме через функцию увеличения звука
        for (int i = 0; i < 10; i++) {
            radio.increaseVolume();
        }

        int count = radio.volume;

        for (int i = 0; i < count; i++) {
            radio.decreaseVolume();
        }

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMinMinesOne() {
        Radio radio = new Radio();

        // т.к. напрямую нельзя устанавливать звук, то необходимо исключить то, что звук стоит на минимуме через функцию увеличения звука
        for (int i = 0; i < 10; i++) {
            radio.increaseVolume();
        }

        int count = radio.volume;

        for (int i = 0; i < (count + 1); i++) {
            radio.decreaseVolume();
        }

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}
