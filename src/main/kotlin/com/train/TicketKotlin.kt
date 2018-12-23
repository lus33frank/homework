package com.train

class TicketKotlin(var one_wayNumber: Int, var round_tripNumber: Int) {

    var discount = 0.9f     // 來回票價折扣數
    var round_trip = 2000   // 來回票價
    var one_way = 1000      // 單程票價
    var payment = 0         // 付款金額
    // 總張數
    private var totalTickets = 0


    // 買票
    fun buyTicket(): Boolean {
        if (getTotalTickets() > 0) {
            payment = one_way * one_wayNumber
            payment += Math.ceil((round_trip * round_tripNumber * discount).toDouble()).toInt()

        } else {
            return false
        }

        return true
    }

    // 車票總數量
    fun getTotalTickets(): Int {
        totalTickets = one_wayNumber + round_tripNumber
        return totalTickets
    }

}
