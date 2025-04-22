package UKG.Day3;

class WeatherService {
    public void setTemperature(int temperature) throws InvalidTemperatureException {
            if (temperature < -100 || temperature > 100) {
                throw new InvalidTemperatureException("Temperature out of valid range: " + temperature);
            }
            System.out.println("Temperature set to: " + temperature);
    }
}
