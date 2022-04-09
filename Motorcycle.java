package Class;

/**
 * 
 * @author julian.arbelaez
 *
 */

public class Motorcycle {
	
	 /*Atributos*/
	
	
	 /**
	 * La matricula de la moto
	 */
    protected String enrollment;
	
	 /**
   	 * La marca de la moto 
   	 */
	protected String brand;
	 /**
   	 * El modelo de la moto
   	 */
	String model;
	 /**
   	 * El color de la moto
   	 */
	String color;
	 /**
   	 * El cilindraje de la moto 
   	 */
	int cylinder;
	
	/*Metodos*/
	
	/**
	 * Devuelve La matricula de la moto
	 * @return La matricula de la moto
	 */
	
	protected String getEnrollment() {
		return enrollment;
	}
	/**
	 * Modifica La matricula de la moto
	 * @param enrollment
	 */
	protected void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}
	/**
	 * Devulve La marca de la moto
	 * @return La marca de la moto 
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * Modifica La marca de la moto 
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * Devuelve  El modelo de la moto
	 * @return  El modelo de la moto
	 */
	public String getModel() {
		return model;
	}
	/**
	 * Modifica  El modelo de la moto
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * Devuelve El color de la moto
	 * @return El color de la moto
	 */
	public String getColor() {
		return color;
	}
	/**
	 * Modifica El color de la moto
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * Devuelve El cilindraje de la moto 
	 * @return El cilindraje de la moto 
	 */
	public int getCylinder() {
		return cylinder;
	}
	/**
	 * Modifica El cilindraje de la moto 
	 * @param cylinder
	 */
	public void setCylinder(int cylinder ) {
		this.cylinder = cylinder;
	}
	
	
	
	

}
