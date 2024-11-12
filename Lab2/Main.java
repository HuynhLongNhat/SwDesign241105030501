package Lab2;

public class Main {
    public static void main(String[] args) {
        // Initialize objects
        Employee employee = new Employee("Long Nhat", "E123", "BIDV", "054203040303", "Quy Nhon", "0364477399",
                "thanhlich2103gg@gmail.com", "ATM");
        TimecardController controller = new TimecardController();
        TimeCardForm form = new TimeCardForm(controller, employee);

        // Simulate the "Maintain Timecard" use case
        form.open(); // Employee opens the form
        form.enterHoursForChargeNumber(8, "Code1"); // Employee enters hours for a charge number
        form.saveTimecard(); // Employee saves the timecard
    }
}