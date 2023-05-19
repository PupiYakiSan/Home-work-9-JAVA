package org.example;

public class Radio {
    private int chanel;
    private int volume;

    public int getChanel() {
        return chanel;
    }

    public void setChanel(int newChanel) {
        if (newChanel < 0) {
            return;
        }
        if (newChanel > 9) {
            return;
        }
        chanel = newChanel;
    }

    public void nextChanel() {
        if (chanel < 9) {
            chanel = chanel + 1;
        }
        if (chanel == 9) {
            chanel = 0;
        }
    }

    public void prevChanel() {
        if (chanel > 0) {
            chanel = chanel - 1;
        }
        if (chanel == 0) {
            chanel = 9;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }

    }
}
