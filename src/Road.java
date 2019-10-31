public class Road {
    private int road_length;
    private int road_num;
    private Boolean road_light;

    Road(){
        road_length = 4;
        road_num = 1;
        road_light = true;
    }

    Road(int road_length, int road_num, Boolean road_light){
        set_road_num(road_num);
        set_road_length(road_length);
        set_road_light(false);
    }

    int get_road_length() {
        return road_length;
    }

    void set_road_length(int road_length) {
        this.road_length = road_length;
    }

    int get_road_num() {
        return road_num;
    }

    void set_road_num(int road_num) {
        this.road_num = road_num;
    }

    Boolean get_road_light() {
        return road_light;
    }

    void set_road_light(Boolean road_light) {
        this.road_light = road_light;
    }
}
