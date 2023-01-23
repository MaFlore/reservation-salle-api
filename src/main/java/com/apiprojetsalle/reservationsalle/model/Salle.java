package com.apiprojetsalle.reservationsalle.model;

import javax.persistence.*;
import java.util.Set;

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
    @ManyToOne()
    @JoinColumn(name = "responsable_id")
    private Responsable responsable;

	/*Ajout de la relation OneToMany entre Salle et SalleMateriel*/
	@OneToMany(mappedBy = "salleMateriel",fetch = FetchType.LAZY)
	private Set<SalleMateriel> salleMateriels;

	/*Ajout de la relation OneToMany entre Salle et ReservationSalle*/
	@OneToMany(mappedBy = "salle", fetch = FetchType.LAZY)
	private Set<ReservationSalle> reservationSalles;

	public Salle() {
	}

	public Salle(String photo, String matricule, String nom, Integer capacite, Double prix, Boolean statut, Responsable responsable) {
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

	public Set<SalleMateriel> getSalleMateriels() {
		return salleMateriels;
	}

	public void setSalleMateriels(Set<SalleMateriel> salleMateriels) {
		this.salleMateriels = salleMateriels;
	}

	public Set<ReservationSalle> getReservationSalles() {
		return reservationSalles;
	}

	public void setReservationSalles(Set<ReservationSalle> reservationSalles) {
		this.reservationSalles = reservationSalles;
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
				", salleMateriels=" + salleMateriels +
				", reservationSalles=" + reservationSalles +
				'}';
	}
}
