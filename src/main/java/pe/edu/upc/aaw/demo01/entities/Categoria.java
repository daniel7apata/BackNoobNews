package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;


@Entity
@Table(name="Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;
    @Column(name = "nameCategory",nullable = false,length = 20)
    private  String nameCategory;

    @ManyToOne
    @JoinColumn(name = "idNews")
    private Publicacion news;

    public Categoria() {
    }

    public Categoria(int idCategoria, String nameCategory, Publicacion news) {
        this.idCategoria = idCategoria;
        this.nameCategory = nameCategory;
        this.news = news;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public Publicacion getNews() {
        return news;
    }

    public void setNews(Publicacion news) {
        this.news = news;
    }
}