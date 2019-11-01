package _04interfaces;

import java.util.*;

public class P9_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Appointment> appointments = new ArrayList<Appointment>();
        boolean loop = true;
        while (loop) {
            System.out.println("Input appointment description:");
            String description = scan.nextLine();
            System.out.println("Input appointment date (MM/DD/YYYY):");
            String dateInput = scan.nextLine();
            String[] date = dateInput.split("[\\s /]+");
            System.out.println("Monthly? (Y/N)");
            String monthlyResponse = scan.nextLine();
            if (monthlyResponse.toLowerCase().charAt(0) == 'y') {
                appointments.add(new Monthly(description, Integer.parseInt(date[2]),
                        Integer.parseInt(date[1]), Integer.parseInt(date[0])));
            }
            System.out.println("Daily? (Y/N)");
            String dailyResponse = scan.nextLine();
            if (dailyResponse.toLowerCase().charAt(0) == 'y') {
                appointments.add(new Daily(description, Integer.parseInt(date[2]),
                        Integer.parseInt(date[1]), Integer.parseInt(date[0])));
            }
            System.out.println("One-time Appointment? (Y/N)");
            String onetimeResponse = scan.nextLine();
            if (onetimeResponse.toLowerCase().charAt(0) == 'y') {
                appointments.add(new Onetime(description, Integer.parseInt(date[2]),
                        Integer.parseInt(date[1]), Integer.parseInt(date[0])));
            }
            System.out.println("Print all current appointments? (Y/N)");
            String printResponse = scan.nextLine();
            if (printResponse.toLowerCase().charAt(0) == 'y') {
                printAppointments(appointments);
            }
            System.out.println("Continue? (Y/N)");
            String response = scan.nextLine();
            if (response.toLowerCase().charAt(0) != 'y') {
                loop = false;
            }

        }
    }

    public static void printAppointments(List<Appointment> appointments) {
        for (Appointment appointment :
                appointments) {
            System.out.println(appointment.getDescription() + " on " +
                    appointment.getMonth() + "/" + appointment.getDay() + "/"
                    + appointment.getYear());
        }
    }
}
