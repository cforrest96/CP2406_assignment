import java.util.Random;

public class TrafficLight {
    // 0 is green, 1 is red
    int traffic_light_number;
    int traffic_light_change_rate;
    int traffic_light_road;

    public TrafficLight() {
        traffic_light_number = 1;
        traffic_light_change_rate = 30;
        traffic_light_road = 1;
    }

    public TrafficLight(int traffic_light_number, int traffic_light_change_rate,
                            int traffic_light_road) {
        set_traffic_light_number(traffic_light_number);
        set_traffic_light_change_rate(traffic_light_change_rate);
        setTraffic_light_road(traffic_light_road);
    }

    public int get_traffic_light_number() {
        return traffic_light_number;
    }

    public void set_traffic_light_number(int traffic_light_colour) {
        this.traffic_light_number = traffic_light_colour;
    }

    public int get_traffic_light_change_rate() {
        return traffic_light_change_rate;
    }

    public void set_traffic_light_change_rate(int traffic_light_change_rate) {
        this.traffic_light_change_rate = traffic_light_change_rate;
    }

    public int getTraffic_light_road() {
        return traffic_light_road;
    }

    public void setTraffic_light_road(int traffic_light_road) {
        this.traffic_light_road = traffic_light_road;
    }

    public int get_change_num() {
        Random r = new Random();
        int n = r.nextInt(99);
        return n += 1;
    }

    public String get_light_colour(int v){
        if (v == 0)
            return "green";
        else
            return "red";
    }
    public int traffic_light_operate(int v) {
        if (v == 0)
            return 1;
        else
            return 0;
    }
}
