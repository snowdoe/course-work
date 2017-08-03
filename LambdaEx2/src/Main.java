import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by machu on 2017-05-07.
 */
public class Main {
    public static void main(String[] args) {
        List<Company> companyList = new ArrayList<>();

        companyList.add(new Company("Pierwsza","Krakow"));
        companyList.add(new Company("Druga","Warszawa"));
        companyList.add(new Company("Trzecia","Krakow"));
        companyList.add(new Company("Czwarta","Poznan"));
        companyList.add(new Company("Piata","Rzeszow"));

        System.out.println(
                companyList
                .stream()
                .map(a->a.getName())
                .collect(Collectors.toList()));


    }

}
