package ro.uvt.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Diana Anton
 *
 */
@Entity
public class Author {
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	public Author()
	{

	}

	/**
	 * @param name
	 */
	public Author(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + "]";
	}
	
	public void print() {
		System.out.println("Author: " + name);
	}


	
}
