package com.marwit.offerbuilder.contactperson;

import com.marwit.offerbuilder.contactperson.ContactPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactPersonRepository extends JpaRepository<ContactPerson, Long> {
}
