package Lab2;

class ProjectManagementDatabase {
    // This is a placeholder for actual database connection and retrieval methods.

    public String[] getChargeCodes() {
        // In a real application, this would fetch charge codes from the database.
        return new String[] { "DEV", "QA", "PM", "TESTER" };
    }

    public TimeCard getTimecardForEmployee(String employeeId, String period) {
        // In a real application, this would fetch a timecard from the database based on
        // employeeId and period.
        // Here, returning a sample timecard for simplicity.
        return new TimeCard(0, period);
    }

    public void saveTimecard(TimeCard timecard) {
        // In a real application, this would save the timecard to the database.
        System.out.println("Da luu the cham cong: " + timecard);
    }
}