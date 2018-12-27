package com.train;


import java.util.Scanner;


public class Tester {

    private static String broken = "\n";
    private static boolean isExit = false;


    public static void main(String[] args) {

        String os = System.getProperty("os.name").toLowerCase();
        if (os.indexOf("win") >= 0) {
            broken = "\r\n";
        }

        // HomeWork 1
        //homeWork1();

        // HomeWork 2
        homeWork2();
    }

    private static void homeWork2() {
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = new Ticket();

        do {
            System.out.println(" ");
            // 單程
            System.out.print("Please enter the number of one-way tickets or enter -1 to end : ");
            int oneWay = scanner.nextInt();
            if (oneWay == -1) {
                isExit = true;
                break;
            }

            // 來回
            System.out.print("How many round-trip tickets or enter -1 to end : ");
            int roundTrip = scanner.nextInt();
            if (roundTrip == -1) {
                isExit = true;
                break;
            }

            // 設定張數
            ticket.setOneWayNumber(oneWay);
            ticket.setRoundTripNumber(roundTrip);

            // 處理購票
            System.out.println(broken + "====================" + broken);
            if (ticket.buyTicket()) {
                System.out.println("Total tickets : " + ticket.getTotalTickets());
                System.out.println("Round-trip : " + ticket.getRoundTripNumber());
                System.out.println("Total : " + ticket.getPayment());
                System.out.println(broken + "Purchase success!");
            } else {
                System.out.println("The number of tickets is wrong!");
            }

        } while (!isExit);

        System.out.println("Thanks, bye!");
    }

    private static void homeWork1() {
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
            System.out.println("Round-trip : " + ticket.getRoundTripNumber());
            System.out.println("Total : " + ticket.getPayment());
            System.out.println(broken + "Purchase success!");
        } else {
            System.out.println("The number of tickets is wrong!");
        }
    }

}
