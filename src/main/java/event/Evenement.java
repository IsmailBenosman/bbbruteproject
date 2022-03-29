package event;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Version;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include = JsonTypeInfo.As.PROPERTY,property = "type")
@JsonSubTypes({
	@Type(value=Even_Bal.class,name="bal"),
	@Type(value=Even_Tournois.class,name="tournois"),
	@Type(value=Even_Banquet.class,name="banquet")
})
public abstract class Evenement {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="id_evenement")
    protected Integer id;
	
	@NotEmpty(message="Champ obligatoire")
	protected String nomEven;
	
	@Future
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotEmpty(message="Champ obligatoire")
	protected LocalDate date;
	
	@NotEmpty(message="Champ obligatoire")
	protected LocalTime heure;
	
    @Version
	private int version;
	
	public Evenement() {}

	public Evenement(String nomEven, LocalDate date, LocalTime heure) {
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