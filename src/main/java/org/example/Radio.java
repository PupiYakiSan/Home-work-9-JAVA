package org.example;

public class Radio {
    private int minChanel = 0;
    private int maxChanel;
    private int chanel = minChanel;
    private int volume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
        maxChanel = 9;
    }
    public Radio(int size) {
        maxChanel = minChanel + size - 1;
    }
    public int getChanel() {
        return chanel;
    }
    public int getMaxChanel() {
        return maxChanel;
    }
    public int getMinChanel() {
        return minChanel;
    }

    public int getVolume() {
        return volume;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }

    public void setChanel(int newChanel) {
        if (newChanel < minChanel) {
            return;
        }
        if (newChanel > maxChanel) {
            return;
        }
        chanel = newChanel;
    }

    public void nextChanel() {
        if (chanel < maxChanel) {
            chanel++;
        }
        if (chanel == maxChanel) {
            chanel = minChanel;
        }
    }

    public void prevChanel() {
        if (chanel > minChanel) {
            chanel--;
        }
        if (chanel == minChanel) {
            chanel = maxChanel;
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume--;
        }

    }
}
