package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
	@Test 
	public void validateAdult(){
		Registry registry = new Registry();
		Person person = new Person("Hernesto Acevedo",1023456789,20,Gender.MALE,true);
		RegisterResult result = registry.registerVoter(person);		
		Assert.assertEquals(RegisterResult.VALID, result);
	}
	
	@Test 
	public void invalidateAdult(){
		Registry registry = new Registry();
		Person person = new Person("Hernesto Acevedo",1023456789,17,Gender.MALE,true);
		RegisterResult result = registry.registerVoter(person);		
		Assert.assertEquals(RegisterResult.UNDERAGE, result);		
	}
	@Test 
	public void invalidateAge(){
		Registry registry = new Registry();
		Person person = new Person("Hernesto Acevedo",1023456789,-5,Gender.MALE,true);
		RegisterResult result = registry.registerVoter(person);		
		Assert.assertEquals(RegisterResult.INVALID_AGE, result);
	}
	
	
	@Test 
	public void validateName(){
		Registry registry = new Registry();
		Person person = new Person("Hernesto Acevedo",1023456789,20,Gender.MALE,true);
		RegisterResult result = registry.registerVoter(person);		
		Assert.assertEquals(RegisterResult.VALID, result);		
	}
	
	@Test 
	public void invalidateName(){
		Registry registry = new Registry();
		Person person = new Person("",1023456789,20,Gender.MALE,true);
		RegisterResult result = registry.registerVoter(person);		
		Assert.assertEquals(RegisterResult.NO_NAME, result);		
	}
	
	@Test 
	public void validateAlive(){
		Registry registry = new Registry();
		Person person = new Person("Hernesto Acevedo",1023456789,20,Gender.MALE,true);
		RegisterResult result = registry.registerVoter(person);		
		Assert.assertEquals(RegisterResult.VALID, result);		
	}
	
	@Test 
	public void invalidateAlive(){
		Registry registry = new Registry();
		Person person = new Person("Hernesto Acevedo",1023456789,20,Gender.MALE,false);
		RegisterResult result = registry.registerVoter(person);		
		Assert.assertEquals(RegisterResult.DEAD, result);		
	}
}
