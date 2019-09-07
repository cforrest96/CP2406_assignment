public class Road {
    int road_length;
    int road_num;
    String road_shape;
    Boolean road_light;

    public Road(){
        road_length = 4;
        road_num = 1;
        road_light = true;
    }

    public Road(int road_length, int road_num, Boolean road_light){
        set_road_num(road_num);
        setRoad_length(road_length);
        setRoad_light(false);
    }

    public int getRoad_length() {
        return road_length;
    }

    public void setRoad_length(int road_length) {
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

    public Boolean getRoad_light() {
        return road_light;
    }

    public void setRoad_light(Boolean road_light) {
        this.road_light = road_light;
    }
}
