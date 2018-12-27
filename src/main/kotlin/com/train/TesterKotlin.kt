package com.train

import java.util.*


var broken: String = "\n"
var isExit: Boolean = false


fun main(args: Array<String>) {

    val os = System.getProperty("os.name").toLowerCase()
    if (os.indexOf("win") >= 0) {
        broken = "\r\n"
    }

    // HomeWork 1
    //homework01()

    // HomeWork 2
    homework02()
}

private fun homework02() {
    val scanner = Scanner(System.`in`)
    val ticket = Ticket()

    do {
        println(" ")
        // 單程
        print("Please enter the number of one-way tickets or enter -1 to end : ")
        val oneWay = scanner.nextInt()
        if (oneWay == -1) {
            isExit = true
            break
        }

        // 來回
        print("How many round-trip tickets or enter -1 to end : ")
        val roundTrip = scanner.nextInt()
        if (roundTrip == -1) {
            isExit = true
            break
        }

        // 設定張數
        ticket.oneWayNumber = oneWay
        ticket.roundTripNumber = roundTrip

        // 處理購票
        println("$broken====================$broken")
        if (ticket.buyTicket()) {
            println("Total tickets : " + ticket.totalTickets)
            println("Round-trip : " + ticket.roundTripNumber)
            println("Total : " + ticket.payment)
            println(broken + "Purchase success!")
        } else {
            println("The number of tickets is wrong!")
        }

    } while (!isExit)

    println("Thanks, bye!")
}

private fun homework01() {
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
        println("Round-trip : " + ticket.roundTripNumber)
        println("Total : " + ticket.payment)
        println("${broken}Purchase success!")
    } else {
        println("The number of tickets is wrong!")
    }
}
