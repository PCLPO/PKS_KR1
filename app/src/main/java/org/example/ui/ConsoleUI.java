package org.example.ui;

import java.util.Scanner;

public class ConsoleUI {
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            printMenu();
            int choice = readInt("Выберите действие: ");

            switch (choice) {
                case 1 -> createVPS();
                case 0 -> {
                    System.out.println("Выход из программы...");
                    return;
                }
                default -> System.out.println("Неверный пункт меню. Попробуйте снова.");
            }
        }
    }

    private void printMenu() {
        System.out.println("""
            ========================================
                СИСТЕМА УПРАВЛЕНИЯ ЗАЯВКАМИ
                     ДАТА-ЦЕНТРА
            ========================================
            1. Создать заявку VPS
            0. Выход
            """);
    }

    private void createVPS() {
        System.out.println("[Создание заявки VPS] — в разработке");
    }

    private int readInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число.");
            }
        }
    }
}