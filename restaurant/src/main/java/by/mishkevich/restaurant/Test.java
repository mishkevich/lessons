package by.mishkevich.restaurant;

import by.mishkevich.restaurant.configuration.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ApplicationConfig.class);

        }
}
