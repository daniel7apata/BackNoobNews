package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Interaccion")
public class Interaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInteraccion;
    @Column(name = "dateInteraction",nullable = false)
    private LocalDate dateInteraction;
    @Column(name = "timeInteraction",nullable = false)
    private LocalTime timeInteraction;
    @Column(name = "liked",nullable = false)
    private boolean liked;
    @Column(name = "shared",nullable = false)
    private boolean shared;
    @Column(name = "comment",nullable = false,length = 200)
    private  String comment;


    @ManyToOne
    @JoinColumn(name = "idPublicacion")
    private Publicacion publicacion;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    //Constructor
    public Interaccion() {
    }

    //Constructor

    public Interaccion(int idInteraccion, LocalDate dateInteraction, LocalTime timeInteraction, boolean liked, boolean shared, String comment, Publicacion publicacion, Usuario usuario) {
        this.idInteraccion = idInteraccion;
        this.dateInteraction = dateInteraction;
        this.timeInteraction = timeInteraction;
        this.liked = liked;
        this.shared = shared;
        this.comment = comment;
        this.publicacion = publicacion;
        this.usuario = usuario;
    }


    //Getter

    public int getIdInteraccion() {
        return idInteraccion;
    }

    public LocalDate getDateInteraction() {
        return dateInteraction;
    }

    public LocalTime getTimeInteraction() {
        return timeInteraction;
    }

    public boolean isLiked() {
        return liked;
    }

    public boolean isShared() {
        return shared;
    }

    public String getComment() {
        return comment;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }


    //Setter

    public void setIdInteraccion(int idInteraccion) {
        this.idInteraccion = idInteraccion;
    }

    public void setDateInteraction(LocalDate dateInteraction) {
        this.dateInteraction = dateInteraction;
    }

    public void setTimeInteraction(LocalTime timeInteraction) {
        this.timeInteraction = timeInteraction;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
