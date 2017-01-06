/*package com.afeng.business.system.user;

import org.junit.Test;  
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.afeng.business.system.user.entity.User;
import com.afeng.business.system.user.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath*:applicationContext.xml",
		"classpath*:applicationContext-hibernate.xml"})  
public class UserServiceTest {
	
	@Autowired
	IUserService userService;
	
    @Test  
    public void save() {  
    	User user = new User(); 
		user.setLoginName("hfg");
		user.setName("小鸽子");
		user.setPassword("123");
		user.setRemark("我会飞哦");
		userService.save(user); 
    }  
} 
*/