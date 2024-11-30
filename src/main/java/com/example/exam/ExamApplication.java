package com.example.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamApplication implements CommandLineRunner {

    @Autowired
    private PanelService panelService;

    public static void main(String[] args) {
        SpringApplication.run(ExamApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Додавання елементів
        panelService.addCircle(5, 5, 10);
        panelService.addRectangle(0, 0, 20, 15);

        // Виведення елементів перед масштабуванням
        System.out.println("Before scaling:");
        panelService.getElements().forEach(System.out::println);

        // Масштабування панелі
        panelService.scalePanel(2);

        // Виведення елементів після масштабування
        System.out.println("After scaling:");
        panelService.getElements().forEach(System.out::println);
    }
}
