package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Publicacion")
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNews;
    @Column(name = "headline",nullable = false,length = 40)
    private  String headline;
    @Column(name = "lead",nullable = false,length = 40)
    private String lead;
    @Column(name = "body",nullable = false,length = 400)
    private String body;
    @Column(name = "attachedFile",length = 100)
    private int attachedFile;
    @Column(name = "dateNews",nullable = false)
    private LocalDate dateNews;
    @Column(name = "timeNews",nullable = false)
    private LocalTime timeNews;
    @Column(name = "popular",nullable = false)
    private boolean popular;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private Usuario user;


    //Constructor
    public Publicacion() {
    }

    public Publicacion(int idNews, String headline, String lead, String body, int attachedFile, LocalDate dateNews, LocalTime timeNews, boolean popular, Usuario user) {
        this.idNews = idNews;
        this.headline = headline;
        this.lead = lead;
        this.body = body;
        this.attachedFile = attachedFile;
        this.dateNews = dateNews;
        this.timeNews = timeNews;
        this.popular = popular;
        this.user = user;
    }

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
