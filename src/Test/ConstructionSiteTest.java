package Test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ppois.lb2.ConstructionSite;

import static org.junit.jupiter.api.Assertions.*;

class ConstructionSiteTest {
    private ConstructionSite constructionSite;

    @BeforeEach
    public void setUp() {
        constructionSite = new ConstructionSite();
    }

    @Test
    public void testGetPlace() {
        assertNull(constructionSite.getPlace());
    }

    @Test
    public void testSetPlace() {
        constructionSite.setPlace("Site1");
        assertEquals("Site1", constructionSite.getPlace());
    }

    @Test
    public void testGetWorkStartTime() {
        assertNull(constructionSite.getWorkStartTime());
    }

    @Test
    public void testSetValidWorkStartTime() {
        constructionSite.setWorkStartTime(5);
        assertEquals(Integer.valueOf(5), constructionSite.getWorkStartTime());
    }

    @Test
    public void testSetInvalidWorkStartTime() {
        constructionSite.setWorkStartTime(3); // Should print "Invalid time!"
        assertNull(constructionSite.getWorkStartTime());
    }

    @Test
    public void testGetWorkEndTime() {
        assertNull(constructionSite.getWorkEndTime());
    }

    @Test
    public void testSetValidWorkEndTime() {
        constructionSite.setWorkEndTime(20);
        assertEquals(Integer.valueOf(20), constructionSite.getWorkEndTime());
    }

    @Test
    public void testSetInvalidWorkEndTime() {
        constructionSite.setWorkEndTime(24); // Should print "Invalid time!"
        assertNull(constructionSite.getWorkEndTime());
    }

    @Test
    public void testEqualsAndHashCode() {
        ConstructionSite site1 = new ConstructionSite();
        ConstructionSite site2 = new ConstructionSite();

        site1.setPlace("Site1");
        site2.setPlace("Site1");

        site1.setWorkStartTime(6);
        site2.setWorkStartTime(6);

        site1.setWorkEndTime(20);
        site2.setWorkEndTime(20);

        assertEquals(site1, site2);
        assertEquals(site1.hashCode(), site2.hashCode());
    }

    @Test
    public void testToString() {
        ConstructionSite site = new ConstructionSite();
        String expectedString = "ConstructionSite{place='null', workStartTime=null, workEndTime=null}";
        assertEquals(expectedString, site.toString());
    }
}