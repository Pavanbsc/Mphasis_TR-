package com.mphasis.secondspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.secondspringapp.service.Product;
import com.mphasis.secondspringapp.service.OrderExercise2;
import com.mphasis.secondspringapp.service.UserServiceExercise3;
import com.mphasis.secondspringapp.service.UserRepository;

public class App {

    public static void main(String[] args) {

        // ✅ REQUIRED for Exercise 4
        System.setProperty("spring.profiles.active", "dev");

        AnnotationConfigApplicationContext container =
                new AnnotationConfigApplicationContext(SpringConfig.class);

       System.out.println("    ");
       System.out.println("    ");
        System.out.println("----- Exercise 1 -----");
        Product product = container.getBean(Product.class);
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Name      : " + product.getName());
        System.out.println("Price     : " + product.getPrice());

        System.out.println("    ");
        System.out.println("    ");
        System.out.println("\n----- Exercise 2 -----");
        OrderExercise2 order = container.getBean(OrderExercise2.class);
        order.placeOrder(6000);

        System.out.println("    ");
        System.out.println("    ");
        System.out.println("\n----- Exercise 3 -----");
        UserServiceExercise3 userService =
                container.getBean(UserServiceExercise3.class);
        userService.notifyUser();

        System.out.println("    ");
        System.out.println("    ");
        System.out.println("\n----- Exercise 4 -----");
        UserRepository repo = container.getBean(UserRepository.class);
        repo.printDbInfo();

        container.close();
    }
}