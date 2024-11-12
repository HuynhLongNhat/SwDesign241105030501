package Lab2;

import java.util.Arrays;

class TimecardController {
    private ProjectManagementDatabase database = new ProjectManagementDatabase();
    private TimeCard currentTimecard;

    public TimecardController() {
        // Initialize with a sample timecard for demonstration purposes
        this.currentTimecard = new TimeCard(0, "2024-11");
    }

    public TimeCard getCurrentTimecard(String employeeId) {
        System.out.println("Lay bang cham cong hien tai cua nhan vien: " + employeeId);
        // Attempt to fetch timecard for the given employeeId and period (e.g., current
        // month)
        currentTimecard = database.getTimecardForEmployee(employeeId, "2024-11");
        if (currentTimecard == null) {
            System.out.println("Khong tim thay the cham cong cho nhan vien :" + employeeId);
        }
        return currentTimecard;
    }

    public String[] getChargeCodes() {
        String[] chargeCodes = database.getChargeCodes();
        System.out.println("Ma phi hien co: " + Arrays.toString(chargeCodes));
        return chargeCodes;
    }

    public void updateTimecard(int hours, String chargeCode) {
        // Validate charge code
        String[] validChargeCodes = getChargeCodes();
        if (!Arrays.asList(validChargeCodes).contains(chargeCode)) {
            System.out.println("Ma phi khong hop le: " + chargeCode);
            return;
        }

        // Check if there is a current timecard to update
        if (currentTimecard != null) {
            currentTimecard.updateTimeCard(hours);
            System.out.println("The cham cong duoc cap nhat voi  " + hours + " gio cho ma phi" + chargeCode);
            // Save the updated timecard
            database.saveTimecard(currentTimecard);
        } else {
            System.out.println("Hien tai khong co the cham cong đe cap nhat");
        }
    }

    // Thêm phương thức saveTimecard để lưu timecard hiện tại
    public void saveTimecard() {
        if (currentTimecard != null) {
            database.saveTimecard(currentTimecard);
            System.out.println("The cham cong duoc cap nhat thanh cong");
        } else {
            System.out.println("Hien tai khong co the cham cong đe luu");
        }
    }
}
