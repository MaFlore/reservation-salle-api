package com.apiprojetsalle.reservationsalle.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Administrateur")
@Table(name = "administrateurs")
public class Administrateur extends Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	public Administrateur() {

	}

	public Administrateur(String nom, String prenom, String username, String password, String email, String telephone) {
		super(nom, prenom, username, password, email, telephone);
	}
}
