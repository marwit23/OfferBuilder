package com.marwit.offerbuilder.inquiry;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inquiries")
public class InquiryController {

    private InquiryService inquiryService;

    public InquiryController(InquiryService inquiryService) {
        this.inquiryService = inquiryService;
    }

    @GetMapping
    public List<Inquiry> findAll() {
        return inquiryService.findAll();
    }

    @PostMapping
    public Inquiry addInquiry(@RequestBody Inquiry inquiry){
        inquiryService.save(inquiry);
        return inquiry;
    }

    @GetMapping("/{inquiryId}")
    public Inquiry findById(@PathVariable Long inquiryId) {
        return inquiryService.findById(inquiryId);
    }

    @PutMapping("/{inquiryId}")
    public Inquiry updateInquiry(@RequestBody Inquiry inquiry, @PathVariable Long inquiryId) {
        inquiry.setInquiryId(inquiryId);
        inquiryService.save(inquiry);
        return inquiry;
    }

    @DeleteMapping("/{inquiryId}")
    public String deleteById(@PathVariable Long inquiryId) {
        inquiryService.deleteById(inquiryId);
        return "Deleted Inquiry id: " + inquiryId;
    }
}
