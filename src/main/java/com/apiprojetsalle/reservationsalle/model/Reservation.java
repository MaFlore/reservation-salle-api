package com.apiprojetsalle.reservationsalle.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "date_debut", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;

    @Column(name = "date_fin", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;

    /*Ajout de la relation ManyToOne entre Reservation et Client*/
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "client_id")
    private Client client;

    /*Ajout de la relation OneToMany entre Reservation et ReservationSalle*/
    @OneToMany(mappedBy = "reservation", fetch = FetchType.LAZY)
    private Set<ReservationSalle> reservationSalles;

    /*Ajout de la relation OneToOne entre Reservation et Evenement*/
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "evenement_id", referencedColumnName = "id")
    private Evenement evenement;

    public Reservation() {
    }

    public Reservation(Date dateDebut, Date dateFin, Client client, Evenement evenement) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.client = client;
        this.evenement = evenement;
    }

    public Integer getId() {
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<ReservationSalle> getReservationSalles() {
        return reservationSalles;
    }

    public void setReservationSalles(Set<ReservationSalle> reservationSalles) {
        this.reservationSalles = reservationSalles;
    }

    public Evenement getEvenement() {
        return evenement;
    }

    public void setEvenement(Evenement evenement) {
        this.evenement = evenement;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", client=" + client +
                ", reservationSalles=" + reservationSalles +
                ", evenement=" + evenement +
                '}';
    }
}
