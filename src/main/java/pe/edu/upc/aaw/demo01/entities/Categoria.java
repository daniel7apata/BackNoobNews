package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;


@Entity
@Table(name="Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;
    @Column(name = "nombreCategoria",nullable = false,length = 20)
    private  String nombreCategoria;

    @ManyToOne
    @JoinColumn(name = "idPublicacion")
    private Publicacion publicacion;



    //Constructor

    public Categoria() {
    }

    //Constructor

    public Categoria(int idCategoria, String nombreCategoria, Publicacion publicacion) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.publicacion = publicacion;
    }


    //Getter

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }


    //Setter


    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
}
