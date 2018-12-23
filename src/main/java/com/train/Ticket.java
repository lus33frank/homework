package com.train;


public class Ticket {

    private String setOff = "台北";       // 出發站
    private String arrivals = "高雄";     // 到達站
    private float discount = 0.9f;       // 來回票價折扣數
    private int round_trip = 2000;       // 來回票價
    private int one_way = 1000;          // 單程票價
    private int one_wayNumber = 0;       // 單程張數
    private int round_tripNumber = 0;    // 來回張數
    private int totalTickets = 0;        // 總張數
    private int payment = 0;             // 付款金額


    public Ticket() {
        //
    }

    public Ticket(int one_wayNumber, int round_tripNumber) {
        this.one_wayNumber = one_wayNumber;
        this.round_tripNumber = round_tripNumber;
    }

    // 買票
    public boolean buyTicket() {
        if (getTotalTickets() > 0) {
            payment = (one_way * one_wayNumber);
            payment += (int) Math.ceil((round_trip * round_tripNumber) * discount);

        } else {
            return false;
        }

        return true;
    }

    // 車票總數量
    public int getTotalTickets() {
        totalTickets = one_wayNumber + round_tripNumber;
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

    public int getOne_wayNumber() {
        return one_wayNumber;
    }

    public void setOne_wayNumber(int one_wayNumber) {
        this.one_wayNumber = one_wayNumber;
    }

    public int getRound_tripNumber() {
        return round_tripNumber;
    }

    public void setRound_tripNumber(int round_tripNumber) {
        this.round_tripNumber = round_tripNumber;
    }

    public int getOne_way() {
        return one_way;
    }

    public void setOne_way(int one_way) {
        this.one_way = one_way;
    }

    public int getRound_trip() {
        return round_trip;
    }

    public void setRound_trip(int round_trip) {
        this.round_trip = round_trip;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

}
