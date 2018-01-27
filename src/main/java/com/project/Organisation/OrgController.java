package com.project.Organisation;

import domain.Organisation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class OrgController {
    @GetMapping("/organisation")
    public List<Organisation> getAllOrganisationDetails()
    {
     return Arrays.asList(new Organisation(1l, "VaibhavBazaar", "Groceries"));
    }
}
