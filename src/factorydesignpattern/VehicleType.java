package factorydesignpattern;

public enum VehicleType {
    TRUCK {
        @Override
        Vehicle getVehicle() {
            return new Truck();
        }
    },
    CAR {
        @Override
        Vehicle getVehicle() {
            return new Car();
        }
    },
    ELECTRIC {
        @Override
        Vehicle getVehicle() {
            return new ElectricCar();
        }
    };

    abstract Vehicle getVehicle();
}
