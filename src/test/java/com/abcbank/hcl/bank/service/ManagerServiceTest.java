//package com.abcbank.hcl.bank.service;
//
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import com.abcbank.hcl.bank.model.Customer;
//import com.abcbank.hcl.bank.repository.CustomerRepository;
//
//import junit.framework.Assert;
//
//
//@RunWith(MockitoJUnitRunner.class)
//public class ManagerServiceImplTest {
//	
//	
//	@InjectMocks
//	private ManagerServiceImpl managerService;
//	
//	@Mock
//	private CustomerRepository customerRepository;
//
//	@BeforeClass
//	public static void setup() {
//		static Customer currentCoustmer = new Customer();
//		
//		
//		currentCustomer.setCoustmerName("Iron Man"));
//		currentCustomer.setAccountAadhar(998877);
//		currentCustomer.setCustomerPassword("Password");
//		currentCustomer.setAccountBranch("Banglore");
//		currentCustomer.setCoustmerCity("Banglore");
//		
//		//zero for new customer
//		currentCustomer.setAccountBalance(250);
//		currentCustomer.setCoustmerEmail("Ironman@gmail.com");
//		currentCustomer.setCoustmerPhNum(123456789);
//		currentCustomer.setAccountType("CREDIT");
//
//	}
//	
//	
////}
//	@Test
//	public void getCoustomerByNameTest() {
//		
//		
//		Mockito.when(coustmerRepository.findByCoustmerName()).thenReturn("Iron man");
//		String custName = customerService.getCustomerByName();
//	
//		Assert.classassertEquals("Iron man", custName);
//		
//	}
//	
//	
//	@Test
//	public void getCustomerByAccountNumber() {
//		
//		Mockito.when(customerRepository.findByCustomerAccount(accountNumber).thenReturn("Iron man"));
//		double currentBalance = customerService.getCustomerByAccountNumber();
//		
//		Assert.assertEquals(currentBalance,);
//	}
//	
//
//	
//}
