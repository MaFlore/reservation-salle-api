package com.apiprojetsalle.reservationsalle.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "personnes")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "utilisateur_type")
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected Long id;
	
	@Column(name = "nom", nullable = false)
	protected String nom;

	@Column(name = "prenom", nullable = false)
	protected String prenom;
	
	@Column(name = "username", nullable = false, unique = true)
	protected String username;
	
	@Column(name = "password", nullable = false)
	protected String password;
	
	@Column(name = "email", nullable = true, unique = true)
	protected String email;
	
	@Column(name = "telephone",nullable = false,unique = true)
	protected String telephone;

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(String nom, String prenom, String username, String password, String email,
			String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
		this.email = email;
		this.telephone = telephone;
	}

	public Long getId() {
		return id;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Personne{" +
				"nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				", telephone='" + telephone + '\'' +
				'}';
	}
}
