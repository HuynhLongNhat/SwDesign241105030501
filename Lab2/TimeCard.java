package Lab2;

public class TimeCard {
    private int hoursWorked;
    private String payPeriod;

    // Constructor
    public TimeCard(int hoursWorked, String payPeriod) {
        this.hoursWorked = hoursWorked;
        this.payPeriod = payPeriod;
    }

    // Getters and Setters
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(String payPeriod) {
        this.payPeriod = payPeriod;
    } // Phương thức để cập nhật số giờ làm việc

    public void updateTimeCard(int additionalHours) {
        this.hoursWorked += additionalHours;
    }

    // Other timecard functionalities
    public void save() {
        System.out.println("The cham cong đuoc luu voi" + hoursWorked + " gio cho ma phi" + payPeriod);
    }

    @Override
    public String toString() {
        return "Timecard{" +
                "hoursWorked=" + hoursWorked +
                ", payPeriod='" + payPeriod + '\'' +
                '}';
    }
}
