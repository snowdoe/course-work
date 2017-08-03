package Zadanie5;

import java.time.LocalDate;

/**
 * Created by machu on 2017-03-19.
 */
public class Test {

    public static void main(String[] args) {
        LocalDate testDate=LocalDate.now().plusDays(30);

        Product testProduct = new Product("Ferrari","Super auto","Najszybsze sa czerwone!");
        Guarantee testGuarantee = new Guarantee(testProduct, testDate);
        if (testGuarantee.isValid()) System.out.println(testGuarantee.getGuaranteedProduct()+" is valid until: " + testGuarantee.getValidUntil());
        else System.out.println(testGuarantee.getGuaranteedProduct()+" is not valid");


        testDate=LocalDate.now().minusDays(30);
        Product testProduct1 = new Product("Kaloryfer","TAki o grzejnik","Grzeje a co ma robic?");
        Guarantee testGuarantee1 = new Guarantee(testProduct1, testDate);
        if (testGuarantee1.isValid()) System.out.println(testGuarantee1.getGuaranteedProduct()+" is valid until: " + testGuarantee1.getValidUntil());
        else System.out.println(testGuarantee1.getGuaranteedProduct()+" is not valid");
    }

}
