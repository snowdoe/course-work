/**
 * Created by machu on 2017-05-27.
 */
public class Contrahent implements Subject {
    private Long id;
    private String address;

    public Contrahent() {
        this.id = 1L;
        this.address =  "default conrahent name";
    }

    public Contrahent(Long id, String address) {
        this.id = id;
        this.address =  address;
    }

    @Override
    public String toString() {
        return "Contrahent{" +
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

