package Zadanie5;

/**
 * Created by machu on 2017-03-19.
 */
public class Product {
    private final String name;
    private String description, specification;



    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", specification='" + specification + '\'' +
                '}';
    }

    public Product(String name) {
        this.name = name;
        this.description = "Description of "+name+" to be defined";
        this.specification = "Specification of "+name+"to be defined";
    }

    public Product(String name, String description, String specification) {
        this.name = name;
        this.description = description;
        this.specification = specification;
    }

}
