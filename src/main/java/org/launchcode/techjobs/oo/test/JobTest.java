package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job aJob = new Job();
        Job anotherJob = new Job();
        assertNotEquals(aJob.getId(), anotherJob.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(aJob.getName() instanceof String);
        assertTrue(aJob.getEmployer() instanceof Employer);
        assertTrue(aJob.getLocation() instanceof Location);
        assertTrue(aJob.getPositionType() instanceof PositionType);
        assertTrue(aJob.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", aJob.getName());
        assertEquals("ACME", aJob.getEmployer().toString());
        assertEquals("Desert", aJob.getLocation().toString());
        assertEquals("Quality control", aJob.getPositionType().toString());
        assertEquals("Persistence", aJob.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {
        Job aJob =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job anotherJob =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(aJob.equals(anotherJob));
    }
}




