
public class Car {

    private double vehicle_length;
    private int car_position;
    private int car_road;

    Car() {
        vehicle_length = 0.5;
        car_position = 1;
        car_road = 1;
    }
    Car(double vehicle_length, int car_position, int car_road) {
        set_vehicle_length(vehicle_length);
        set_car_position(car_position);
        set_car_road(car_road);
    }

    double get_vehicle_length() {
        return vehicle_length;
    }

    void set_vehicle_length(double vehicle_length) {
        this.vehicle_length = vehicle_length;
    }

    int get_car_position() {
        return car_position;
    }

    void set_car_position(int car_position) {
        this.car_position = car_position;
    }

    int get_car_road() {
        return car_road;
    }

    void set_car_road(int car_road) {
        this.car_road = car_road;
    }

    static int car_move(int value) {
        return value + 1;
    }

    static String car_type(double value){
        final double CAR_LENGTH = 0.5;
        if (value == CAR_LENGTH)
            return "Car";
        else if (value == CAR_LENGTH * 3)
            return "Bus";
        else if (value == CAR_LENGTH * 0.5)
            return "Motorbike";
        else
            return "Error";

    }
}
