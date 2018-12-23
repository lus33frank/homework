package com.train;


import java.util.Scanner;


public class Tester {

    private static String broken = "\n";


    public static void main(String[] args) {

        String os = System.getProperty("os.name").toLowerCase();
        if (os.indexOf("win") >= 0) {
            broken = "\r\n";
        }

        Scanner scanner = new Scanner(System.in);

        // 單程
        System.out.print("Please enter number of one-way tickets : ");
        int oneWay = scanner.nextInt();
        // 來回
        System.out.print("How many round-trip tickets : ");
        int roundTrip = scanner.nextInt();

        Ticket ticket = new Ticket(oneWay, roundTrip);
        System.out.println(broken + "====================" + broken);
        if (ticket.buyTicket()) {
            System.out.println("Total tickets : " + ticket.getTotalTickets());
            System.out.println("Round-trip : " + ticket.getRound_tripNumber());
            System.out.println("Total : " + ticket.getPayment());
            System.out.println(broken + "Purchase success!");
        } else {
            System.out.println("The number of tickets is wrong!");
        }
    }

}
