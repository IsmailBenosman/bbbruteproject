package model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Version;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "evenements",columnDefinition = "ENUM('even_tournois','even_banquet', 'even_bal')")
public abstract class Evenement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_evenement")
    protected Integer id;
	protected String nomEven;
	protected LocalDate date;
	protected LocalTime heure;
    @Version
	private int version;
	
	public Evenement() {

	}

	public Evenement(String nomEven, LocalDate date, LocalTime heure) {
		super();
		this.nomEven = nomEven;
		this.date = date;
		this.heure = heure;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomEven() {
		return nomEven;
	}

	public void setNomEven(String nomEven) {
		this.nomEven = nomEven;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getHeure() {
		return heure;
	}

	public void setHeure(LocalTime heure) {
		this.heure = heure;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Evenement [nomEven=" + nomEven + ", date=" + date + ", heure=" + heure + "]";
	}	

	
}