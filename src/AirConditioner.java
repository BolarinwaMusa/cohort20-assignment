public class AirConditioner {
    private boolean isAcOn;
    private int temperature = 16;

    public boolean getState(){
        return isAcOn;
    }
    public void turnOn() {
         isAcOn = true;
    }

    public void turnOff() {
        isAcOn = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature(){
        if(temperature < 30){
            temperature++;
        }

            }
    public void decreaseTemperature() {
        if (temperature > 16){
            temperature--;
        }
    }


    }

