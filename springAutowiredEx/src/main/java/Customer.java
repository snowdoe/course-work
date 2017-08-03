/**
 * Created by machu on 2017-05-27.
 */
public class Customer implements Subject {
    private Long id;
    private String address;

    public Customer() {
        this.id = 1L;
        this.address =  "default customer name";
    }

    public Customer(Long id, String address) {
        this.id = id;
        this.address =  address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
