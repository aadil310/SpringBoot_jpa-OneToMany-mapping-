package com.springboot_jpa.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot_jpa.jpa.Entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {

    
}
