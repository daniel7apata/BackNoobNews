package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.Usuario;

import java.time.LocalDate;
import java.time.LocalTime;

public class PublicacionDTO {


    private int idNews;
    private  String headline;
    private String lead;
    private String body;
    private int attachedFile;
    private LocalDate dateNews;
    private LocalTime timeNews;
    private boolean popular;
    private Usuario user;


    public int getIdNews() {
        return idNews;
    }

    public void setIdNews(int idNews) {
        this.idNews = idNews;
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

    public LocalDate getDateNews() {
        return dateNews;
    }

    public void setDateNews(LocalDate dateNews) {
        this.dateNews = dateNews;
    }

    public LocalTime getTimeNews() {
        return timeNews;
    }

    public void setTimeNews(LocalTime timeNews) {
        this.timeNews = timeNews;
    }

    public boolean isPopular() {
        return popular;
    }

    public void setPopular(boolean popular) {
        this.popular = popular;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
