package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class JpaCrudApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaCrudApplication.class, args);
        UserRepository repository=context.getBean(UserRepository.class);	
		
		  Center center=new Center();
		   center.setId(11);
		    center.setName("Rahman");
		  center.setAddress("Khalilabad");
		
		
		  Center center1=new Center();
		   center1.setId(12);
		    center1.setName("Aman");
		  center1.setAddress("Mumbai");
		 
        
		
		  Center center2=new Center();
		  center2.setId(13);
		  center2.setName("Arkam");
		  center2.setAddress("Sakinak");
		  
		  Center center3=new Center();
		  center3.setId(14);
		  center3.setName("Atif");
		  center3.setAddress("Govandi");
		  
			
			  List<Center>list=List.of(center,center1,center2,center3);
			  repository.saveAll(list); 
			  System.out.println("inserted data...........");
			 
         // all data Faching 
			/*
			 * Iterable<Center> itr = repository.findAll(); 
			 * for(Center c:list) {
			 * System.out.println(c); }
			 * 
			
			 */ 
			
         //other type all data faching
			/*
			 * Iterable<Center> findAll = repository.findAll();
			 *  System.out.println(findAll);
			 */
		  
		  //single data faching
			/*
			 * Optional<Center> findById = repository.findById(11);
			 * System.out.println(findById);
			 */
         //Deleting the single data
			/*
			 * repository.deleteById(13); 
			 * System.out.println("deleted.........");
			 */
			 
		  //deleting the all data from database
			/*
			 * repository.deleteAll(); 
			 * System.out.println("deleted all data ");
			 */
		  
		  //updating the data
			/*
			 * Optional<Center> find = repository.findById(14);
			 *  Center cen = find.get();
			 * cen.setName("Akhlaque");
			 *  Center save = repository.save(cen);
			 * System.out.println(save);
			 */
	}
}
