public class Radio {
    private int currentChanel;
    private int currentVolume;
    private int currentChanelRatio;

    public Radio(int chanelRatio) {
        if (chanelRatio > 0) {
            this.currentChanelRatio = chanelRatio;
        }
    }

    public Radio() {
        currentChanelRatio = 10;
    }

    public int getCurrentChanelRatio() {

        return currentChanelRatio;
    }

    public int getCurrentChanel() {

        return currentChanel;
    }

    public void setCurrentChanel(int newChanel) {
        if (newChanel > currentChanelRatio - 1) {
            return;
        }
        if (newChanel < 0) {
            return;
        }
        currentChanel = newChanel;
    }

    public void nextChanel() {
        if (currentChanel < currentChanelRatio - 1) {
            currentChanel = currentChanel + 1;
        } else {
            currentChanel = 0;
        }
    }

    public void prevChanel() {
        if (currentChanel > 0) {
            currentChanel = currentChanel - 1;
        } else {
            currentChanel = currentChanelRatio - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            currentVolume = 0;
        } else if (newVolume > 100) {
            currentVolume = 100;
        } else {
            currentVolume = newVolume;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
