package edu.eci.cvds.tdd.registry;

public class Registry {
	
    public RegisterResult registerVoter(Person p) {
		if( !(p.isAlive()) ) return RegisterResult.DEAD;
		else if(p.getAge()<0 || p.getAge()>125) return RegisterResult.INVALID_AGE;
		else if(p.getAge()<18) return RegisterResult.UNDERAGE;
        // TODO Validate person and return real result.
        return RegisterResult.VALID;
    }
}