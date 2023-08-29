class RegularCar extends Car {
    public RegularCar(String brand, String model, String color, String bodyType, int numWheels,
                      String fuelType, String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, numWheels, fuelType, transmissionType, engineVolume);
    }

    @Override
    public void move() {
        System.out.println(brand + " " + model + " is moving.");
    }

    @Override
    public void service() {
        System.out.println(brand + " " + model + " is being serviced.");
    }

    @Override
    public void shiftGear() {
        System.out.println(brand + " " + model + " is shifting gears.");
    }

    @Override
    public void turnOnLights() {
        System.out.println(brand + " " + model + " lights are on.");
    }

    @Override
    public void turnOnWipers() {
        System.out.println(brand + " " + model + " wipers are on.");
    }
}
