package camt.se331.shoppingcart.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
@Entity
public class ShoppingCart {
    @Id
    @GenerateValue

    @OneToMany(fetch = FetchType.EAGER)
    @Cascade(CascadeType.ALL)
    List<SelectedProduct> selectedProducts;
    @Temporal(TemporalType.TIMESTAMP)
    Date purchaseDate;

    List<SelectedProduct> selectedProducts;
    Date purchaseDate;
    public double getTotalProductPrice(){
        return 0.0;
    };

    public List<SelectedProduct> getSelectedProducts() {
        return selectedProducts;
    }

    public void setSelectedProducts(List<SelectedProduct> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public ShoppingCart(List<SelectedProduct> selectedProducts) {

        this.selectedProducts = selectedProducts;
    }

    public ShoppingCart() {

    }
}
