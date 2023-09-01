package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;
    @Column(name = "categoryName",nullable = false,length = 20)
    private  String categoryName;

    //Constructor

    public Categoria() {
    }

    //Constructor

    public Categoria(int idCategoria, String categoryName) {
        this.idCategoria = idCategoria;
        this.categoryName = categoryName;
    }

    //Getter

    public int getIdCategoria() {return idCategoria;}
    public String getCategoryName() {return categoryName;}

    //Setter

    public void setIdCategoria(int idCategoria) {this.idCategoria = idCategoria;}
    public void setCategoryName(String categoryName) {this.categoryName = categoryName;}
}
