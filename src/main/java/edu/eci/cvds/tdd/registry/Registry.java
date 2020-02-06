package edu.eci.cvds.tdd.registry;
import java.util.*;

public class Registry {
	private ArrayList<Person> registro;
	
	public Registry(){
		registro=new ArrayList<Person>();		
	}
	
    public RegisterResult registerVoter(Person m) {
		RegisterResult result=RegisterResult.VALID;
		if(result==RegisterResult.VALID) result=validateId(m);
		if(result==RegisterResult.VALID) result=validateAlive(m);
		if(result==RegisterResult.VALID) result=validateName(m);
		if(result==RegisterResult.VALID) result=validateAge(m);
		if(result==RegisterResult.VALID) result=validateAdult(m);
        return result;
    }
	
	private RegisterResult validateAdult(Person m){
		RegisterResult result=RegisterResult.VALID;
		if(m.getAge()>0 && m.getAge()<=17 ){
			result=RegisterResult.UNDERAGE;
		}		
		return result;
	}
	private RegisterResult validateId(Person m){
		RegisterResult result=RegisterResult.VALID;
		for(int i = 0; i < registro.size() && result == RegisterResult.VALID; i++){
			if (m.getId()==registro.get(i).getId()){
				result=RegisterResult.DUPLICATED;
			}
		}
		if(result==RegisterResult.VALID) registro.add(m);
		return result;
		
	}
	private RegisterResult validateAge(Person p){
		RegisterResult result=RegisterResult.VALID;
		if(p.getAge()<=0){
			result=RegisterResult.INVALID_AGE;
		}
		return result;	
	}
	private RegisterResult validateName(Person m){
		RegisterResult result=RegisterResult.VALID;
		if(m.getName().length()<1){
			result=RegisterResult.NO_NAME;
		}
	
		return result;
	}
	private RegisterResult validateAlive(Person m){
		RegisterResult result=RegisterResult.VALID;
		if(!p.isAlive()){
			result=RegisterResult.DEAD;
		}
		return result;
	
	}
	

}
