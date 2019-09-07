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
        light.set_traffic_light_colour(0);
        assertEquals(1,
                light.traffic_light_operate(light.get_traffic_light_colour()));
        assertNotEquals(0, light.traffic_light_operate
                (light.get_traffic_light_colour()));
    }

    @Test void check_get_light_colour() {
        TrafficLight light = new TrafficLight();
        light.set_traffic_light_colour(0);
        assertEquals("green", light.get_light_colour
                (light.get_traffic_light_colour()));
        light.set_traffic_light_colour(1);
        assertEquals("red", light.get_light_colour
                (light.get_traffic_light_colour()));
    }
}
