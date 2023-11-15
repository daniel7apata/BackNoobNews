package pe.edu.upc.aaw.demo01.dtos;

public class PublicationCategoryDTO {
    private String nameCategory;
    private int quantityPublication;

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public int getQuantityPublication() {
        return quantityPublication;
    }

    public void setQuantityPublication(int quantityPublication) {
        this.quantityPublication = quantityPublication;
    }
}
