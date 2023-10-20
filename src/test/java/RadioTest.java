import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetQuantity20AndChanel15() {
        Radio radio = new Radio(20);
        radio.setCurrentChanel(15);
        int expected = 15;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChanelQuantity() {
        Radio radio = new Radio(16);
        int expected = 16;
        int actual = radio.getCurrentChanelQuantity();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChanelQuantity() {
        Radio radio = new Radio(-16);
        int expected = 0;
        int actual = radio.getCurrentChanelQuantity();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);
        int expected = 9;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChanelHigher() {
        Radio radio = new Radio();
        radio.setCurrentChanel(15);
        int expected = 0;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChanelLower() {
        Radio radio = new Radio();
        radio.setCurrentChanel(-15);
        int expected = 0;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(7);
        radio.nextChanel();
        int expected = 8;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(6);
        radio.prevChanel();
        int expected = 5;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextChanelAfter() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);
        radio.nextChanel();
        int expected = 0;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevChanelBefore() {
        Radio radio = new Radio();
        radio.setCurrentChanel(0);
        radio.prevChanel();
        int expected = 9;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-50);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(150);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetHigherVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetHigherVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLesserVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetLesserVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
