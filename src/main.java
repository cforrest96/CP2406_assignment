public class main {
    public static void main(String args[]){
        Road road1 = new Road();
        Car car1 = new Car();
        Road road2 = new Road(5, 2, false);
        TrafficLight light1 = new TrafficLight();
        while (car1.get_car_road() != 2) {
            while (car1.get_car_position() < road1.get_road_length()) {
                car1.set_car_position(car1.car_move(car1.get_car_position()));
                int i = TrafficLight.get_change_num();
                if (i <= light1.get_traffic_light_change_rate())
                    light1.traffic_light_operate(light1.get_traffic_light_number());
            }
            System.out.println(car1.car_type(car1.get_vehicle_length()) + " stops at traffic light");
            while (road1.get_road_light() && light1.get_traffic_light_number() != 0)
                while (light1.get_traffic_light_number() != 0) {
                    int i = TrafficLight.get_change_num();

                    while (i >= light1.get_traffic_light_change_rate()) {
                        i = TrafficLight.get_change_num();
                        System.out.println("Light is " + light1.get_light_colour(light1.get_traffic_light_number()));
                    }
                    light1.traffic_light_operate(light1.get_traffic_light_number());
                }
            System.out.println("Light is " + light1.get_light_colour(light1.get_traffic_light_number()));
            car1.set_car_road(2);
            car1.set_car_position(1);
            System.out.println(car1.car_type(car1.get_vehicle_length()) + " is on road " + car1.get_car_road());
            while (car1.get_car_position() <= road2.get_road_length()) {
                car1.set_car_position(car1.car_move(car1.get_car_position()));
            }
        }
        System.out.println(car1.car_type(car1.get_vehicle_length()) + " is gone");

    }
}

