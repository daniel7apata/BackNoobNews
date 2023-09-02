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
    @Column(name = "titular",nullable = false,length = 40)
    private  String titular;
    @Column(name = "bajada",nullable = false,length = 40)
    private String bajada;
    @Column(name = "cuerpo",nullable = false,length = 400)
    private String cuerpo;
    @Column(name = "archivoAdjunto",length = 100)
    private int archivoAdjunto;
    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;
    @Column(name = "hora",nullable = false)
    private LocalTime hora;
    @Column(name = "popular",nullable = false)
    private boolean popular;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;


    //Constructor
    public Publicacion() {
    }

    //Constructor

    public Publicacion(int idPublicacion, String titular, String bajada, String cuerpo, int archivoAdjunto, LocalDate fecha, LocalTime hora, boolean popular, Usuario usuario) {
        this.idPublicacion = idPublicacion;
        this.titular = titular;
        this.bajada = bajada;
        this.cuerpo = cuerpo;
        this.archivoAdjunto = archivoAdjunto;
        this.fecha = fecha;
        this.hora = hora;
        this.popular = popular;
        this.usuario = usuario;
    }


    //Getter

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public String getTitular() {
        return titular;
    }

    public String getBajada() {
        return bajada;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public int getArchivoAdjunto() {
        return archivoAdjunto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
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

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setBajada(String bajada) {
        this.bajada = bajada;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setArchivoAdjunto(int archivoAdjunto) {
        this.archivoAdjunto = archivoAdjunto;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setPopular(boolean popular) {
        this.popular = popular;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

