package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="Acknowledgment")
public class Acknowledgment {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAcknowledgment;
    @Column(name = "description",nullable = false,length = 200)
    private  String description;
    @Column(name = "dateAcknowledgment",nullable = false)
    private LocalDate dateAcknowledgment;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private Users user;

    //Constructor
    public Acknowledgment() {
    }

    public Acknowledgment(int idAcknowledgment, String description, LocalDate dateAcknowledgment, Users user) {
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

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}