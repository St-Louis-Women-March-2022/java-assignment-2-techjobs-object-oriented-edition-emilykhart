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
    String jobReturnString = jobTest.toString();
    assertTrue(jobReturnString.contains("ID: "+jobTest.getId()));
    assertTrue(jobReturnString.contains("Name: "+jobTest.getName()));
    assertTrue(jobReturnString.contains("Employer: "+jobTest.getEmployer()));
    assertTrue(jobReturnString.contains("Location: "+jobTest.getLocation()));
    assertTrue(jobReturnString.contains("Position Type: "+jobTest.getPositionType()));
    assertTrue(jobReturnString.contains("Core Competency: "+jobTest.getCoreCompetency()));

}
@Test
    public void testToStringHandlesEmptyField(){
    Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

}
}
