package ex_09_Switch_Case;

import java.util.Scanner;

public class Lab077_Real_Switch_Example {
    public static void main(String[] args) {
         //Web Automation
        // I will ask user to give me the input from browser which he wants to
        // use to will start the automation in that browser

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser, which you want to start!");

        String browser = scanner.next();
        browser = browser.toLowerCase();//this stmt uses for case Sensitive

        switch (browser){
            case "chrome" :
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "firefox" :
                System.out.println("Starting Firefox");
                System.out.println("......");
                System.out.println("TC3");
                System.out.println("TC4");

                 //Webdriver driver = new firefox ;

                break;
            case "Edge" :
                System.out.println("Execute the Edge");
                break;
            case "Default":
                System.out.println("Default Browser");
                break;





        }



    }
}
