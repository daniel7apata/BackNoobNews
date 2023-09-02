package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;

@Entity
@Table(name="Universidad")
public class Universidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniversidad;
    @Column(name = "nombre",nullable = false,length = 104)
    private  String nombre;

    //Constructor
    public Universidad() {
    }

    //Constructor

    public Universidad(int idUniversidad, String nombre) {
        this.idUniversidad = idUniversidad;
        this.nombre = nombre;
    }


    //Getter

    public int getIdUniversidad() {
        return idUniversidad;
    }

    public String getNombre() {
        return nombre;
    }


    //Setter

    public void setIdUniversidad(int idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
