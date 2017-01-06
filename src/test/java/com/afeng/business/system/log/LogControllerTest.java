package com.afeng.business.system.log;

import org.junit.Test;  
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.afeng.business.system.log.controller.LogController;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath*:applicationContext*.xml" })  
public class LogControllerTest {
	
	@Autowired
	LogController logController;
	
    @Test  
    public void list() {  
    	String re = logController.list();  
    	System.out.println(re);
    }  
    
    @Test
    public void removeAll(){
    	try {
			logController.removeAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
} 
