package jsf;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PersonneController {
	
	private Personne personne = new Personne();

	  public Personne getPersonne() {
	    return personne;
	  }

	  public void chercher() {
	    String nomAChercher = personne.getNom();
	    // ... effectuer la recherche dans un référentiel de personnes
	  }
}
