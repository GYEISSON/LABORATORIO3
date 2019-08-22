package edu.eci.cvds.tdd.registry;

import java.util.ArrayList; 
public class Registry {
	
	/**	
	* this is a list of person registred
	*/
	private ArrayList<Person> personas;
	
	/**
	* A registry constructor with empty list 
	*/
	public Registry(){
		personas = new ArrayList<Person>();
	}
	
    public RegisterResult registerVoter(Person p) {
		//Validate person alive
		if( !(p.isAlive()) ) return RegisterResult.DEAD;
		//Validate age person is valid 
		else if(p.getAge()<0 || p.getAge()>125) return RegisterResult.INVALID_AGE;
		//Valide age person is legaly
		else if(p.getAge()<18) return RegisterResult.UNDERAGE;
        //Validate isn't person registered
		else if(personas.contains(p)) return RegisterResult.DUPLICATED;
		//Add person to list registry
		this.personas.add(p);
		// TODO Validate person and return real result.
		return RegisterResult.VALID;
    }
}