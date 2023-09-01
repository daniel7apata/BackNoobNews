package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nameUser",nullable = false,length = 50)
    private  String nameUser;
    @Column(name = "fatherSurname",nullable = false,length = 30)
    private String fatherSurname;
    @Column(name = "motherSurname",length = 30)
    private String motherSurname;
    @Column(name = "dateBirth",nullable = false)
    private LocalDate dateBirth;
    @Column(name = "email",nullable = false,length = 50)
    private String email;
    @Column(name = "password",nullable = false,length = 20)
    private String password;
    @Column(name = "linkedInProfile",nullable = false,length = 100)
    private String linkedInProfile;
    @Column(name = "dateRegistration",nullable = false)
    private LocalDate dateRegistration;
    @Column(name = "idTipoUsuario",nullable = false)
    private  int idTipoUsuario;
    @Column(name = "idConfiguracion",nullable = false)
    private  int idConfiguracion;
    @Column(name = "idUniversity",nullable = false)
    private  int idUniversity;



    //Constructor
    public Usuario() {
    }
    //Constructor

    public Usuario(int idUsuario, String nameUser, String fatherSurname, String motherSurname, LocalDate dateBirth, String email, String password, String linkedInProfile, LocalDate dateRegistration, int idTipoUsuario, int idConfiguracion, int idUniversity) {
        this.idUsuario = idUsuario;
        this.nameUser = nameUser;
        this.fatherSurname = fatherSurname;
        this.motherSurname = motherSurname;
        this.dateBirth = dateBirth;
        this.email = email;
        this.password = password;
        this.linkedInProfile = linkedInProfile;
        this.dateRegistration = dateRegistration;
        this.idTipoUsuario = idTipoUsuario;
        this.idConfiguracion = idConfiguracion;
        this.idUniversity = idUniversity;
    }


    //Getter
    public int getIdUsuario() {return idUsuario;}
    public String getNameUser() {return nameUser;}
    public String getFatherSurname() {return fatherSurname;}
    public String getMotherSurname() {return motherSurname;}
    public LocalDate getDateBirth() {return dateBirth;}
    public String getEmail() {return email;}
    public String getPassword() {return password;}
    public String getLinkedInProfile() {return linkedInProfile;}
    public LocalDate getDateRegistration() {return dateRegistration;}
    public int getIdTipoUsuario() {return idTipoUsuario;}
    public int getIdConfiguracion() {return idConfiguracion;}
    public int getIdUniversity() {return idUniversity;}


    //Setter
    public void setIdUsuario(int idUsuario) {this.idUsuario = idUsuario;}
    public void setNameUser(String nameUser) {this.nameUser = nameUser;}
    public void setFatherSurname(String fatherSurname) {this.fatherSurname = fatherSurname;}
    public void setMotherSurname(String motherSurname) {this.motherSurname = motherSurname;}
    public void setDateBirth(LocalDate dateBirth) {this.dateBirth = dateBirth;}
    public void setEmail(String email) {this.email = email;}
    public void setPassword(String password) {this.password = password;}
    public void setLinkedInProfile(String linkedInProfile) {this.linkedInProfile = linkedInProfile;}
    public void setDateRegistration(LocalDate dateRegistration) {this.dateRegistration = dateRegistration;}
    public void setIdTipoUsuario(int idTipoUsuario) {this.idTipoUsuario = idTipoUsuario;}
    public void setIdConfiguracion(int idConfiguracion) {this.idConfiguracion = idConfiguracion;}
    public void setIdUniversity(int idUniversity) {this.idUniversity = idUniversity;}
}
