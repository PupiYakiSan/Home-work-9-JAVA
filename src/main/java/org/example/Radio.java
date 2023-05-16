package org.example;

public class Radio {
    public int chanel;
    public int volume;

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

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
        if (volume == 100) {
            return;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
        if (volume == 0) {
            return;
        }
    }
}
