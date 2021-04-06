package com.health_insurance.phm_model;

import java.io.Serializable;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.kie.api.definition.type.Description;
import org.kie.api.definition.type.Label;

/**
 *
 * A contact
 */
@Label("Contact")
@Description("An actor's contact information.")
public class Contact implements Serializable {

	private static final long serialVersionUID = -6134286407515741163L;

	@Description(value = "An actor's name.")
	@Label(value = "Name")
	private java.lang.String name;
	@Description(value = "An actor's email address")
	@Label(value = "Email")
	private java.lang.String email;
	@Description(value = "An actor's phone number")
	@Label(value = "Phone")
	private java.lang.String phone;

	/**
	 *
	 * A contact.
	 */
	public Contact() {
	}

	/**
	 *
	 * @return the name of the contact
	 */
	public java.lang.String getName() {
		return this.name;
	}

	/**
	 *
	 * @param name the name of the contact
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 *
	 * @return the email address of the contact
	 */
	public java.lang.String getEmail() {
		return this.email;
	}

	/**
	 *
	 * @param email	the email address of the contact
	 */
	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	/**
	 *
	 * @return the phone number of the contact
	 */
	public java.lang.String getPhone() {
		return this.phone;
	}

	/**
	 *
	 * @param phone the phone number of the contact
	 */
	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}

	/**
	 *
	 * @return the object as a JSON string
	 */
	@Override
	public String toString() {
		final ObjectMapper objectMapper = new ObjectMapper();
		try {
			objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
			return objectMapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 *
	 * A contact
	 *
	 * @param name
	 * @param email
	 * @param phone
	 */
	public Contact(java.lang.String name, java.lang.String email,
			java.lang.String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

}