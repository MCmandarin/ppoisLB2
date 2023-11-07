package Test;

import org.junit.jupiter.api.Test;
import ppois.lb2.ConstructionSite;

import static org.junit.jupiter.api.Assertions.*;

class ConstructionSiteTest {

    @Test
    void getPlace() {
        ConstructionSite cs = new ConstructionSite();
        cs.setPlace("home");
        assertEquals("home", cs.getPlace());
    }

    @Test
    void setPlace() {
        ConstructionSite cs = new ConstructionSite();
        cs.setPlace("home");
        assertEquals("home", cs.getPlace());
    }

    @Test
    void getWorkStartTime() {
        ConstructionSite cs = new ConstructionSite();
        cs.setWorkStartTime(8);
        assertEquals(8, cs.getWorkStartTime());
    }

    @Test
    void setWorkStartTime() {
        ConstructionSite cs = new ConstructionSite();
        cs.setWorkStartTime(3);
        assertEquals(null, cs.getWorkStartTime());
    }

    @Test
    void getWorkEndTime() {
        ConstructionSite cs = new ConstructionSite();
        cs.setWorkEndTime(20);
        assertEquals(20, cs.getWorkEndTime());
    }

    @Test
    void setWorkEndTime() {
        ConstructionSite cs = new ConstructionSite();
        cs.setWorkEndTime(18);
        assertEquals(null , cs.getWorkEndTime());
    }
}