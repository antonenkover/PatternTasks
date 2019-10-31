package com.patterns;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class UserService {
    private static final Logger LOG = Logger.getLogger(UserService.class);
    AbstractCinema cinema;

    public static void main(String[] args) {
        chooseFilm();
    }

    public static void chooseFilm() {
        String title = null;
        while (true) {
            System.out.println("Enter the name of the film you want to watch. Enter 0 if you want to leave the cinema.");
            try {
                Scanner scanner = new Scanner(System.in);
                title = scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Try again");
                LOG.error("Invalid film name");
            }
            switch (title) {
                case "0":
                    return;
                default:
                    chooseLanguage(title);
            }
        }
    }

    public static void chooseLanguage(String title) {
        AbstractCinema cinema;
        while (true) {
            System.out.println("Choose the language:\n 1.English\n 2.Українська\n 3.Deutsch\n 4.Français\n 5.Go back\n");
            try {
                Scanner scanner = new Scanner(System.in);
                switch (scanner.nextInt()) {
                    case 1:
                        cinema = new EnglishCinema();
                        System.out.print("Now watching " + title);
                        cinema.getFilm();
                        cinema.getSubtitles();
                        break;
                    case 2:
                        cinema = new UkrainianCinema();
                        System.out.print("Now watching " + title);
                        cinema.getFilm();
                        cinema.getSubtitles();
                        break;
                    case 3:
                        cinema = new GermanCinema();
                        System.out.print("Now watching " + title);
                        cinema.getFilm();
                        cinema.getSubtitles();
                        break;
                    case 4:
                        cinema = new FrenchCinema();
                        System.out.print("Now watching " + title);
                        cinema.getFilm();
                        cinema.getSubtitles();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Invalid input. Please try again.\n");
                        LOG.error("Invalid input. Please try again.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please try again.\n");
                LOG.error("Invalid input. Please try again.");
            }
        }
    }
}
