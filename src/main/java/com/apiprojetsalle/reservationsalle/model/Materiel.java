package com.apiprojetsalle.reservationsalle.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "materiels")
public class Materiel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "matricule", nullable = false, unique = true)
	private String matricule;
	
	@Column(name = "nom", nullable = false, unique = true)
	private String nom;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "prix", nullable = false)
	private Double prix;
	
	@Column(name = "statut", nullable = false)
	private Boolean statut;

	/*Ajout de la relation OneToMany entre Materiel et SalleMateriel*/
	@OneToMany(mappedBy = "materielSalle",fetch = FetchType.LAZY)
	private Set<SalleMateriel> salleMateriels;

	/*Ajout de la relation ManyToOne entre Materiel et CategorieMateriel*/
    @ManyToOne()
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

	public Materiel() {
	}

	public Materiel(String matricule, String nom, String description, Double prix, Boolean statut, Categorie categorie) {
		this.matricule = matricule;
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.statut = statut;
		this.categorie = categorie;
	}

	public Long getId() {
		return id;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Boolean getStatut() {
		return statut;
	}

	public void setStatut(Boolean statut) {
		this.statut = statut;
	}

	public Set<SalleMateriel> getSalleMateriels() {
		return salleMateriels;
	}

	public void setSalleMateriels(Set<SalleMateriel> salleMateriels) {
		this.salleMateriels = salleMateriels;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Materiel{" +
				"matricule='" + matricule + '\'' +
				", nom='" + nom + '\'' +
				", description='" + description + '\'' +
				", prix=" + prix +
				", statut=" + statut +
				", salleMateriels=" + salleMateriels +
				", categorie=" + categorie +
				'}';
	}
}
