package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;


@Entity
@Table(name="Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;
    @Column(name = "categoryName",nullable = false,length = 20)
    private  String categoryName;

    @ManyToOne
    @JoinColumn(name = "idPublicacion")
    private Publicacion publicacion;



    //Constructor

    public Categoria() {
    }

    //Constructor

    public Categoria(int idCategoria, String categoryName, Publicacion publicacion) {
        this.idCategoria = idCategoria;
        this.categoryName = categoryName;
        this.publicacion = publicacion;
    }


    //Getter

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }


    //Setter


    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
}
