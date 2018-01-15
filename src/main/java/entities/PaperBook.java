package entities;

import javax.persistence.Entity;

@Entity
public class PaperBook extends Book {
    private String inStock;

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }
}
