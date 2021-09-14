// yousaffuentes-cop3330-ex23

/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the key? ");

        char carSilentStatus = s.next().charAt(0);

        final char YES = 'y', NO = 'n';


        if (carSilentStatus == YES) {

            System.out.println("Are the battery terminals corroded? ");
            char terminalCorrosionStatus = s.next().charAt(0);

            if (terminalCorrosionStatus == YES)
                System.out.println("Clean terminals and try starting again.");
            else if (terminalCorrosionStatus == NO)
                System.out.println("Replace cables and try again.");

        } else if (carSilentStatus == NO) {

            System.out.println("Does the car make a slicking noise? ");

            char slickingNoiseStatus = s.next().charAt(0);

            if (slickingNoiseStatus == YES)
                System.out.println("Replace the battery.");
            else if (slickingNoiseStatus == NO) {

                System.out.println("Does the car crank up but fail to start? ");

                char failToStartAtCrankStatus = s.next().charAt(0);

                if (failToStartAtCrankStatus == YES)
                    System.out.println("Check spark plug connections.");
                else if (failToStartAtCrankStatus == NO) {

                    System.out.println("Does the engine start and then die? ");

                    char startAndDieStatus = s.next().charAt(0);

                    if (startAndDieStatus == YES) {

                        System.out.println("Does you car have fuel injection? ");

                        char fuelInjectionStatus = s.next().charAt(0);

                        if (fuelInjectionStatus == YES)
                            System.out.println("Get it in for service.");
                        else if (fuelInjectionStatus == NO)
                            System.out.println("Check to ensure the choke is opening and closing.");

                    } else if (startAndDieStatus == NO)
                        System.out.println("This should not be possible.");

                };

            };

        };

    };
}