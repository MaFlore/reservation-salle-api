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

    /*Ajout de la relation OneToMany entre ReservationSalle et Reservation*/
    @OneToMany(mappedBy = "reservation", fetch = FetchType.LAZY)
    private Set<Reservation> reservations;

    /*Ajout de la relation OneToMany entre ReservationSalle et Salle*/
    @OneToMany(mappedBy = "salle", fetch = FetchType.LAZY)
    private Set<Salle> salles;

    public ReservationSalle(){

    }

    public ReservationSalle(Integer nombresSalles) {
        this.nombresSalles = nombresSalles;
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

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Set<Salle> getSalles() {
        return salles;
    }

    public void setSalles(Set<Salle> salles) {
        this.salles = salles;
    }

    @Override
    public String toString() {
        return "ReservationSalle{" +
                "nombresSalles=" + nombresSalles +
                ", reservations=" + reservations +
                ", salles=" + salles +
                '}';
    }

}
