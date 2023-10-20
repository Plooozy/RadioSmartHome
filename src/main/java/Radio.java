public class Radio {
    private int currentChanel;
    private int currentVolume;
    private int currentChanelQuantity;

    public Radio(int chanelQuantity) {
        if (chanelQuantity > 0) {
            this.currentChanelQuantity = chanelQuantity;
        }
    }

    public Radio() {
        this.currentChanelQuantity = 10;
    }

    public int getCurrentChanelQuantity() {

        return currentChanelQuantity;
    }

    public int getCurrentChanel() {

        return currentChanel;
    }

    public void setCurrentChanel(int newChanel) {
        if (newChanel > currentChanelQuantity - 1) {
            return;
        }
        if (newChanel < 0) {
            return;
        }
        currentChanel = newChanel;
    }

    public void nextChanel() {
        if (currentChanel < currentChanelQuantity - 1) {
            currentChanel = currentChanel + 1;
        } else {
            currentChanel = 0;
        }
    }

    public void prevChanel() {
        if (currentChanel > 0) {
            currentChanel = currentChanel - 1;
        } else {
            currentChanel = currentChanelQuantity - 1;
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
