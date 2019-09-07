public class Car {

    private double vehicle_length;
    private int car_position;
    public int car_road;

    public double get_vehicle_length() {
        return vehicle_length;
    }

    public void set_vehicle_length(double vehicle_length) {
        this.vehicle_length = vehicle_length;
    }

    public int get_car_position() {
        return car_position;
    }

    public void set_car_position(int car_position) {
        this.car_position = car_position;
    }

    public int get_car_road() {
        return car_road;
    }

    public void set_car_road(int car_road) {
        this.car_road = car_road;
    }


    static int car_move(int value) {
        return value + 1;
    }
    static String car_type(double value){
        String vehicle_type;
        final double CAR_LENGTH = 0.5;
        if (value == CAR_LENGTH)
            return vehicle_type = "car";
        else if (value == CAR_LENGTH * 3)
            return vehicle_type = "bus";
        else if (value == CAR_LENGTH * 0.5)
            return vehicle_type = "motorbike";
        else
            return "error";

    }
}
