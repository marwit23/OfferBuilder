package com.marwit.offerbuilder.contactperson;

import java.util.List;

public interface ContactPersonService {
    List<ContactPerson> findAll();
    ContactPerson findById(Long contactPersonId);
    void save(ContactPerson contactPerson);
    void deleteById(Long contactPersonId);


}
