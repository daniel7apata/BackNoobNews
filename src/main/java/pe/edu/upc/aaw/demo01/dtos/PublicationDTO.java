package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.Users;

import java.time.LocalDate;
import java.time.LocalTime;

public class PublicationDTO {


    private int idPublication;
    private  String headline;
    private String lead;
    private String body;
    private int attachedFile;
    private LocalDate datePublication;
    private LocalTime timePublication;
    private boolean popular;
    private Users user;

    public int getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(int idPublication) {
        this.idPublication = idPublication;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getLead() {
        return lead;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getAttachedFile() {
        return attachedFile;
    }

    public void setAttachedFile(int attachedFile) {
        this.attachedFile = attachedFile;
    }

    public LocalDate getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }

    public LocalTime getTimePublication() {
        return timePublication;
    }

    public void setTimePublication(LocalTime timePublication) {
        this.timePublication = timePublication;
    }

    public boolean isPopular() {
        return popular;
    }

    public void setPopular(boolean popular) {
        this.popular = popular;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}