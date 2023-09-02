package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="Reconocimiento")
public class Reconocimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReconocimiento;
    @Column(name = "descriptionAck",nullable = false,length = 200)
    private  String descriptionAck;
    @Column(name = "dateAck",nullable = false)
    private LocalDate dateAck;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private  Usuario usuario;

    //Constructor
    public Reconocimiento() {
    }

    //Constructor

    public Reconocimiento(int idReconocimiento, String descriptionAck, LocalDate dateAck, Usuario usuario) {
        this.idReconocimiento = idReconocimiento;
        this.descriptionAck = descriptionAck;
        this.dateAck = dateAck;
        this.usuario = usuario;
    }


    //Getter

    public int getIdReconocimiento() {
        return idReconocimiento;
    }

    public String getDescriptionAck() {
        return descriptionAck;
    }

    public LocalDate getDateAck() {
        return dateAck;
    }

    public Usuario getUsuario() {
        return usuario;
    }


    //Setter


    public void setIdReconocimiento(int idReconocimiento) {
        this.idReconocimiento = idReconocimiento;
    }

    public void setDescriptionAck(String descriptionAck) {
        this.descriptionAck = descriptionAck;
    }

    public void setDateAck(LocalDate dateAck) {
        this.dateAck = dateAck;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
