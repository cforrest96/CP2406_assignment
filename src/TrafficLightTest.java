import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrafficLightTest {
    @Test void check_get_change_num() {
        TrafficLight light = new TrafficLight();
        int change_num = light.get_change_num();
        assertTrue(0 < change_num &&
                change_num <= 100);
        System.out.print(change_num);
    }

    @Test void check_traffic_light_operate() {
        TrafficLight light = new TrafficLight();
        light.set_traffic_light_number(0);


    }

    @Test void check_get_light_colour() {
        TrafficLight light = new TrafficLight();
        light.set_traffic_light_number(0);
        assertEquals("green", light.get_light_colour
                (light.get_traffic_light_number()));
        light.set_traffic_light_number(1);
        assertEquals("red", light.get_light_colour
                (light.get_traffic_light_number()));
    }
}
