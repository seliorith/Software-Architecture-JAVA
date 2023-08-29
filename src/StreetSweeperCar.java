class StreetSweeperCar extends CarWithStreetSweeper {
    public StreetSweeperCar(String brand, String model, String color, String bodyType, int numWheels,
                            String fuelType, String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, numWheels, fuelType, transmissionType, engineVolume);
    }

    @Override
    public void move() {

    }

    @Override
    public void service() {

    }

    @Override
    public void shiftGear() {

    }

    @Override
    public void turnOnLights() {

    }

    @Override
    public void turnOnWipers() {

    }

    @Override
    public void sweepStreet() {
        System.out.println(brand + " " + model + " is sweeping the street.");
    }
}
