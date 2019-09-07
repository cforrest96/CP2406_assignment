import java.util.Random;

public class TrafficLight {
    // 0 is green, 1 is red
    private int traffic_light_number;
    private int traffic_light_change_rate;
    private int traffic_light_road;

    TrafficLight() {
        traffic_light_number = 1;
        traffic_light_change_rate = 30;
        traffic_light_road = 1;
    }

    TrafficLight(int traffic_light_number, int traffic_light_change_rate,
                            int traffic_light_road) {
        set_traffic_light_number(traffic_light_number);
        set_traffic_light_change_rate(traffic_light_change_rate);
        set_traffic_light_road(traffic_light_road);
    }

    int get_traffic_light_number() {
        return traffic_light_number;
    }

    void set_traffic_light_number(int traffic_light_colour) {
        this.traffic_light_number = traffic_light_colour;
    }

    int get_traffic_light_change_rate() {
        return traffic_light_change_rate;
    }

    void set_traffic_light_change_rate(int traffic_light_change_rate) {
        this.traffic_light_change_rate = traffic_light_change_rate;
    }

    int get_traffic_light_road() {
        return traffic_light_road;
    }

    void set_traffic_light_road(int traffic_light_road) {
        this.traffic_light_road = traffic_light_road;
    }

    static int get_change_num() {
        Random r = new Random();
        int n = r.nextInt(99);
        return n += 1;
    }

    String get_light_colour(int v){
        if (v == 0)
            return "green";
        else
            return "red";
    }
    void traffic_light_operate(int v) {
        if (v == 0)
            this.set_traffic_light_number(1);
        else
            this.set_traffic_light_number(0);
    }
}
