package com.apiprojetsalle.reservationsalle.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "salles")
public class Salle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "photo", nullable = true)
	private String photo;
	
	@Column(name = "matricule", nullable = false, unique = true)
	private String matricule;
	
	@Column(name = "nom", nullable = false)
	private String nom;
	
	@Column(name = "capacite", nullable = false)
	private Integer capacite;
	
	@Column(name = "prix", nullable = false)
	private Double prix;
	
	@Column(name = "statut", nullable = false)
	private Boolean statut;
	
	/*Ajout de la relation ManyToOne entre Salle et Responsable*/
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "responsable_id")
    private Responsable responsable;

	/*Ajout de la relation ManyToOne entre Salle et SalleMateriel*/
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "salle_id")
    private SalleMateriel salleMateriel;

	/*Ajout de la relation ManyToOne entre Salle et ReservationSalle*/
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "id_salle")
	private Salle salle;

	public Salle() {
	}

	public Salle(Long id, String photo, String matricule, String nom, Integer capacite, Double prix, Boolean statut,
				 Responsable responsable) {
		super();
		this.id = id;
		this.photo = photo;
		this.matricule = matricule;
		this.nom = nom;
		this.capacite = capacite;
		this.prix = prix;
		this.statut = statut;
		this.responsable = responsable;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
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

	public Integer getCapacite() {
		return capacite;
	}

	public void setCapacite(Integer capacite) {
		this.capacite = capacite;
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

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	@Override
	public String toString() {
		return "Salle{" +
				"photo='" + photo + '\'' +
				", matricule='" + matricule + '\'' +
				", nom='" + nom + '\'' +
				", capacite=" + capacite +
				", prix=" + prix +
				", statut=" + statut +
				", responsable=" + responsable +
				", salleMateriel=" + salleMateriel +
				", salle=" + salle +
				'}';
	}
}
