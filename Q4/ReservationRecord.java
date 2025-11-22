package _27653.Q4;

public final class ReservationRecord extends Feedback {

    public ReservationRecord() {}

    public double generateBill() {
        return getRoomCharge() + getServiceCharge();
    }
}