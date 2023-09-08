package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="Users")
public class Users {

    @Id
    @PrimaryKeyJoinColumn
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
    @JoinColumn(name="id_Role")
    private Role role;

    @OneToOne
    @JoinColumn(name="id_configuration")
    private Configuration configuration;

    @ManyToOne
    @JoinColumn(name="id_university")
    private University university;

    public Users() {
    }

    public Users(int idUser, String nameUser, String fatherSurname, String motherSurname, LocalDate birthDate, String email, String password, String profileLinkedIn, LocalDate registrationDate, Role role, Configuration configuration, University university) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.fatherSurname = fatherSurname;
        this.motherSurname = motherSurname;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
        this.profileLinkedIn = profileLinkedIn;
        this.registrationDate = registrationDate;
        this.role = role;
        this.configuration = configuration;
        this.university = university;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}