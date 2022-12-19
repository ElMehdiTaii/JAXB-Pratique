package ma.enset;
import jakarta.xml.bind.annotation.*;
import java.util.Date;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Compte {
    private int code;
    private double solde;
    @XmlTransient
    private Date dateCreation;
    @XmlAttribute
    private TypeCompte type;

    public Compte() {
    }

    public Compte(int code, double solde, Date dateCreation, TypeCompte type) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.type = type;
    }

    public TypeCompte getType() {
        return type;
    }

    public void setType(TypeCompte type) {
        this.type = type;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                ", dateCreation=" + dateCreation +
                ", type=" + type +
                '}';
    }
}
