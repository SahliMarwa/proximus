package com.proximus.backend.proximusBackend.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Marwa Essahli
 *
 */
public class Canal implements Serializable{


	private static final long serialVersionUID = 1L;

	@JsonProperty(value="id")
	Long id;
	
	@JsonProperty(value="name")
	String name;

	// boolean to verify if canal is available or not
	@JsonProperty(value="availability")
	boolean availability;

	/**
	 * Default Constructor.
	 */
	public Canal() {
		super();
	}
	/**
	 * Constructor using parameters.
	 * 
	 * @param id
	 * @param name
	 * @param availability
	 */
	public Canal(Long id, String name, boolean availability) {
		super();
		this.id = id;
		this.name = name;
		this.availability = availability;
	}
    /**
	 * Gets id.
	 * 
	 * @return the id
	 */
   public Long getId() {
		return id;
	}
	/**
	 * Sets id.
	 * 
	 * @param id the id
	 */

	public void setId(Long id) {
		this.id = id;
	}
     /**
	 * Gets name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
     /**
	 * Sets name.
	 * 
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}
     /**
	 * Gets availability.
	 * 
	 * @return the availability
	 */
	public boolean isAvailability() {
		return availability;
	}
    /**
	 * Sets availability.
	 * 
	 * @param availability the availability
	 */
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

     /**
	 * ToString.
	 * 
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Canal [id=" + id + ", name=" + name + ", availability=" + availability + "]";
	}

}
