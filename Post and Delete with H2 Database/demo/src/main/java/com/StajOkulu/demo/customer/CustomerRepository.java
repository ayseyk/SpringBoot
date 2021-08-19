package com.StajOkulu.demo.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
//database ile alakalı save update delete işlemelri yapan metodlar içeren bir sınıfı miras alıyor.

    //h2 database te her seferinde tablolar uçuyor, her seferinde yeniden oluşturacak bir script yazacağız, resources

}
