package com.boa;

import com.boa.models.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //step 1
      ApplicationContext context = new ClassPathXmlApplicationContext("trader-config.xml");

      //Instance of user or instance role
      User user = (User) context.getBean("user");
      System.out.println(user);

    }
}