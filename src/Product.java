import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Product {
    String name;
    String color;
    int price;

    public Product(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public static void main(String[] args) {
        Product sneakers1 = new Product("adidas", "black", 2300);
        Product sneakers2 = new Product("nike", "white", 3300);
        Product sneakers3 = new Product("nike", "black", 2500);
        Product sneakers4 = new Product("adidas", "red", 3300);
        Product sneakers5 = new Product("nike", "red", 2300);

        List<Product> products = Arrays.asList(sneakers1, sneakers2, sneakers3, sneakers4, sneakers5);

        System.out.println("1. All Products");
        Stream<Product> allProducts = products.stream();
        allProducts.forEach(System.out::println);
        System.out.println();

        System.out.println("2. Products filtered by red color");
        Stream<Product> redProducts = products.stream().filter(product -> product.color == "red");
        redProducts.forEach(System.out::println);
        System.out.println();

        System.out.println("3. Products filtered by price >= 2500");
        Stream<Product> higherPrice = products.stream().filter(product -> product.price >= 2500);
        higherPrice.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}