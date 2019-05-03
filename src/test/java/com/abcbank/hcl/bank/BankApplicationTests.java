package com.abcbank.hcl.bank;

import java.util.Optional;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.abcbank.hcl.bank.dto.CustomerRegistrationRequest;
import com.abcbank.hcl.bank.dto.LoginReqDTO;
import com.abcbank.hcl.bank.model.Customer;
import com.abcbank.hcl.bank.model.Employee;
import com.abcbank.hcl.bank.repository.CustomerRepository;
import com.abcbank.hcl.bank.repository.EmployeeRepository;
import com.abcbank.hcl.bank.service.CustomerServiceImpl;
import com.abcbank.hcl.bank.service.LoginServiceImpl;


@RunWith(MockitoJUnitRunner.Silent.class)
public class BankApplicationTests {

	@InjectMocks
	LoginServiceImpl loginService;
	CustomerServiceImpl customerService;
	
	@Mock
	EmployeeRepository empRepo;
	
	
	@Mock
	CustomerRepository custRepo;
	
	/*
	 * @Mock PetRepository petRepo;
	 */
	

	
	static Customer custModel= null;
	static Employee empModel= null;	
	static LoginReqDTO loginDTO= null;
	static Optional<Customer> custOptional = Optional.empty();	
	static Optional<Employee> empOptional = Optional.empty();	
	
	@BeforeClass
	public static void setup() {
		custModel= new Customer();
		custModel.setAccountNumber(1L);
		empModel = new Employee();	
		empModel.setEmpId(1L);
		loginDTO = new LoginReqDTO();		
		custOptional = Optional.of(custModel);	
		empOptional = Optional.of(empModel);	
	}
		
	  @Test 
	  public void testValidateLogin() 
	  { 
	  loginDTO.setUserID(1L);
	  loginDTO.setUserPassword("test");
	  loginDTO.setUserType("admin");
	  Mockito.when(custRepo.findById(1L)).thenReturn(custOptional); 
	  Mockito.when(empRepo.findById(1L)).thenReturn(empOptional); 	 
	  String message = loginService.validateLogin(loginDTO);
	  String message1 = "User validated successfully";
	  Assert.assertEquals(message1,message);	 
	 }
	  @Test 
	   public void testupdateCustomerDetails() 
	   { 
	   Customer custmodel2 = new Customer();
	   CustomerRegistrationRequest cust=new CustomerRegistrationRequest();
	   
	   custmodel2.setCoustmerEmail("ram@gmail.com");
	   custmodel2.setCoustmerPhNum(1111111111L);
	   Mockito.when(custRepo.save(custModel)).thenReturn(custmodel2);
	   String message = customerService.updateCustomerDetails(cust);
	   String message1 = "customer details updated successfully";
	   Assert.assertEquals(message1,message);
	   }

}
