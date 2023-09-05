package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;

@Entity
@Table(name="Universidad")
public class Universidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniversity;
    @Column(name = "name",nullable = false,length = 104)
    private  String name;

    //Constructor
    public Universidad() {
    }

    //Constructor

    public Universidad(int idUniversity, String name) {
        this.idUniversity = idUniversity;
        this.name = name;
    }

    public int getIdUniversity() {
        return idUniversity;
    }

    public void setIdUniversity(int idUniversity) {
        this.idUniversity = idUniversity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}