package Lab2;

public class TimeCardForm {
    private TimecardController controller;
    private Employee employee;

    public TimeCardForm(TimecardController controller, Employee employee) {
        this.controller = controller;
        this.employee = employee;
    }

    public void open() {
        System.out.println("Mo form nhap the cham cong:");
        TimeCard timecard = controller.getCurrentTimecard(employee.getEmployeeId());
        displayTimeCard(timecard);
    }

    public void displayTimeCard(TimeCard timecard) {
        System.out.println("Hien thi the cham cong hien tai " + timecard.getHoursWorked() + " so gio trong ky luong "
                + timecard.getPayPeriod());
    }

    public void enterHoursForChargeNumber(int hours, String chargeCode) {
        System.out.println("Nhap gio lay ma cuoc: " + chargeCode);
        controller.updateTimecard(hours, chargeCode);
    }

    public void saveTimecard() {
        controller.saveTimecard();
        System.out.println("Luu thong tin thanh cong");

        System.out.println(employee.toString());
    }
}
