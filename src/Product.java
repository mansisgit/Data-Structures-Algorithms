import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

    private String name;
    private BigDecimal price;
    public Product(String name, String price){
        this.name= name;
        this.price = new BigDecimal(price);

    }

    public BigDecimal getRoundedPrice(int decimalPlaces){
        return price.setScale(decimalPlaces, RoundingMode.UP);

    }
    public static void main(String[] args) {
        Product item = new Product("wedge","10.345");
        BigDecimal rounded = item.getRoundedPrice(2);
        System.out.println("original price:"+item.price);
        System.out.println("rounded price:" + rounded);
        //945//
    }


}
