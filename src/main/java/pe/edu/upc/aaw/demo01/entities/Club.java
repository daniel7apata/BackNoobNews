package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="Club")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClub;
    @Column(name = "nameClub",nullable = false,length = 40)
    private  String nameClub;
    @Column(name = "adressClub",nullable = false,length = 50)
    private String adressClub;
    @Column(name = "creationDateClub",nullable = false)
    private LocalDate creationDateClub;
    @Column(name = "emailClub",nullable = false,length = 35)
    private String emailClub;

    public Club() {
    }

    public Club(int idClub, String nameClub, String adressClub, LocalDate creationDateClub, String emailClub) {
        this.idClub = idClub;
        this.nameClub = nameClub;
        this.adressClub = adressClub;
        this.creationDateClub = creationDateClub;
        this.emailClub = emailClub;
    }

    public int getIdClub() {
        return idClub;
    }

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }

    public String getNameClub() {
        return nameClub;
    }

    public void setNameClub(String nameClub) {
        this.nameClub = nameClub;
    }

    public String getAdressClub() {
        return adressClub;
    }

    public void setAdressClub(String adressClub) {
        this.adressClub = adressClub;
    }

    public LocalDate getCreationDateClub() {
        return creationDateClub;
    }

    public void setCreationDateClub(LocalDate creationDateClub) {
        this.creationDateClub = creationDateClub;
    }

    public String getEmailClub() {
        return emailClub;
    }

    public void setEmailClub(String emailClub) {
        this.emailClub = emailClub;
    }
}
