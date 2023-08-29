abstract class Car implements FuelStation {
    protected String brand;
    protected String model;
    protected String color;
    protected String bodyType;
    protected int numWheels;
    protected String fuelType;
    protected String transmissionType;
    protected double engineVolume;

    public Car(String brand, String model, String color, String bodyType, int numWheels,
               String fuelType, String transmissionType, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numWheels = numWheels;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineVolume = engineVolume;
    }
    public void refuel() {
        System.out.println(brand + " " + model + " is refueling.");
    }

    @Override
    public void cleanWindshield() {
        System.out.println(brand + " " + model + " windshield is being cleaned.");
    }

    @Override
    public void cleanHeadlights() {
        System.out.println(brand + " " + model + " headlights are being cleaned.");
    }

    @Override
    public void cleanMirrors() {
        System.out.println(brand + " " + model + " mirrors are being cleaned.");
    }

    public abstract void move();

    public abstract void service();

    public abstract void shiftGear();

    public abstract void turnOnLights();

    public abstract void turnOnWipers();
}
