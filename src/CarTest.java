import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test void checkCarMove() {
        Car car = new Car();
        car.set_car_position(0);
        car.set_car_position(car.car_move(car.get_car_position()));
        assertEquals(1, car.get_car_position());
    }
    @Test void checkCarType() {
        Car car = new Car();
        car.set_vehicle_length(0.5);
        assertSame(car.car_type(car.get_vehicle_length()), "car");
        car.set_vehicle_length(1.5);
        assertSame(car.car_type(car.get_vehicle_length()), "bus");
        car.set_vehicle_length(1.4);
        assertSame(car.car_type(car.get_vehicle_length()), "error");

    }
}
