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
    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;
    @Column(name = "hora",nullable = false)
    private LocalTime hora;
    @Column(name = "like",nullable = false)
    private boolean like;
    @Column(name = "compartido",nullable = false)
    private boolean compartido;
    @Column(name = "comentario",nullable = false,length = 200)
    private  String comentario;

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

    public Interaccion(int idInteraccion, LocalDate fecha, LocalTime hora, boolean like, boolean compartido, String comentario, Publicacion publicacion, Usuario usuario) {
        this.idInteraccion = idInteraccion;
        this.fecha = fecha;
        this.hora = hora;
        this.like = like;
        this.compartido = compartido;
        this.comentario = comentario;
        this.publicacion = publicacion;
        this.usuario = usuario;
    }


    //Getter

    public int getIdInteraccion() {
        return idInteraccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public boolean isLike() {
        return like;
    }

    public boolean isCompartido() {
        return compartido;
    }

    public String getComentario() {
        return comentario;
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

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public void setCompartido(boolean compartido) {
        this.compartido = compartido;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
