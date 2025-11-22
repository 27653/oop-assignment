package _27653.Q5;

public final class RentalRecord extends Invoice {

    public RentalRecord() {}

    public double calculateTotalCharge() {
        return getRentalCharge() + getPenaltyCharge();
    }
}