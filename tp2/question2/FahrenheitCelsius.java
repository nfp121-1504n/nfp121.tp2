package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       try{
           int [] tableau = new int[args.length];
           double reste;
           
           for (int i=0;i<args.length;i++){
               tableau[i] =Integer.parseInt(args[i]);
            }
            
           for (int j=0;j<tableau.length;j++){
               reste = fahrenheitEnCelsius(tableau[j]);
               System.out.println(tableau[j] + "\u00b0f--> " + String.format("%1.f" , reste)+ "\u00b0C");
            }
       
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int entree){
       float resultat = (float)5/9 * (entree-32);
	        return ((int)(resultat*10))/10.0f;
	}

     

}
