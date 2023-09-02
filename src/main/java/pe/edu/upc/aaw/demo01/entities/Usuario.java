package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;


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

    @OneToOne
    @JoinColumn(name="idTipoUsuario")
    private  TipoUsuario tipoUsuario;

    @OneToOne
    @JoinColumn(name="idConfiguracion")
    private  Configuracion configuracion;

    @ManyToOne
    @JoinColumn(name="idUniversidad")
    private  Universidad universidad;



    //Constructor
    public Usuario() {
    }
    //Constructor

    public Usuario(int idUsuario, String nameUser, String fatherSurname, String motherSurname, LocalDate dateBirth, String email, String password, String linkedInProfile, LocalDate dateRegistration, TipoUsuario tipoUsuario, Configuracion configuracion, Universidad universidad) {
        this.idUsuario = idUsuario;
        this.nameUser = nameUser;
        this.fatherSurname = fatherSurname;
        this.motherSurname = motherSurname;
        this.dateBirth = dateBirth;
        this.email = email;
        this.password = password;
        this.linkedInProfile = linkedInProfile;
        this.dateRegistration = dateRegistration;
        this.tipoUsuario = tipoUsuario;
        this.configuracion = configuracion;
        this.universidad = universidad;
    }


    //Getter

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getFatherSurname() {
        return fatherSurname;
    }

    public String getMotherSurname() {
        return motherSurname;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getLinkedInProfile() {
        return linkedInProfile;
    }

    public LocalDate getDateRegistration() {
        return dateRegistration;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public Configuracion getConfiguracion() {
        return configuracion;
    }

    public Universidad getUniversidad() {
        return universidad;
    }


    //Setter

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public void setFatherSurname(String fatherSurname) {
        this.fatherSurname = fatherSurname;
    }

    public void setMotherSurname(String motherSurname) {
        this.motherSurname = motherSurname;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLinkedInProfile(String linkedInProfile) {
        this.linkedInProfile = linkedInProfile;
    }

    public void setDateRegistration(LocalDate dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
}
