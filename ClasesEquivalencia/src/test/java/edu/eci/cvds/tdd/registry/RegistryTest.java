package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryDead() {
        Person person = new Person("fabian",1,20,Gender.MALE,false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
	
    @Test
    public void validateRegistryValidAge() {

        Person person = new Person("manuel",2,523,Gender.MALE,true);
		
        RegisterResult result = registry.registerVoter(person);
        
		Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
	
    @Test
    public void validateRegistryLegalyAge() {

        Person person = new Person("CARLOS",3,14,Gender.MALE,true);

		RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
	
    @Test
    public void validateRegistryDuplicated() {

        Person person = new Person("manuel",4,20,Gender.MALE,true);
		RegisterResult result = registry.registerVoter(person);
        RegisterResult result2 = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DUPLICATED, result2);
    }
	
    @Test
    public void validateRegistryResult() {

        Person person = new Person("yeisson",6,20,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

    // TODO Complete with more test cases
}