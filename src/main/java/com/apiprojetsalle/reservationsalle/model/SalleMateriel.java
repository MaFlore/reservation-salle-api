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

	/*Ajout de la relation ManyToOne entre SalleMateriel et Salle*/
	@ManyToOne()
	@JoinColumn(name = "salle_id")
	private SalleMateriel salleMateriel;

	/*Ajout de la relation ManyToOne entre SalleMateriel et Materiel*/
	@ManyToOne()
	@JoinColumn(name = "materiel_id")
	private SalleMateriel materielSalle;

	public SalleMateriel() {
	}

	public SalleMateriel(Date dateDebut, Date dateFin, boolean statut, boolean estLoue, SalleMateriel salleMateriel, SalleMateriel materielSalle) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.statut = statut;
		this.estLoue = estLoue;
		this.salleMateriel = salleMateriel;
		this.materielSalle = materielSalle;
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

	public SalleMateriel getSalleMateriel() {
		return salleMateriel;
	}

	public void setSalleMateriel(SalleMateriel salleMateriel) {
		this.salleMateriel = salleMateriel;
	}

	public SalleMateriel getMaterielSalle() {
		return materielSalle;
	}

	public void setMaterielSalle(SalleMateriel materielSalle) {
		this.materielSalle = materielSalle;
	}

	@Override
	public String toString() {
		return "SalleMateriel{" +
				"dateDebut=" + dateDebut +
				", dateFin=" + dateFin +
				", statut=" + statut +
				", estLoue=" + estLoue +
				", salleMateriel=" + salleMateriel +
				", materielSalle=" + materielSalle +
				'}';
	}
}
