package Class;

/**
 * 
 * @author julian.arbelaez
 *
 */

public class Book {
	
	
	 /*Atributos*/
	
	
	/**
	 * El código normalizado internacional para libros 
	 */
    private int ISBN;
    /**
	 * El Tituo del libro
	 */
    String title;
    /**
	 * El autor del libro 
	 */
    String author;
    /**
	 * El numero de paginas del libro 
	 */
    int numberofPages;
     
          
     
    /*Metodos*/

    /**
     * Devuelve el código normalizado internacional para libros 
     * @return El código normalizado internacional para libros 
     */
 
    protected int getISBN() {
        return ISBN;
    }
    /**
     * Mofifica El código normalizado internacional para libros 
     * @param ISBN
     */
    protected void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    /**
     * Devuelve El Tituo del libro
     * @return El Tituo del libro
     */
    public String getTitle() {
        return title;
    }
    /**
     * Modifica El Tituo del libro
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Devuelve El autor del libro 
     * @return El autor del libro 
     */
    public String getAuthor() {
        return author;
    }
    /**
     * Modifica El autor del libro 
     * @param author
     */
    public void setAutor(String author) {
        this.author = author;
    }
    /**
     * Devuelve El numero de paginas del libro 
     * @return El numero de paginas del libro 
     */
    public int getNumberofPages() {
        return numberofPages;
    }
    /**
     * Modifica El numero de paginas del libro 
     * @param numberofPages
     */
    public void setNumberofPages(int numberofPages) {
        this.numberofPages = numberofPages;
    }
     
	
	
	
	
	

}
