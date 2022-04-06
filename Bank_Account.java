package Class;


/**
 * 
 * @author julian.arbelaez
 *
 */

public class Bank_Account {
	
	//Atributos
	/**
	 * Nombre del usuario
	 */	
	String Name;
	/**
	 * Numero de cuenta
	 */
	private int AcountNumber;
	/**
	 * Numero de identificacion de usuario
	 */
	int indentificationNumber;
	/**
	 * Estado de la cuenta protegido
	 */
	protected Boolean activated;
	
	//Metodos publicos
	
	/**
	 *  Devuelve el nombre del usuario
	 * @return nombre de usuario
	 */
	public String getName() {
		return Name;
			
	}
	/**
	 * Modifica el nombre del usuario
	 * @param name
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * Devuelve el numero de la cuenta
	 * @return Numero de la cuenta
	 */
	public int getAcountNumber() {
		return AcountNumber;
	}
	/**
	 * Modifica el numero de la cuenta
	 * @param acountNumber
	 */
	public void setAcountNumber(int acountNumber) {
		AcountNumber = acountNumber;
	}
	/**
	 * Devuelve el numero de identificacion del usuario
	 * @return Numero de identificacion del usuario
	 */
	public int getIndentificationNumber() {
		return indentificationNumber;
	}
	/**
	 * Modifica el numero de identificacion del usuario
	 * @param indentificationNumber
	 */
	public void setIndentificationNumber(int indentificationNumber) {
		this.indentificationNumber = indentificationNumber;
	}
	
	/**
	 * Devuelve el estado de la cuenta
	 * @return estado de la cuenta
	 */
	public Boolean getActivated() {
		return activated;
	}
	/**
	 * Modifica el estado de la cuenta
	 * @param activated
	 */
	public void setActivated(Boolean activated) {
		this.activated = activated;
	}
	
	
	
	

}
