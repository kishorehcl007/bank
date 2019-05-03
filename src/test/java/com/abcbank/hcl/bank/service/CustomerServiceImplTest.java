package com.abcbank.hcl.bank.service;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.abcbank.hcl.bank.model.Customer;
import com.abcbank.hcl.bank.repository.*;
public class CustomerServiceImplTest {
	
	@InjectMocks
	CustomerServiceImpl customerService;
	@Mock
	private CustomerRepository customerRepository;
	
	public static void setup() {
		
		
		Customer customer=new Customer();
		customer.setCustomerEmail("Ram@gmail.com");
		customer.setCustomerPhNum(123456787);
		
	}
	@Test
	public void testupdateCustomerDetails() {
		Mockito.when(customerRepository.findByCustomerName(cusAccNam));
		
		
		
		
		
		
		
	}
	}

	

	
}
=======
//package com.abcbank.hcl.bank.service;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.abcbank.hcl.bank.model.Customer;
//import com.abcbank.hcl.bank.repository.*;
//public class CustomerServiceImplTest {
//	
//	@InjectMocks
//	CustomerServiceImpl customerService;
//	@Mock
//	private CustomerRepository customerRepository;
//	
//	public static void setup() {
//		
//		
//		Customer customer=new Customer();
//		customer.setCoustmerEmail("Ram@gmail.com");
//		customer.setCoustmerPhNum(123456787);
//		
//	}
//	@Test
//	public void testupdateCustomerDetails() {
//		Mockito.when(customerRepository.findByCustomerName(cusAccNam);
//		
//		
//		
//		
//		
//		
//		
//	}
//	}
//
//	
//
//	
//}
