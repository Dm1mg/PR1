import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine{

    private final List<Product> productList;
    private int money;
    public HotDrinksVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList){
            if (product.getName().equals(name)){
                money += product.getPrice();
                return product;

            }
        }
        return null;
    }
    public HotDrinks getProduct(String name, int temperature){
        for (Product product : productList){
            if (product instanceof HotDrinks){
                if (product.getName().equals(name) && ((HotDrinks) product).getTemperature() == temperature){
                    return  (HotDrinks) product;
                }
            }
        }
        return null;
    }
}
