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
        Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job anotherJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(aJob.equals(anotherJob));
    }

    @Test
    public void testToStringStartAndEndsWithNewLine() {
        Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        int numbers = aJob.toString().length();
        char ch1 = aJob.toString().charAt(0);
        assertEquals(ch1, '\n');

        char ch2 = aJob.toString().charAt(numbers-1);
        assertEquals(ch2, '\n');
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String aString = "\nID: " + aJob.getId()+"\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n";
        assertEquals(aString,aJob.toString());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job  emptyJob = new Job();
        emptyJob.setName("Data not available");
        assertEquals("\n" +
                "ID: " + emptyJob.getId() + "\n" +
                "Name: Data not available\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available" +
                "\n", emptyJob.toString());
    }

}



