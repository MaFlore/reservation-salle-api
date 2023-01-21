package com.apiprojetsalle.reservationsalle.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@DiscriminatorValue("Responsable")
@Table(name = "responsables")
public class Responsable extends Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/*Ajout de la relation OneToMany entre Responsable et Salle*/
	@OneToMany(mappedBy = "responsable",fetch = FetchType.LAZY)
    private Set<Salle> salles;

	public Responsable() {
	}

	public Responsable(String nom, String prenom, String username, String password, String email, String telephone) {
		super(nom, prenom, username, password, email, telephone);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Salle> getSalles() {
		return salles;
	}

	public void setSalles(Set<Salle> salles) {
		this.salles = salles;
	}

	@Override
	public String toString() {
		return "Responsable{" +
				"salles=" + salles +
				", nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				", telephone='" + telephone + '\'' +
				'}';
	}
}
