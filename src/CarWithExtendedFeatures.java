abstract class CarWithExtendedFeatures extends Car {
    public CarWithExtendedFeatures(String brand, String model, String color, String bodyType, int numWheels,
                                   String fuelType, String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, numWheels, fuelType, transmissionType, engineVolume);
    }

    public abstract void turnOnFogLights();

    public abstract void transportCargo();
}
