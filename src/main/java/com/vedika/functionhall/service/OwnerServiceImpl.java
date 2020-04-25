package com.vedika.functionhall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedika.functionhall.model.Owner;
import com.vedika.functionhall.repository.OwnerRepository;
import com.vedika.functionhall.service.OwnerService;

@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public List<Owner> findAll() {
        return ownerRepository.findAll();
    }


    @Override
    public List<Owner> findAllByOrderById() {
        return ownerRepository.findAllByOrderById();
    }
    
    
    @Override
    public void saveOrUpdateOwner(Owner owner) {
        ownerRepository.save(owner);
    }

    @Override
    public void deleteOwner(String id) {
        ownerRepository.deleteById(id);
    }
}
