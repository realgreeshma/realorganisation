package Controller;

import domain.Organisation;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

public class OrgController {
    @GetMapping("/organisation")
    public List<Organisation> getAllOrganisationDetails()
    {
     return Arrays.asList(new Organisation(1l, "VaibhavBazaar", "Groceries"));
    }
}
