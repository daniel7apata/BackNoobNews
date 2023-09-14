package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;

@Entity
@Table(name="University")
public class University {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniversity;
    @Column(name = "nameUniversity",nullable = false,length = 104)
    private  String nameUniversity;

    //Constructor
    public University() {
    }

    public University(int idUniversity, String nameUniversity) {
        this.idUniversity = idUniversity;
        this.nameUniversity = nameUniversity;
    }

    public int getIdUniversity() {
        return idUniversity;
    }

    public void setIdUniversity(int idUniversity) {
        this.idUniversity = idUniversity;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }
}