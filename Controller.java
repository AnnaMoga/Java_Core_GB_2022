package lesson_7;

import lesson_7.enums.Functionality;
import lesson_7.enums.Periods;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static lesson_7.enums.Functionality.GET_CURRENT_WEATHER;


public class Controller {

    WeatherProvider weatherProvider = new AccuWeatherProvider();

    Map<Integer, Functionality> variantResult = new HashMap();

    public Controller() {
        variantResult.put(1, GET_CURRENT_WEATHER);
        variantResult.put(2, Functionality.GET_WEATHER_IN_NEXT_5_DAYS);
        variantResult.put(3, Functionality.GET_CUSTOM_WEATHER);
    }

    public void onUserInput(String input) throws IOException {
        int command = Integer.parseInt(input);
        if (!variantResult.containsKey(command)) {
            throw new IOException("There is no command for command-key " + command);
        }

        Functionality functionality = variantResult.get(command);
        if (GET_CURRENT_WEATHER.equals(functionality)) {
            getCurrentWeathet();
        } else if (Functionality.GET_WEATHER_IN_NEXT_5_DAYS.equals(functionality)) {
            getWeatherInNext5Days();
        } else if (Functionality.GET_CUSTOM_WEATHER.equals(functionality)) {
            getCustomWeather();
        }
    }

    public void getCurrentWeathet() throws IOException {
        weatherProvider.getWeather(Periods.NOW);
    }

    public void getWeatherInNext5Days() throws IOException {
        weatherProvider.getWeather(Periods.FIVE_DAYS);
    }

    public void getCustomWeather() throws IOException {
        weatherProvider.getWeather(Periods.CUSTOM);
    }

}

