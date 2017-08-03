import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * Created by machu on 2017-05-27.
 */
public class Company {
    private String name;

    @Autowired
    private List<Subject> subjects;


    public Company() {
        this.name = "default company name";
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", customer=" + subjects +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
