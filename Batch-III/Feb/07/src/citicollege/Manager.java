package citicollege;

public class Manager extends Employee {
    public Integer getReportingEmployees() {
        return reportingEmployees;
    }

    public void setReportingEmployees(Integer reportingEmployees) {
        this.reportingEmployees = reportingEmployees;
    }

    private Integer reportingEmployees;

}
