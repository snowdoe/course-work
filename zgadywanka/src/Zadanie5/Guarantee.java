package Zadanie5;

import java.time.Instant;
import java.time.LocalDate;

/**
 * Created by machu on 2017-03-19.
 */
public class Guarantee {

    private final Product guaranteedProduct;
    private final LocalDate validUntil;

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public Product getGuaranteedProduct() {
        return guaranteedProduct;
    }

    public boolean isValid (){

        return validUntil.isAfter(LocalDate.now());

    }
    public Guarantee(Product guaranteedProduct, LocalDate validUntil) {
        this.guaranteedProduct = guaranteedProduct;
        this.validUntil = validUntil;
    }
}
