package UKG.Day3;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) throws InvalidAgeUnCheckedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        validateAge(age);


        WeatherService service = new WeatherService();
        try {
            service.setTemperature(150); // This will throw an exception
        } catch (InvalidTemperatureException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }

    public static void validateAge(int age)  {
        if(age<18) {
            try {
                throw new InvalidAgeUnCheckedException("Age is below 18");
            } catch (InvalidAgeUnCheckedException e) {
                System.out.println(e.getMessage());
                System.out.println("You are not eligible to vote.");
            }
        }else {
            System.out.println("You are eligible to vote.");
        }
    }


}