package com.example.logowanie_DM;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuotationApi {

    private List<Quotation> quotations;

    public QuotationApi() {
        this.quotations = new ArrayList<>();

        quotations.add(new Quotation("cytat1 cytat1", "Autor1 Jeden" ));
        quotations.add(new Quotation("cytat2 cytat2", "Autor2 Dwa" ));
        quotations.add(new Quotation("cytat3 cytat3", "Autor3 Trzy" ));
        quotations.add(new Quotation("cytat4 cytat4", "Autor4 Cztery" ));
    }

    @GetMapping("/api")
    public List<Quotation> getQuotations() {
        return quotations;
    }

    @PostMapping("/api")
    public boolean addQuation(@RequestBody Quotation quotation) {
        return  quotations.add(quotation);
    }

    @DeleteMapping("/api")
    public void deleteQuation(@RequestParam int index) {
        quotations.remove(index);
    }
}
