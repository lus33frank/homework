package com.train

class TicketKotlin(var oneWayNumber: Int = 0, var roundTripNumber: Int = 0) {

    var discount = 0.9f     // 來回票價折扣數
    var roundTrip = 2000   // 來回票價
    var oneWay = 1000      // 單程票價
    var payment = 0         // 付款金額
    // 總張數
    private var totalTickets = 0


    // 買票
    fun buyTicket(): Boolean {
        if (getTotalTickets() > 0) {
            payment = oneWay * oneWayNumber
            payment += Math.ceil((roundTrip * roundTripNumber * discount).toDouble()).toInt()

        } else {
            return false
        }

        return true
    }

    // 車票總數量
    fun getTotalTickets(): Int {
        totalTickets = oneWayNumber + roundTripNumber
        return totalTickets
    }

}
