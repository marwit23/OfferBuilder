package com.marwit.offerbuilder.quotation;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quotations")
public class QuotationController {

    private QuotationService quotationService;

    public QuotationController(QuotationService quotationService) {
        this.quotationService = quotationService;
    }

    @GetMapping
    public List<Quotation> findAll() {
        return quotationService.findAll();
    }

    @PostMapping
    public Quotation addQuotation(@RequestBody Quotation quotation){
        quotationService.save(quotation);
        return quotation;
    }

    @GetMapping("/{quotationId}")
    public Quotation findById(@PathVariable Long quotationId) {
        return quotationService.findById(quotationId);
    }

    @PutMapping("/{quotationId}")
    public Quotation addQuotation(@RequestBody Quotation quotation, @PathVariable Long quotationId) {
        quotation.setQuotationId(quotationId);
        quotationService.save(quotation);
        return quotation;
    }

    @DeleteMapping("/{quotationId}")
    public String deleteById(@PathVariable Long quotationId) {
        quotationService.deleteById(quotationId);
        return "Deleted Quotation id: " + quotationId;
    }
}
