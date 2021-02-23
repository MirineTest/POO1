package TestManager;

import Manager.Owner;
import Manager.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestCaseTest {
    Owner owner=new Owner("miri");


    @Test
    public void VerifyThatCreatedTestCaseGeneral() {
        String Title = "Verify the Form1";
        TestCase test1 = new TestCase("Verify the Form1");
        test1.setPriority("Priority 2");
        test1.setDescription("The Test Case is by verify that the form");
        test1.setOwner(new Owner("Miri"));
        test1.addSteps("Paso1");
        test1.addSteps("Paso2");
        test1.addSteps("Paso3");
        test1.addSteps("Paso4");
        test1.setExpectedResults("Show the form");
        System.out.println(test1.getTitle());
        System.out.println(test1.getPriority());
        System.out.println(test1.getOwner().getName());
        System.out.println(test1.getDescription());
        System.out.println(test1.getSteps().get(0));
        System.out.println(test1.getSteps().get(1));
        System.out.println(test1.getSteps().get(2));
        System.out.println(test1.getSteps().get(3));
        System.out.println(test1.getExpectedResults());
        Assert.assertEquals(test1.getTitle(),"Verify the Form1");


    }
    @Test
    public void verifyThatTheUserCanCreateTestCaseSetPriority() {
        String Title = "Verify the Form1";
        String priority="Priority 1";
        TestCase test1 = new TestCase("Verify the Form1");
       // test1.setPriority("1");
        System.out.println(test1.getTitle());
        System.out.println(test1.getPriority());
        Assert.assertEquals(test1.getPriority(),priority);

    }
    @Test
    public void VerifyThatCreatedTestCaseSetOwner() {
        String Title = "Verify the Form1";
        owner.setName("Miri1");

        TestCase test2 = new TestCase("Verify the Form2");
        test2.setOwner(new Owner("Miri"));

        Assert.assertEquals(test2.getOwner().getName(),"Miri");


    }
}
