package TestManager;
import Manager.Owner;

import org.junit.Assert;
import org.junit.Test;

public class OwnerTest {
    @Test
    public void VerifyThatOwnerIsCreatedWithName() {
        Owner owner = new Owner("Miri");
        Assert.assertEquals(owner.getName(), "Miri");

    }
    @Test
    public void VerifyThatOwnerIsCreatedWithLastName(){
        Owner owner = new Owner("Miri");
        owner.setLastName("Huanca");
        Assert.assertEquals(owner.getLastName(),"Huanca");
    }
    @Test
    public void VerifyThatOwnerIsCreatedWithRole(){
        Owner owner = new Owner("Miri");
        owner.setRole("Admin");
        Assert.assertEquals(owner.getRole(),"Admin");
    }
}

