package com.apiprojetsalle.reservationsalle.model;



import javax.persistence.*;
import java.util.Set;


@Entity
@DiscriminatorValue("Client")
@Table(name = "clients")
public class Client extends Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected Long id;

	/*Ajout de la relation OneToMany entre Client et Reservation*/
	@OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
	private Set<Reservation> reservations;

	public Client() {
	}

	public Client(String nom, String prenom, String username, String password, String email, String telephone) {
		super(nom, prenom, username, password, email, telephone);
	}

	@Override
	public Long getId() {
		return id;
	}

	public Set<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

	@Override
	public String toString() {
		return "Client{" +
				"reservations=" + reservations +
				", nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				", telephone='" + telephone + '\'' +
				'}';
	}
}
