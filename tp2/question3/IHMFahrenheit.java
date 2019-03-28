package question3;

import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degr� Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * m�thode d�clench�e lorsque le bouton de conversion est appuy�. 
   * remarquer que le champs de droite (les degr�s Celsius) n'est pas �ditable.
   * @param ae l'�v�nement transmis
   */
  public void actionPerformed( ActionEvent event ){
    Object ob = event.getSource();
    
    int fahrenheitTemp , celciusTemp;
     String text;
          try{      if (ob==boutonDeConversion){
              
              text = entree.getText();
              fahrenheitTemp = Integer.parseInt(text);
              celciusTemp =(int)fahrenheitEnCelsius(fahrenheitTemp);
              
                    text = Integer.toString (celciusTemp);
                   sortie.setText( Float.toString(celciusTemp));}
                  
                  
    }catch(NumberFormatException nfe){
      sortie.setText("error ! ");
    }
  }
  public static float fahrenheitEnCelsius( int entree){
       float resultat = (float)5/9 * (entree-32);
       if (resultat < -273.1f) resultat = -273.1f;
	return (resultat*10)/10.0f;
	        
	}
  
  
  public static void main(String[] args){
      new IHMFahrenheit();
    }
}
