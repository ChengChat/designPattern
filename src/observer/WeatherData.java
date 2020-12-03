package observer;

import java.util.Observable;

/**
 * 气象数据，即为主题（或可观察者）。
 */
public class WeatherData extends Observable {
    private float temperature;// 温度
    private float humidity; // 湿度
    private float pressure; // 气压

    public WeatherData(){};

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanges();
    }

    private void measurementsChanges() {
        super.setChanged();
        super.notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
