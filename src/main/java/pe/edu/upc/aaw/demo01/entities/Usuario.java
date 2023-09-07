package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "nameUser",nullable = false,length = 50)
    private  String nameUser;
    @Column(name = "fatherSurname",nullable = false,length = 30)
    private String fatherSurname;
    @Column(name = "motherSurname",length = 30)
    private String motherSurname;
    @Column(name = "birthDate",nullable = false)
    private LocalDate birthDate;
    @Column(name = "email",nullable = false,length = 50)
    private String email;
    @Column(name = "password",nullable = false,length = 20)
    private String password;
    @Column(name = "profileLinkedIn",nullable = false,length = 100)
    private String profileLinkedIn;
    @Column(name = "registrationDate",nullable = false)
    private LocalDate registrationDate;

    @OneToOne
    @JoinColumn(name="idUserType")
    private  TipoUsuario userType;

    @OneToOne
    @JoinColumn(name="idSettings")
    private  Configuracion settings;

    @ManyToOne
    @JoinColumn(name="idUniversity")
    private  Universidad university;



    //Constructor
    public Usuario() {
    }
    //Constructor


    public Usuario(int idUser, String name, String fatherSurname, String motherSurname, LocalDate birthDate, String email, String password, String profileLinkedIn, LocalDate registrationDate, TipoUsuario userType, Configuracion settings, Universidad university) {
        this.idUser = idUser;
        this.nameUser = name;
        this.fatherSurname = fatherSurname;
        this.motherSurname = motherSurname;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
        this.profileLinkedIn = profileLinkedIn;
        this.registrationDate = registrationDate;
        this.userType = userType;
        this.settings = settings;
        this.university = university;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return nameUser;
    }

    public void setName(String name) {
        this.nameUser = nameUser;
    }

    public String getFatherSurname() {
        return fatherSurname;
    }

    public void setFatherSurname(String fatherSurname) {
        this.fatherSurname = fatherSurname;
    }

    public String getMotherSurname() {
        return motherSurname;
    }

    public void setMotherSurname(String motherSurname) {
        this.motherSurname = motherSurname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfileLinkedIn() {
        return profileLinkedIn;
    }

    public void setProfileLinkedIn(String profileLinkedIn) {
        this.profileLinkedIn = profileLinkedIn;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public TipoUsuario getUserType() {
        return userType;
    }

    public void setUserType(TipoUsuario userType) {
        this.userType = userType;
    }

    public Configuracion getSettings() {
        return settings;
    }

    public void setSettings(Configuracion settings) {
        this.settings = settings;
    }

    public Universidad getUniversity() {
        return university;
    }

    public void setUniversity(Universidad university) {
        this.university = university;
    }
}