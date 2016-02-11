// CArtAgO artifact code for project projet_jacamo_FAPP

package projet_jacamo_FAPP;
import jason.asSyntax.Atom;


import cartago.*;

public class FappArtifact extends Artifact {
	void init(int initialValue) {
		defineObsProperty("count", initialValue);
	}
	
	@OPERATION
	void inc() {
		ObsProperty prop = getObsProperty("count");
		prop.updateValue(prop.intValue()+1);
		signal("tick");
	}
	
	@OPERATION
	public void cost_function() {
		System.out.println("it is cost function");
	}
	@OPERATION
	public void calcule_function() {
		System.out.println("it is calcule function");
	}
	
	
}

