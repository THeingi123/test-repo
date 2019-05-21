package demo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Book
 *
 */
@Entity

public class Book implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	//private LocalDate releasedDate;
	private String author;
	private int price;
	private static final long serialVersionUID = 1L;
	
	
	
	

	
	public Book(String name, String author, int price) {
		super();
		this.name = name;
		//this.releasedDate = releasedDate;
		this.author = author;
		this.price = price;
	}
	public Book() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	/*public LocalDate getReleasedDate() {
		return this.releasedDate;
	}
*/
	/*public void setReleasedDate(LocalDate releasedDate) {
		this.releasedDate = releasedDate;
	}   */
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}   
	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
   
}
