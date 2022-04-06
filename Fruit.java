package Class;

import java.util.ArrayList;

   /**
    * 
    * @author julian.arbelaez
    *
    */

public class Fruit {
	
	
	 //Atributos	
    /**
    * Nombre de la fruta
    */	
	public String name;
	/**
	 * Peso promedio
	 */
	private float averageWeight;
	
	
		
	/**
	 * Declaramos el ArrayList
	 */
	public ArrayList<String>colors = new ArrayList<>();
	
	/**
	 * Se Crea el contructor sin parametros
	 */
	public Fruit() {
		
	}
		
    /**
     * Devuelve el Color de la fruta.
     * @return Color de la fruta
     */
	public ArrayList<String>getcolors(){
		return colors;
	}
	/**
	 * Modifica el color de la fruta
	 * @param colors
	 */
	public void setcolor(ArrayList<String>colors) {
		this.colors=colors
				;
	}
    /**
     * Devuelve el Nombre de la fruta.
     * @return Nombre de la fruta
     */

	public String getName() {
		return name;
	}
    /**
     * Modifica el Nombre de la fruta.
     * @param name
     */
	public void setName(String name) {
		this.name = name;
	}
     /**
      * Devuelve el Peso promedio.
      * @return
      */
	public float getAverageWeight() {
		return averageWeight;
	}
      /**
       * Modifica el Peso promedio.
       * @param averageWeight
       */
	public void setAverageWeight(float averageWeight) {
		this.averageWeight = averageWeight;
	}
	
	

}
