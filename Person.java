package Class;

import java.util.Date;

/**
 * Representa una persona
 * @author julian.arbelaez
 *
 */
public class Person {
	
	
   //Atributos	
     /**
     * Nombre de la persona
     */
	String name;
	 /**
	   * Priner apellido de la persona
	   */
	String lastname1;
	 /**
	   * Segundo apellido de la persona
	   */
	String lastname2;
	 /**
	   * Fecha de nacimiento de la persona
	   */
    Date dateBirth;
    /**
     * Altura de la persona
     */
    float height;
    /**
     * Peso de la persona
     */
	int weight;
	
	//Metodos publicos
	
	/**
	 * Devuelve el Nombre de la persona
	 * @return Nombre de persona.
	 */
	 public String getName() {
	        return name;
	    }
	 /**
	  * Modifica el nombre de la persona
	  * @param name
	  */
	 public void setName(String name) {
	        this.name = name;
	    }
		
	 /**
	  * Devuelve el primer apellido  de la persona.	
	  * @return Primer apellido de la persona
	  */
	 public String getLastName1() {
	        return lastname1;
	    }
	 /**
	  * Modifica el primer apellido de lapersona
	  * @param lastname1
	  */
	 public void setLastName1(String lastname1) {
	        this.lastname1 = lastname1;
	    }
	 /**
	  * Devuelve el segundo apellido de la persona
	  * @return SEgundo paellido de la persona
	  */
		    
	 public String getLastName2() {
	        return lastname2;
	    }
      /**
       * Modifica el primer apellido de lapersona
       * @param lastname2
       */
	 public void setLastName2(String lastname2) {
	        this.lastname2 = lastname2;
	    }   
	   /**
	    *  Devuelve la fecha de naciomiento de la persdona
	    * @return Fecha de naciomiento de la persdona
	    */
	 public Date getDateBirth() {
	        return dateBirth;
	    }
       /**
        * Modifica la fecha de naciomiento de la persdona
        * @param dateBirth
        */
	 public void setDateBirth(Date dateBirth) {
	        this.dateBirth = dateBirth;
	    }     
	 
	 	/**
	 	 * Devuelve la altura de la persona
	 	 * @return altura de la persona
	 	 */
	 public float getHeight() {
	        return height;
	    }
        /**
         * Modifica la altura  de la persona
         * @param height
         */
	 public void setHeight(float height) {
	        this.height = height;
	    }   
	     /**
	      * Devuelve el peso de la persona
	      * @return
	      */
	 public int getWeight() {
	        return weight;
	    }
         /**
          * Modifica el peso de la persona
          * @param weight
          */
	 public void setWeight(int weight) {
	        this.weight = weight;
	    }   
	 
	  
	 
	 
	 
}


