package com.apiprojetsalle.reservationsalle.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "categories")
public class Categorie {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
	
	@Column(name = "code", nullable = false, unique = true)
	private String code;
	
	@Column(name = "libelle", nullable = false)
	private String libelle;
	
	/*Ajout de la relation OneToMany entre CategorieMateriel et Materiel*/
	@OneToMany(mappedBy = "categorie",fetch = FetchType.LAZY)
    private Set<Materiel> materiels;

	public Categorie() {
	}

	public Categorie(String code, String libelle, Set<Materiel> materiels) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.materiels = materiels;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Set<Materiel> getMateriels() {
		return materiels;
	}

	public void setMateriels(Set<Materiel> materiels) {
		this.materiels = materiels;
	}

	@Override
	public String toString() {
		return "Categorie{" +
				"code='" + code + '\'' +
				", libelle='" + libelle + '\'' +
				", materiels=" + materiels +
				'}';
	}
}
