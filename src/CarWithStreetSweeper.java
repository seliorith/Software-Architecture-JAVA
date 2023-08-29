abstract class CarWithStreetSweeper extends Car {
    public CarWithStreetSweeper(String brand, String model, String color, String bodyType, int numWheels,
                                String fuelType, String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, numWheels, fuelType, transmissionType, engineVolume);
    }

    public abstract void sweepStreet();
}
