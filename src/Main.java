import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Product door        = new Product("Wooden Door", 35);
        Product floorPanel  = new Product("Floor Panel", 25);
        Product window      = new Product("Glass Window", 10);

        // This collection will only have Product instances
        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        // System.out.println(products);

        // test Iterator inside a collection
        // Way 1
        final Iterator<Product> productIterator = products.iterator();
        while(productIterator.hasNext()) {
            Product product = productIterator.next();
            if (product.getWeight() > 20) {
                System.out.println(product);
            } else {
                productIterator.remove();
            }
        }

        System.out.println(products);

        // Way 2, same thing with Way 1
        for( Product product: products) {
            // System.out.println(product);
        }

        // check if it contains X
        System.out.println(products.contains(window));

        products.remove(floorPanel);

        System.out.println(products);

    }
}
