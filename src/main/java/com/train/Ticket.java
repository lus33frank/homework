package com.train;


public class Ticket {

    private String setOff = "台北";       // 出發站
    private String arrivals = "高雄";     // 到達站
    private float discount = 0.9f;       // 來回票價折扣數
    private int roundTrip = 2000;       // 來回票價
    private int oneWay = 1000;          // 單程票價
    private int oneWayNumber = 0;       // 單程張數
    private int roundTripNumber = 0;    // 來回張數
    private int totalTickets = 0;        // 總張數
    private int payment = 0;             // 付款金額


    public Ticket() {
        //
    }

    public Ticket(int oneWayNumber, int roundTripNumber) {
        this.oneWayNumber = oneWayNumber;
        this.roundTripNumber = roundTripNumber;
    }

    // 買票
    public boolean buyTicket() {
        if (getTotalTickets() > 0) {
            payment = (oneWay * oneWayNumber);
            payment += (int) Math.ceil((roundTrip * roundTripNumber) * discount);

        } else {
            return false;
        }

        return true;
    }

    // 車票總數量
    public int getTotalTickets() {
        totalTickets = oneWayNumber + roundTripNumber;
        return totalTickets;
    }

    // 票價總金額
    public int getPayment() {
        return payment;
    }

    public String getSetOff() {
        return setOff;
    }

    public void setSetOff(String setOff) {
        this.setOff = setOff;
    }

    public String getArrivals() {
        return arrivals;
    }

    public void setArrivals(String arrivals) {
        this.arrivals = arrivals;
    }

    public int getOneWayNumber() {
        return oneWayNumber;
    }

    public void setOneWayNumber(int oneWayNumber) {
        this.oneWayNumber = oneWayNumber;
    }

    public int getRoundTripNumber() {
        return roundTripNumber;
    }

    public void setRoundTripNumber(int roundTripNumber) {
        this.roundTripNumber = roundTripNumber;
    }

    public int getOneWay() {
        return oneWay;
    }

    public void setOneWay(int oneWay) {
        this.oneWay = oneWay;
    }

    public int getRoundTrip() {
        return roundTrip;
    }

    public void setRoundTrip(int roundTrip) {
        this.roundTrip = roundTrip;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

}
