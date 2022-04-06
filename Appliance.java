package Class;

/**
 * 
 * @author julian.arbelaez
 *
 */

public class Appliance {
	
	//Atributos

	/**
     * El precio del electrodomestico
     */
    float price;
   
    /**
     * Color del electrodomestico
     */
    String color;
   
    /**
     * Indica el consumo energetico del electrodomestico
     */
    protected char energyConsumption;
   
    /**
     * Peso del electrodomestico
     */
    float weight;
   
     
    
  //Métodos publicos
    /**
     * Devuelve el precio base del electrodomestico
     * @return precio base del electrodomestico
     */
    public double getPrice() {
        return price;
    }
    
    /**
	  * Modifica el precio del electrodomestico
	  * @param price
	  */
	 public void setPrice(float price) {
	        this.price = price;
	    }
    /**
     * Devuelve el color del electrodomestico
     * @return color del elesctrodomestico
     */
    public String getColor() {
        return color;
    }
   
    /**
	  * Modifica el color del electrodomestico
	  * @param name
	  */
	 public void setColor(String color) {
	        this.color = color;
	    }
    
     /**
     * Devuelve el consumo energetico del electrodomestico
     * @return consumo energetico del electrodomestico
     */
    public char getEnergyConsumption() {
        return energyConsumption;
    }
    
    /**
	  * Modifica el consumo energetico del electrodomestico
	  * @param energyConsumption
	  */
	 public void setEnergyConsumption(char energyConsumption) {
	        this.energyConsumption = energyConsumption;
	    }
    /**
     * Devuelve el peso del electrodomestico
     * @return peso del electrodomestico
     */
    public double getWeight() {
        return weight;
    }
    
    /**
	  * Modifica el peso del electrodomestico
	  * @param weight
	  */
	 public void setWeight(float weight) {
	        this.weight = weight;
	    }
    
    
	
}
