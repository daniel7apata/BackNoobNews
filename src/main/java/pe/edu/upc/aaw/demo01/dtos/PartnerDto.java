package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.Club;

import javax.persistence.*;

public class PartnerDto {


    private int IdPartner;

    private String namePartner;

    private String dniPartner;

    private char genderPartner;

    private String typePartner;
    private Club club;

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
