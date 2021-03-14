package com.infy.User_Service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}









//package com.infy.User_Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.infy.User_Service.dto.BuyerDTO;
//import com.infy.User_Service.entity.Buyer;
//import com.infy.User_Service.repository.BuyerRepository;
//import com.infy.User_Service.service.BuyerService;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class UserServiceApplicationTests {
//
//	
////		@Mock
////		BuyerRepository buyerRepo;
////		
////		@Test
////	    public void contextLoads() {
////	    }
////		
////		@InjectMocks
////		BuyerService service= new BuyerService();
////		
////		@Test
////		public void authenticateBuyerDetailsValid() throws Exception{
////			Buyer buyer = new Buyer();
////			buyer.setBuyerId(1);
////			 buyer.setEmail("saurbha@gmail.com");
////			 buyer.setIsactive(1);
////			 buyer.setIsPrivileged(1);
////			 buyer.setName("Saurbha Kumar");
////			 buyer.setPhonenumber("9999888878");
////			 buyer.setPassword("Kumar@w*3996");
////			 
////			Optional<Buyer> list2=Optional.of(buyer);
////			Mockito.when(buyerRepo.findById(1)).thenReturn(list2);
////			BuyerDTO buy=service.getSpecificBuyer(list2.get().getBuyerId());
////			
////		Assertions.assertEquals(1,buy.getBuyerId());
////		}
////		public void authenticateBuyerDetailsInvalid() throws Exception
////		{
////			Buyer buyer = new Buyer();
////			buyer.setBuyerId(1);
////			 buyer.setEmail("saurbha@gmail.com");
////			 buyer.setIsactive(1);
////			 buyer.setIsPrivileged(1);
////			 buyer.setName("Saurbha Kumar");
////			 buyer.setPhonenumber("9999888878");
////			 buyer.setPassword("Kumar@w*3996");
////			 
////			 Buyer buyer1 = new Buyer();
////			 buyer1.setBuyerId(12);
////			 buyer1.setEmail("abc@gmail.com");
////			 buyer1.setIsactive(0);
////			 buyer1.setIsPrivileged(1);
////			 buyer1.setName("abc xyz");
////			 buyer1.setPhonenumber("9997654323");
////			 buyer1.setPassword("Kumar*3996");
////			 Optional<Buyer> list2=Optional.of(buyer1);
////			 Mockito.when(buyerRepo.findById(buyer1.getBuyerId())).thenReturn(list2);
//////			 Exception exception=Assertions.assertThrows(Exception.class,()->orderService.getSpecificOrder(o1.getOrderId()));
//////				Assertions.assertEquals("OrderService.Orders_NOT_FOUND", exception.getMessage());
////		  Exception exception=Assertions.assertThrows(Exception.class,()->service.getSpecificBuyer(buyer1.getBuyerId()));
////		  Assertions.assertEquals("service.Buyer_NOT_FOUND", exception.getMessage());
////			 }
//
////     @Test
////    public void addBuyerDetails()
////    {
//////    	 Order o=new Order();
////// 		o.setAddress("abc");
////// 		o.setAmount(100.00);
////// 		o.setBuyerId(1);
////// 		o.setDate(null);
////// 		o.setOrderId(3);
////// 		o.setStatus("ss");
////// 		Optional<Order> oo=Optional.of(o);
////// 		Mockito.when(orderRepo.findById(1)).thenReturn(oo);
////// 		System.out.println(oo);
//////// 		String actual = customerLoginService.authenticateCustomer(customer);
//////// 		Assertions.assertEquals("SUCCESS", actual);
////// 		String s=orderService.addOrderDetails(o);
////// 		Assertions.assertEquals("Success",s);
//////    	 
////    	 
////    	 
////    	 
////    	 Buyer buyer= new Buyer();
////    	 buyer.setBuyerId(1);
////		 buyer.setEmail("saurbha@gmail.com");
////		 buyer.setIsactive(1);
////		 buyer.setIsPrivileged(1);
////		 buyer.setName("Saurbha Kumar");
////		 buyer.setPhonenumber("9999888878");
////		 buyer.setPassword("Kumar@w*3996");
////		 Optional<Buyer> list2=Optional.of(buyer);
////		 Mockito.when(buyerRepo.findById(1)).thenReturn(list2);
////		 String s= service.addBuyer(buyer);
////		 Assertions.assertEquals("Success",s);
////		 
////    	 
////    }
////     @Test
////    public void DeleteBuyerDetails()
////    {
////    	 Buyer buyer= new Buyer();
////    	 buyer.setBuyerId(1);
////		 buyer.setEmail("saurbha@gmail.com");
////		 buyer.setIsactive(1);
////		 buyer.setIsPrivileged(1);
////		 buyer.setName("Saurbha Kumar");
////		 buyer.setPhonenumber("9999888878");
////		 buyer.setPassword("Kumar@w*3996");
////		 Optional<Buyer> list2=Optional.of(buyer);
////		 Mockito.when(buyerRepo.findById(1)).thenReturn(list2);
////		 String s= service.deleteSpecificBuyer(buyer.getBuyerId());
////		 Assertions.assertEquals("Success",s);
////	 }
////     
//		
//	
//
//}
