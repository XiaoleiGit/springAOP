package org.example.springAOP;


import org.example.springAOP.model.Circle;
import org.example.springAOP.service.ShapeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class myApplication {

    public static void main(String[] args) {
        ApplicationContext ct = SpringApplication.run(myApplication.class, args);
        Circle circle = ct.getBean(Circle.class);
        circle.setName("circle name");
        ShapeService service = ct.getBean(ShapeService.class);
        System.out.println(service.getCircle().getName());
    }
}
