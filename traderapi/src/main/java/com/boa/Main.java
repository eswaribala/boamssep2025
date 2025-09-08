package com.boa;

import com.boa.models.Role;
import com.boa.models.User;
import com.github.javafaker.Faker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //step 1
      ApplicationContext context = new ClassPathXmlApplicationContext("trader-config.xml");
       //step2
      //Instance of user or instance role
      //IOC
      User user = (User) context.getBean("Trade-User");

      Faker faker = new Faker();
      //DI
       user.setFirstName(faker.name().firstName());
       user.setLastName(faker.name().lastName());
       user.setUserId(faker.number().numberBetween(1,10));
       user.setEmail(faker.internet().emailAddress());
       user.setRoles(getRoles(context));
      System.out.println(user);

    }

    public static List<Role> getRoles(ApplicationContext context) {

        List<Role> roles = new ArrayList<>();
        Faker faker = new Faker();
        Role role = null;
        for(int i=0;i<5;i++){
          role= (Role) context.getBean("role");
          role.setRoleId(faker.number().numberBetween(1,10));
          role.setRoleName(faker.name().name());
          roles.add(role);
        }
     return roles;


    }

}