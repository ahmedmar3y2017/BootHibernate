//package com.example.demo;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.Entities.User;
//import com.example.demo.ServiceImpl.userServiceImpl;
//
//
////basic Url
////http://localhost:8080
//@RestController
//@RequestMapping("/rest")
//public class UserRest {
//
//	@Autowired
//	userServiceImpl userService;
//	
//	
//	@RequestMapping(value = "/getAll", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
//			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public ResponseEntity<?>  GetAll() {
//		System.out.println("Done");
//		List<User> users = userService.getAll();
//		System.out.println(users);
//		if (users.size()==0) {
//			return new ResponseEntity<String>("users Not Found !!",
//					HttpStatus.NOT_FOUND);
//
//		} else {
//			return new ResponseEntity<List<User>>(users, HttpStatus.OK);
//
//		}
//
//
//	}
//	
//	
//	
//	
//}
