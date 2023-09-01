package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Universidad")
public class Universidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniversidad;
    @Column(name = "universityName",nullable = false,length = 104)
    private  String universityName;

    //Constructor
    public Universidad() {
    }

    //Constructor

    public Universidad(int idUniversidad, String universityName) {
        this.idUniversidad = idUniversidad;
        this.universityName = universityName;
    }


    //Getter

    public int getIdUniversidad() {return idUniversidad;}
    public String getUniversityName() {return universityName;}


    //Setter

    public void setIdUniversidad(int idUniversidad) {this.idUniversidad = idUniversidad;}
    public void setUniversityName(String universityName) {this.universityName = universityName;}
}
