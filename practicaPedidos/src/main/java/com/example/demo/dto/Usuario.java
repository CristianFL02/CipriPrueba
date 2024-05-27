package com.example.demo.dto;

public class Usuario {
	private int id;
	private String firstName;
	private String lastName;
	private long tlf;
	private String mail;
	private String direccion;

	public Usuario(int id, String firstName, String lastName, long tlf, String mail, String direccion) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tlf = tlf;
		this.mail = mail;
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getTlf() {
		return tlf;
	}

	public void setTlf(long tlf) {
		this.tlf = tlf;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", tlf=" + tlf + ", mail="
				+ mail + ", direccion=" + direccion + "]";
	}
	
	
}
