/**   
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.example.demo2.controller 
 * @author: huang   
 * @date: 2019年2月26日 下午8:05:23 
 */
package com.example.demo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * @ClassName: HelloController 
 * @Description: TODO
 * @author: huang
 * @date: 2019年2月26日 下午8:05:23  
 */
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello() 
	{
		return "Hello world!";
	}
}
