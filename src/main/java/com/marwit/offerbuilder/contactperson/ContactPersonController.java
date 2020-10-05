package com.marwit.offerbuilder.contactperson;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact-persons")
public class ContactPersonController {

    private ContactPersonService contactPersonService;

    public ContactPersonController(ContactPersonService contactPersonService) {
        this.contactPersonService = contactPersonService;
    }

    @GetMapping
    public List<ContactPerson> findAll(){
        return contactPersonService.findAll();
    }

    @PostMapping
    public ContactPerson addContactPerson(@RequestBody ContactPerson contactPerson){
        contactPersonService.save(contactPerson);
        return contactPerson;
    }

    @GetMapping("/{contactPersonId}")
    public ContactPerson getContactPerson(@PathVariable Long contactPersonId){
        return contactPersonService.findById(contactPersonId);
    }

    @PutMapping("/{contactPersonId}")
    public ContactPerson updateContactPerson(@RequestBody ContactPerson contactPerson, @PathVariable Long contactPersonId){
        contactPerson.setContactPersonId(contactPersonId);
        contactPersonService.save(contactPerson);
        return contactPerson;
    }

    @DeleteMapping("/{contactPersonId}")
    public String deleteById(@PathVariable Long contactPersonId){
        contactPersonService.deleteById(contactPersonId);
        return "Deleted Contact Person id: " + contactPersonId;
    }
}
