package com.apiprojetsalle.reservationsalle.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "salles_materiels")
public class SalleMateriel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name="date_debut",nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebut;
	
	@Column(name="date_fin",nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFin;
	
	@Column(name="statut",nullable=false)
	private boolean statut;
	
	@Column(name="estLoue",nullable=false)
	private boolean estLoue;

	/*Ajout de la relation OneToMany entre SalleMateriel et Salle*/
	@OneToMany(mappedBy = "salleMateriel",fetch = FetchType.LAZY)
    private Set<Salle> salles;

	/*Ajout de la relation OneToMany entre SalleMateriel et Materiel*/
	@OneToMany(mappedBy = "salleMateriel",fetch = FetchType.LAZY)
    private Set<Materiel> materiels;

	public SalleMateriel() {

	}

	public SalleMateriel(Date dateDebut, Date dateFin, boolean statut, boolean estLoue) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.statut = statut;
		this.estLoue = estLoue;
	}

	public Long getId() {
		return id;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	public boolean isEstLoue() {
		return estLoue;
	}

	public void setEstLoue(boolean estLoue) {
		this.estLoue = estLoue;
	}

	public Set<Salle> getSalles() {
		return salles;
	}

	public void setSalles(Set<Salle> salles) {
		this.salles = salles;
	}

	public Set<Materiel> getMateriels() {
		return materiels;
	}

	public void setMateriels(Set<Materiel> materiels) {
		this.materiels = materiels;
	}

	@Override
	public String toString() {
		return "SalleMateriel{" +
				"dateDebut=" + dateDebut +
				", dateFin=" + dateFin +
				", statut=" + statut +
				", estLoue=" + estLoue +
				", salles=" + salles +
				", materiels=" + materiels +
				'}';
	}
}
