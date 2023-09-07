package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.Configuracion;
import pe.edu.upc.aaw.demo01.entities.TipoUsuario;
import pe.edu.upc.aaw.demo01.entities.Universidad;

import java.time.LocalDate;

public class UsuarioDTO {

    private int idUser;
    private  String name;
    private String fatherSurname;
    private String motherSurname;
    private LocalDate birthDate;
    private String email;
    private String password;
    private String profileLinkedIn;
    private LocalDate registrationDate;
    private TipoUsuario userType;
    private Configuracion settings;
    private Universidad university;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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