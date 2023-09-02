package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="Reconocimiento")
public class Reconocimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAcknowledgment;
    @Column(name = "description",nullable = false,length = 200)
    private  String description;
    @Column(name = "dateAcknowledgment",nullable = false)
    private LocalDate dateAcknowledgment;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private  Usuario user;

    //Constructor
    public Reconocimiento() {
    }

    public Reconocimiento(int idAcknowledgment, String description, LocalDate dateAcknowledgment, Usuario user) {
        this.idAcknowledgment = idAcknowledgment;
        this.description = description;
        this.dateAcknowledgment = dateAcknowledgment;
        this.user = user;
    }

    public int getIdAcknowledgment() {
        return idAcknowledgment;
    }

    public void setIdAcknowledgment(int idAcknowledgment) {
        this.idAcknowledgment = idAcknowledgment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateAcknowledgment() {
        return dateAcknowledgment;
    }

    public void setDateAcknowledgment(LocalDate dateAcknowledgment) {
        this.dateAcknowledgment = dateAcknowledgment;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
