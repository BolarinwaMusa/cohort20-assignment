import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void testThatIHaveAcAndItIsOffByDefault() {
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getState());
    }

    @Test
    public void testThatIHaveAirConditionerItIsOff_turnItOn(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getState());
        airConditioner.turnOn();
        assertTrue(airConditioner.getState());
    }

    @Test
    public void testThatAirConditionerIsOn_CanBeTurnedOff(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getState());
        airConditioner.turnOn();
        assertTrue(airConditioner.getState());
        airConditioner.turnOff();
        assertFalse(airConditioner.getState());

    }

    @Test
    public void testThatAirConditionerCanBeSwitchedOnAndOffMoreThanOnce(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getState());
        airConditioner.turnOn();
        assertTrue(airConditioner.getState());
        airConditioner.turnOff();
        assertFalse(airConditioner.getState());
        airConditioner.turnOn();
        assertTrue(airConditioner.getState());
        airConditioner.turnOff();
        assertFalse(airConditioner.getState());
        airConditioner.turnOn();
        assertTrue(airConditioner.getState());
    }

    @Test
    public void testThatAirConditionerTemperatureIs16ByDefault(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getState());
        airConditioner.turnOn();
        assertEquals(16, airConditioner.getTemperature());
    }

    @Test
    public void testThatAirConditionerCanIncreaseTemperature(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getState());
        airConditioner.turnOn();
        assertTrue(airConditioner.getState());
        assertEquals(16, airConditioner.getTemperature());
        airConditioner.increaseTemperature();
        assertEquals(17, airConditioner.getTemperature());
        airConditioner.increaseTemperature();
        assertEquals(18,airConditioner.getTemperature());

    }
    @Test
    public void testThatAirConditionerCanDecreaseTemperature(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getState());
        airConditioner.turnOn();
        assertTrue(airConditioner.getState());
        assertEquals(16, airConditioner.getTemperature());
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        assertEquals(19,airConditioner.getTemperature());
        airConditioner.decreaseTemperature();
        airConditioner.decreaseTemperature();
        airConditioner.decreaseTemperature();
        assertEquals(16,airConditioner.getTemperature());
        assertEquals(16,airConditioner.getTemperature());
    }
    @Test
    public void testThatAirConditionerCanIncreaseTemperatureThreeTimesTemperatureIs19(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getState());
        airConditioner.turnOn();
        assertTrue(airConditioner.getState());
        assertEquals(16,airConditioner.getTemperature());
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        assertEquals(19,airConditioner.getTemperature());
    }

    @Test
    public void testThatTemperatureCannotIncreaseBeyond30(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        for (int count = 0; count < 14; count++) {
            airConditioner.increaseTemperature();
        }
        assertEquals(30, airConditioner.getTemperature());
        airConditioner.increaseTemperature();
        assertEquals(30, airConditioner.getTemperature());
    }
    @Test
    public void testThatTemperatureCannotDecreaseBeyond16(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();

        assertEquals(16, airConditioner.getTemperature());
        airConditioner.decreaseTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }

    }


