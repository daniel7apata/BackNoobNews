package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.Publicacion;

public class CategoriaDTO {

    private int idCategory;
    private  String nameCategory;
    private Publicacion news;

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
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