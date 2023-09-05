package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;

@Entity
@Table(name="Partner")
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdPartner;

    @Column(name = "namePartner", nullable = false, length = 40)
    private String namePartner;
    @Column(name = "dniPartner", nullable = false, length = 8)
    private String dniPartner;
    @Column(name = "genderPartner", nullable = false)
    private char genderPartner;
    @Column(name = "typePartner", nullable = false, length = 20)
    private String typePartner;
    @ManyToOne
    @JoinColumn(name = "idClub")
    private Club club;

    public Partner() {
    }

    public Partner(int idPartner, String namePartner, String dniPartner, char genderPartner, String typePartner, Club club) {
        IdPartner = idPartner;
        this.namePartner = namePartner;
        this.dniPartner = dniPartner;
        this.genderPartner = genderPartner;
        this.typePartner = typePartner;
        this.club = club;
    }

    public int getIdPartner() {
        return IdPartner;
    }

    public String getNamePartner() {
        return namePartner;
    }

    public String getDniPartner() {
        return dniPartner;
    }

    public char getGenderPartner() {
        return genderPartner;
    }

    public String getTypePartner() {
        return typePartner;
    }

    public Club getClub() {
        return club;
    }

    public void setIdPartner(int idPartner) {
        IdPartner = idPartner;
    }

    public void setNamePartner(String namePartner) {
        this.namePartner = namePartner;
    }

    public void setDniPartner(String dniPartner) {
        this.dniPartner = dniPartner;
    }

    public void setGenderPartner(char genderPartner) {
        this.genderPartner = genderPartner;
    }

    public void setTypePartner(String typePartner) {
        this.typePartner = typePartner;
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
