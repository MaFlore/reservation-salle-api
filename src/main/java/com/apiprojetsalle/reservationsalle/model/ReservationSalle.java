package com.apiprojetsalle.reservationsalle.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "reservations_salles")
public class ReservationSalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombres_salles")
    private Integer nombresSalles;

    /*Ajout de la relation ManyToOne entre ReservationSalle et Reservation*/
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    /*Ajout de la relation ManyToOne entre ReservationSalle et Salle*/
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "salle_id")
    private Salle salle;

    public ReservationSalle() {
    }

    public ReservationSalle(Integer nombresSalles, Reservation reservation, Salle salle) {
        this.nombresSalles = nombresSalles;
        this.reservation = reservation;
        this.salle = salle;
    }

    public Long getId() {
        return id;
    }

    public Integer getNombresSalles() {
        return nombresSalles;
    }

    public void setNombresSalles(Integer nombresSalles) {
        this.nombresSalles = nombresSalles;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    @Override
    public String toString() {
        return "ReservationSalle{" +
                "nombresSalles=" + nombresSalles +
                ", reservation=" + reservation +
                ", salle=" + salle +
                '}';
    }
}
