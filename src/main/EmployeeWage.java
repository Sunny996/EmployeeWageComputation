package main;

public class EmployeeWage {
    public int IS_PRESENT = 1;
    public int IS_ABSENT = 0;
    public int WAGE_PER_HOUR = 20;
    public int FULL_DAY_HOUR = 8;
    public int PART_TIME_HOUR = 4;
    public int IS_PART_TIME = 2;
    public int DAYS_PER_MONTH = 20;

    public int empDailyWage() {
        int totalWage = 0;
        int totalWorkingDays = 0;
        while (totalWorkingDays < DAYS_PER_MONTH) {
            switch ((int) (Math.random() * 10) % 3) {
                case 1:
                    totalWage += WAGE_PER_HOUR * FULL_DAY_HOUR;
                    totalWorkingDays++;
                    break;
                case 2:
                    totalWage += WAGE_PER_HOUR * PART_TIME_HOUR;
                    totalWorkingDays++;
                    break;

            }
        }
        System.out.println("Employee Wage Per Month is " + totalWage);
        return totalWage;

    }
}
