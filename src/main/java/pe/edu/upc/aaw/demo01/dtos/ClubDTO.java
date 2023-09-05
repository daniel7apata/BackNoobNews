package pe.edu.upc.aaw.demo01.dtos;

import java.time.LocalDate;

public class ClubDTO {
    private int idClub;
    private  String nameClub;
    private String adressClub;
    private LocalDate creationDateClub;
    private String emailClub;

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
