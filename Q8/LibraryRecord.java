package _27653.Q8;



public final class LibraryRecord extends Record {

    public LibraryRecord() {}

    // Formula: fineAmount * daysLate
    public double calculateFine() {
        return getFineAmount() * getDaysLate();
    }
}