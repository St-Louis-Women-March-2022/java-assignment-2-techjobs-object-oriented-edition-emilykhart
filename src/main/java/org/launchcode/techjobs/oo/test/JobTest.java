package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
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
public void testSettingJobId(){
    Job jobTest1 = new Job();
    Job jobTest2 = new Job();
    assertNotEquals(jobTest1.getId(), jobTest2.getId());
}
@Test
    public void testJobConstructorSetsAllFields(){
    Job allFieldsTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals("Product tester", allFieldsTest.getName());
    assertEquals("ACME", allFieldsTest.getEmployer().toString());
    assertEquals("Desert",allFieldsTest.getLocation().toString());
    assertEquals("Quality control",allFieldsTest.getPositionType().toString());
    assertEquals("Persistence", allFieldsTest.getCoreCompetency().toString());
    assertTrue(allFieldsTest.getEmployer() != null);
    assertTrue(allFieldsTest.getLocation() != null);
    assertTrue(allFieldsTest.getCoreCompetency() != null);
    assertTrue(allFieldsTest.getPositionType() != null);
    assertTrue(allFieldsTest.getName() != null);
}
@Test
    public void testJobsForEquality(){
    Job jobTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job jobTest2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(jobTest1.equals(jobTest2));
}

@Test
    public void testToStringStartsAndEndsWithNewLine(){
    Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals('\n', jobTest.toString().charAt(0));
    assertEquals('\n', jobTest.toString().charAt(jobTest.toString().length()-1));
}
@Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals("\nID: " + jobTest.getId() +"\n"+
            "Name: Product tester\n" +
            "Employer: ACME\n" +
            "Location: Desert\n" +
            "Position Type: Quality control\n" +
            "Core Competency: Persistence\n",jobTest.toString());

}
@Test
    public void testToStringHandlesEmptyField() {
    Job jobTest = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job jobTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));

    assertEquals("\nID: " + jobTest.getId() +"\n"+
                    "Name: Product tester\n" +
                    "Employer: Data not available\n" +
                    "Location: Desert\n" +
                    "Position Type: Quality control\n" +
                    "Core Competency: Persistence\n", jobTest.toString());
    assertEquals("\nID: " + jobTest1.getId() +"\n" +
            "Name: Product tester\n" +
            "Employer: ACME\n" +
            "Location: Desert\n" +
            "Position Type: Data not available\n" +
            "Core Competency: Persistence\n", jobTest1.toString());
    }
}
