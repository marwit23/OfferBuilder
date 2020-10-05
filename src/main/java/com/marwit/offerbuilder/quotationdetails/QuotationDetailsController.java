package com.marwit.offerbuilder.quotationdetails;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quotation-details")
public class QuotationDetailsController {

    private QuotationDetailsService quotationDetailsService;

    public QuotationDetailsController(QuotationDetailsService quotationDetailsService) {
        this.quotationDetailsService = quotationDetailsService;
    }

    @GetMapping
    public List<QuotationDetails> findAll() {
        return quotationDetailsService.findAll();
    }

    @PostMapping
    public QuotationDetails addQuotationDetails(@RequestBody QuotationDetails quotationDetails){
        quotationDetailsService.save(quotationDetails);
        return quotationDetails;
    }

    @GetMapping("/{quotationDetailsId}")
    public QuotationDetails findById(@PathVariable Long quotationDetailsId) {
        return quotationDetailsService.findById(quotationDetailsId);
    }

    @PutMapping("/{quotationDetailsId}")
    public QuotationDetails updateQuotationDetails(@RequestBody QuotationDetails quotationDetails, @PathVariable Long quotationDetailsId) {
        quotationDetails.setQuotationDetailsId(quotationDetailsId);
        quotationDetailsService.save(quotationDetails);
        return quotationDetails;
    }

    @DeleteMapping("/{quotationDetailsId}")
    public String deleteById(@PathVariable Long quotationDetailsId) {
        quotationDetailsService.deleteById(quotationDetailsId);
        return "Deleted Quotation Details id: " + quotationDetailsId;
    }
}
