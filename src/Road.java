public class Road {
    private int road_length;
    private int road_num;
    private String road_shape;
    private Boolean road_light;

    public Road(){
        road_length = 4;
        road_num = 1;
        road_light = true;
    }

    public Road(int road_length, int road_num, Boolean road_light){
        set_road_num(road_num);
        set_road_length(road_length);
        set_road_light(false);
    }

    public int get_road_length() {
        return road_length;
    }

    public void set_road_length(int road_length) {
        this.road_length = road_length;
    }

    public int get_road_num() {
        return road_num;
    }

    public void set_road_num(int road_num) {
        this.road_num = road_num;
    }

    public String get_road_shape() {
        return road_shape;
    }

    public void set_road_shape(String road_shape) {
        this.road_shape = road_shape;
    }

    public Boolean get_road_light() {
        return road_light;
    }

    public void set_road_light(Boolean road_light) {
        this.road_light = road_light;
    }
}
