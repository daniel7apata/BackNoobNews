package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Publicacion")
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublicacion;
    @Column(name = "headline",nullable = false,length = 40)
    private  String headline;
    @Column(name = "lead",nullable = false,length = 40)
    private String lead;
    @Column(name = "body",nullable = false,length = 400)
    private String body;
    @Column(name = "idCategoria")
    private int idCategoria;
    @Column(name = "attachedFile",length = 100)
    private int attachedFile;
    @Column(name = "dateNews",nullable = false)
    private LocalDate dateNews;
    @Column(name = "timeNews",nullable = false)
    private LocalTime timeNews;
    @Column(name = "popular",nullable = false)
    private boolean popular;


    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;


    //Constructor
    public Publicacion() {
    }

    //Constructor

    public Publicacion(int idPublicacion, String headline, String lead, String body, int idCategoria, int attachedFile, LocalDate dateNews, LocalTime timeNews, boolean popular, Usuario usuario) {
        this.idPublicacion = idPublicacion;
        this.headline = headline;
        this.lead = lead;
        this.body = body;
        this.idCategoria = idCategoria;
        this.attachedFile = attachedFile;
        this.dateNews = dateNews;
        this.timeNews = timeNews;
        this.popular = popular;
        this.usuario = usuario;
    }


    //Getter

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public String getHeadline() {
        return headline;
    }

    public String getLead() {
        return lead;
    }

    public String getBody() {
        return body;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public int getAttachedFile() {
        return attachedFile;
    }

    public LocalDate getDateNews() {
        return dateNews;
    }

    public LocalTime getTimeNews() {
        return timeNews;
    }

    public boolean isPopular() {
        return popular;
    }

    public Usuario getUsuario() {
        return usuario;
    }


    //Setter


    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setAttachedFile(int attachedFile) {
        this.attachedFile = attachedFile;
    }

    public void setDateNews(LocalDate dateNews) {
        this.dateNews = dateNews;
    }

    public void setTimeNews(LocalTime timeNews) {
        this.timeNews = timeNews;
    }

    public void setPopular(boolean popular) {
        this.popular = popular;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
