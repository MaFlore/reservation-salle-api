package com.apiprojetsalle.reservationsalle.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "evenements")
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "matricule", unique = true)
    private String matricule;

    @Column(name = "type_evenement", nullable = false)
    private String typeEvenement;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "description")
    private String description;

    @Column(name = "date_debut", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;

    @Column(name = "date_fin", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;

    /*Ajout de la relation OneToOne entre Evenement et Reservation*/
    @OneToOne(mappedBy = "evenement")
    private Reservation reservation;

    /*Ajout de la relation OneToMany entre Evenement et Participant*/
    @OneToMany(mappedBy = "participant", fetch = FetchType.LAZY)
    private Set<Participant> participants;

    public Evenement() {

    }

    public Evenement(String matricule, String typeEvenement, String nom, String description, Date dateDebut, Date dateFin) {
        this.matricule = matricule;
        this.typeEvenement = typeEvenement;
        this.nom = nom;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
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

    public String getTypeEvenement() {
        return typeEvenement;
    }

    public void setTypeEvenement(String typeEvenement) {
        this.typeEvenement = typeEvenement;
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

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Set<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<Participant> participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Evenement{" +
                "matricule='" + matricule + '\'' +
                ", typeEvenement='" + typeEvenement + '\'' +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", reservation=" + reservation +
                ", participants=" + participants +
                '}';
    }
}
