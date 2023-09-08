package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;


@Entity
@Table(name="Category")
public class Category {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategory;
    @Column(name = "nameCategory",nullable = false,length = 20)
    private  String nameCategory;

    @ManyToOne
    @JoinColumn(name = "id_publication")
    private Publication publication;

    public Category() {
    }

    public Category(int idCategory, String nameCategory, Publication publication) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
        this.publication = publication;
    }

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

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }
}