public class Radio {
    public int currentChanel;
    public int currentVolume;

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int newChanel) {
        if (newChanel > 9) {
            return;
        }
        if (newChanel < 0) {
            return;
        }
        currentChanel = newChanel;
    }

    public void nextChanel() {
        if (currentChanel < 9) {
            currentChanel = currentChanel + 1;
        } else {
            currentChanel = 0;
        }
    }

    public void prevChanel() {
        if (currentChanel > 0) {
            currentChanel = currentChanel - 1;
        } else {
            currentChanel = 9;
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
