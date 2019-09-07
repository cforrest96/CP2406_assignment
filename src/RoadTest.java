import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class RoadTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Road.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Test
    public void getRoad_length() {
    }

    @org.junit.Test
    public void setRoad_length() {
    }

    @org.junit.Test
    public void get_road_num() {
    }

    @org.junit.Test
    public void set_road_num() {
    }

    @org.junit.Test
    public void get_road_seg() {
    }

    @org.junit.Test
    public void set_road_seg() {
    }

    @org.junit.Test
    public void get_road_shape() {
    }

    @org.junit.Test
    public void set_road_shape() {
    }

    @org.junit.Test
    public void getRoad_light() {
    }

    @org.junit.Test
    public void setRoad_light() {
    }
}
