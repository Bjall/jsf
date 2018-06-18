package jsf;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class WelcomeController {

		public String getMessage() {
			return "Bonjour";
		}
	
}
