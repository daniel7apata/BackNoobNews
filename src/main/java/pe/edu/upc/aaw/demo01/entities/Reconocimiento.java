package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

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
    @Column(name = "idUsuario",nullable = false)
    private int idUsuario;

    //Constructor
    public Reconocimiento() {
    }

    //Constructor
    public Reconocimiento(int idReconocimiento, String descriptionAck, LocalDate dateAck, int idUsuario) {
        this.idReconocimiento = idReconocimiento;
        this.descriptionAck = descriptionAck;
        this.dateAck = dateAck;
        this.idUsuario = idUsuario;
    }

    //Getter
    public int getIdReconocimiento() {return idReconocimiento;}
    public String getDescriptionAck() {return descriptionAck;}
    public LocalDate getDateAck() {return dateAck;}
    public int getIdUsuario() {return idUsuario;}


    //Setter
    public void setIdReconocimiento(int idReconocimiento) {this.idReconocimiento = idReconocimiento;}
    public void setDescriptionAck(String descriptionAck) {this.descriptionAck = descriptionAck;}
    public void setDateAck(LocalDate dateAck) {this.dateAck = dateAck;}
    public void setIdUsuario(int idUsuario) {this.idUsuario = idUsuario;}

}
