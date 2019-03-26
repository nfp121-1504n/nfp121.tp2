package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @Marilynn el hossry (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {
      
	/**
	 * le point d'entrée de cette application, dont le commentaire est à
	 * compléter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] args) {
		int [] tableau = new int[args.length];
		double reste;
		
		for (int i=0;i<args.length;i++){
		    tableau[i] = Integer.parseInt(args[i]);
		  }
		  
		for (int j=0;j<tableau.length;j++){
		    reste = fahrenheitEnCelsius(tableau[j]);
		    
		
		System.out.println(tableau[j] + "\u00B0F -> " + String.format("%.1f" , reste)  + "\u00B0C"); // ligne,
}																	// format
																				// imposés
																				
	}

	/**
	 * la méthode à compléter.
	 * 
	 * @param f
	 *            la valeur en degré Fahrenheit
	 * @return la conversion en degré Celsius
	 */
	public static float fahrenheitEnCelsius(int entree) {
	    float resultat = (float)5/9 * (entree-32);
	        return ((int)(resultat*10))/10.0f;
	}

}
