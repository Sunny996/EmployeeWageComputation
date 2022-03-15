package main;

public class EmployeeWage {
     public int final IS_PRESENT=1;
    public int final IS_ABSENT=0;
    public int final WAGE_PER_HOUR=20;
    public int final FULL_DAY_HOUR=8;
    public int final PART_TIME_HOUR = 4;
    public int final IS_PART_TIME = 2;
    public int final DAYS_PER_MONTH = 20;

    public int empDailyWage() {
        int totalWage = 0;
        int totalWorkingDays = 0;
        while (totalWorkingDays < DAYS_PER_MONTH) {
            switch ((int) (Math.random() * 10) % 3) {
                case IS_PRESENT:
                    totalWage += WAGE_PER_HOUR * FULL_DAY_HOUR;
                    totalWorkingDays++;
                    break;
                case IS_PART_TIME:
                    totalWage += WAGE_PER_HOUR * PART_TIME_HOUR;
                    totalWorkingDays++;
                    break;

            }
        }
        System.out.println("Employee Wage Per Month is " + totalWage);
        return totalWage;

    }
}
