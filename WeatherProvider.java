package lesson_7;

import lesson_7.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {
    void getWeather(Periods periods) throws IOException;
}

