
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String



def static "com.test.demo.Common.createNewUser"(
    	int age	
     , 	String username	
     , 	String password	
     , 	String gender	
     , 	int expectedStatus	) {
    (new com.test.demo.Common()).createNewUser(
        	age
         , 	username
         , 	password
         , 	gender
         , 	expectedStatus)
}


def static "com.test.demo.Common.findUserById"(
    	int id	
     , 	int age	
     , 	String username	
     , 	String password	
     , 	String gender	
     , 	int expectedStatus	) {
    (new com.test.demo.Common()).findUserById(
        	id
         , 	age
         , 	username
         , 	password
         , 	gender
         , 	expectedStatus)
}


def static "com.test.demo.writeExcel.demoKey"(
    	String name	) {
    (new com.test.demo.writeExcel()).demoKey(
        	name)
}


def static "demo.writeExcel.demoKey"(
    	String name	) {
    (new demo.writeExcel()).demoKey(
        	name)
}
