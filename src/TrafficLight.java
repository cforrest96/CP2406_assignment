import java.util.Random;

public class TrafficLight {
    // 0 is green, 1 is red
    int traffic_light_colour;
    int traffic_light_change_rate;

    public int get_traffic_light_colour() {
        return traffic_light_colour;
    }

    public void set_traffic_light_colour(int traffic_light_colour) {
        this.traffic_light_colour = traffic_light_colour;
    }

    public int get_traffic_light_change_rate() {
        return traffic_light_change_rate;
    }

    public void set_traffic_light_change_rate(int traffic_light_change_rate) {
        this.traffic_light_change_rate = traffic_light_change_rate;
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
