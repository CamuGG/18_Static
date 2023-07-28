package Static;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackodEmployeesNumber(){
        totalNumberOfEmployees++;
    }
    private String generateBadgeIdCode(){
        String randomString1 = "ABC";
        String randomString2 = "CBA";
        return randomString1 + employee.getName() + employee.getSurname() + randomString2;
    }

    public void showBadgeDetails(){
        System.out.println("numero totale dei lavoratori: " + totalNumberOfEmployees +
                "\ndetails of the employee: " + employee.getEmployeeDetails()
                + "\nbadge ID code: " + generateBadgeIdCode());
    }

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackodEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();

    }
}
