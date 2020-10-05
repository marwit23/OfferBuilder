package com.marwit.offerbuilder.contactperson;

import com.marwit.offerbuilder._exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactPersonServiceImpl implements ContactPersonService {

    private ContactPersonRepository contactPersonRepository;

    public ContactPersonServiceImpl(ContactPersonRepository contactPersonRepository) {
        this.contactPersonRepository = contactPersonRepository;
    }

    @Override
    public List<ContactPerson> findAll() {
        return contactPersonRepository.findAll();
    }

    @Override
    public ContactPerson findById(Long contactPersonId) {
        Optional<ContactPerson> result = contactPersonRepository.findById(contactPersonId);
        ContactPerson contactPerson;
        if(result.isPresent()) contactPerson = result.get();
        else throw new EntityNotFoundException("contact person", contactPersonId.toString());
        return contactPerson;
    }

    @Override
    public void save(ContactPerson contactPerson) {
        contactPersonRepository.save(contactPerson);

    }

    @Override
    public void deleteById(Long contactPersonId) {
        contactPersonRepository.deleteById(contactPersonId);

    }
}
