package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


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
    @Column(name = "password",nullable = false,length = 200)
    private String password;
    @Column(name = "profileLinkedIn",nullable = false,length = 100)
    private String profileLinkedIn;
    @Column(name = "registrationDate",nullable = false)
    private LocalDate registrationDate;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user")
    private List<Role> roles;

    @OneToOne
    @JoinColumn(name="id_configuration")
    private Configuration configuration;

    @ManyToOne
    @JoinColumn(name="id_university")
    private University university;

    @Column(name = "username",nullable = false, length = 15, unique = true)
    private String username;

    private Boolean enabled;

    public Users() {
    }

    public Users(int idUser, String nameUser, String fatherSurname, String motherSurname, LocalDate birthDate, String email, String password, String profileLinkedIn, LocalDate registrationDate, List<Role> roles, Configuration configuration, University university, String username, Boolean enabled) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.fatherSurname = fatherSurname;
        this.motherSurname = motherSurname;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
        this.profileLinkedIn = profileLinkedIn;
        this.registrationDate = registrationDate;
        this.roles = roles;
        this.configuration = configuration;
        this.university = university;
        this.username = username;
        this.enabled = enabled;
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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}