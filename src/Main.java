public class Main {
    public static void main(String[] args) {
        // Создание обычного автомобиля
        RegularCar regularCar = new RegularCar("Toyota", "Camry", "Blue", "Sedan", 4,
                "Gasoline", "Automatic", 2.5);

        regularCar.move();
        regularCar.service();
        regularCar.shiftGear();
        regularCar.turnOnLights();
        regularCar.turnOnWipers();

        System.out.println();

        // Создание автомобиля с функцией подметания улицы
        StreetSweeperCar streetSweeperCar = new StreetSweeperCar("CityClean", "Sweeper 2000", "Yellow",
                "Street Sweeper", 4,
                "Diesel", "Manual", 4.0);

        streetSweeperCar.move();
        streetSweeperCar.service();
        streetSweeperCar.sweepStreet();

        System.out.println();

        // Создание автомобиля с дополнительными функциями
        CargoTransportingCar cargoCar = new CargoTransportingCar("Ford", "Transit", "White", "Van", 4,
                "Diesel", "Automatic", 2.0);

        cargoCar.move();
        cargoCar.service();
        cargoCar.turnOnFogLights();
        cargoCar.transportCargo();

        System.out.println();

        // Создание автомобиля, имплементирующего интерфейс FuelStation
        Car refuelCar = new Car("Volkswagen", "Golf", "Black", "Hatchback", 4,
                "Gasoline", "Manual", 1.8) {
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
        };

        refuelCar.refuel();
        refuelCar.cleanWindshield();
        refuelCar.cleanHeadlights();
        refuelCar.cleanMirrors();
    }
}
