package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="Reconocimiento")
public class Reconocimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReconocimiento;
    @Column(name = "descripcion",nullable = false,length = 200)
    private  String descripcion;
    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private  Usuario usuario;

    //Constructor
    public Reconocimiento() {
    }

    //Constructor

    public Reconocimiento(int idReconocimiento, String descripcion, LocalDate fecha, Usuario usuario) {
        this.idReconocimiento = idReconocimiento;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.usuario = usuario;
    }


    //Getter

    public int getIdReconocimiento() {
        return idReconocimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }


    //Setter


    public void setIdReconocimiento(int idReconocimiento) {
        this.idReconocimiento = idReconocimiento;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
