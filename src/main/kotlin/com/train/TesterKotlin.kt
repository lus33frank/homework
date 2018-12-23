package com.train

import java.util.*


var broken: String = "\n"


fun main(args: Array<String>) {

    val os = System.getProperty("os.name").toLowerCase()
    if (os.indexOf("win") >= 0) {
        broken = "\r\n"
    }

    val scanner = Scanner(System.`in`)

    // 單程
    print("Please enter number of one-way tickets : ")
    val oneWay = scanner.nextInt()
    // 來回
    print("How many round-trip tickets : ")
    val roundTrip = scanner.nextInt()

    val ticket = TicketKotlin(oneWay, roundTrip)
    println("$broken====================$broken")
    if (ticket.buyTicket()) {
        println("Total tickets : " + ticket.getTotalTickets())
        println("Round-trip : " + ticket.round_tripNumber)
        println("Total : " + ticket.payment)
        println("${broken}Purchase success!")
    } else {
        println("The number of tickets is wrong!")
    }

}
