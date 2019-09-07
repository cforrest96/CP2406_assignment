public class main {
    public static void main(String args[]){
        Road road1 = new Road();
        Car car1 = new Car();
        Road road2 = new Road(5, 2, false);
        TrafficLight light1 = new TrafficLight();
        while (car1.get_car_road() != 2) {
            while (car1.get_car_position() < road1.get_road_length()) {
                car1.set_car_position(car1.car_move(car1.get_car_position()));


            }
            if (road1.get_road_light()) {
                int i = light1.get_change_num();
                System.out.println(car1.car_type(car1.get_vehicle_length()) + " gets to traffic light");
                while (i >= light1.get_traffic_light_change_rate()) {
                    i = light1.get_change_num();
                    System.out.println("Light is " + light1.get_light_colour(light1.get_traffic_light_number()));
                }
                light1.traffic_light_operate(light1.get_traffic_light_number());
                System.out.println("Light is " + light1.get_light_colour(light1.get_traffic_light_number()));
                road1.set_road_light(false);
                car1.set_car_road(2);
                car1.set_car_position(1);
                System.out.println(car1.car_type(car1.get_vehicle_length()) + " is on road " + car1.get_car_road());

            }
            else {
                car1.set_car_road(2);
                car1.set_car_position(1);
                System.out.println(car1.car_type(car1.get_vehicle_length()) + " is on road " + car1.get_car_road());
            }
            while (car1.get_car_position() <= road2.get_road_length()) {
                car1.set_car_position(car1.car_move(car1.get_car_position()));
            }
            System.out.println(car1.car_type(car1.get_vehicle_length()) + " is gone");

        }




    }

}

