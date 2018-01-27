package domain;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Organisation {
    private long id;
    private String nameoforganisation;
    private String requirementsoforganisation;

    public long getId() {
        return id;
    }

    public String getNameoforganisation() {
        return nameoforganisation;
    }

    public String getRequirementsoforganisation() {
        return requirementsoforganisation;
    }

    @Override
    public String toString() {
        return "Organisation{" +
                "id=" + id +
                ", nameoforganisation='" + nameoforganisation + '\'' +
                ", requirementsoforganisation='" + requirementsoforganisation + '\'' +
                '}';
    }

    public Organisation(long id, String nameoforganisation, String requirementsoforganisation) {
        this.id = id;
        this.nameoforganisation = nameoforganisation;
        this.requirementsoforganisation = requirementsoforganisation;



    }
}
