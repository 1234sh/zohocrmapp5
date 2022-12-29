package com.zohocrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;
//import com.zohocrm.entities.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private com.zohocrm.repository.BillingRepository billingRepo;
	@Override
	public void generateBill(Billing bill) {
		billingRepo.save(bill);
	}

}
