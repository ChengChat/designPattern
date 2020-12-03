package observer;

/**
 * 观察者模式：
 * 定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，他所有依赖着都会收到通知并自动更新
 * 主题（subject）和观察者定义了一对多的关系，观察者依赖于此主题，只要主题状态一有变化，观察者就会被通知。
 * <p>
 * 设计原则：
 * 1. 为了交互对象之间的松耦合设计而努力（两个对象之间的松耦合，它们依然可以交互，但是不太清楚彼此的细节）
 * <p>
 * 此设计模式在GUI中应用较多
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.3f);
        weatherData.setMeasurements(57, 55, 46.5f);

    }
}
