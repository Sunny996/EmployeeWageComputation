package main;

public class EmployeeWage {
    public int IS_PRESENT=1;
    public int IS_ABSENT=0;
    public int WAGE_PER_HOUR=20;
    public int FULL_DAY_HOUR=8;
    public int PART_TIME_HOUR = 4;
    public int IS_PART_TIME = 2;

        public int empDailyWage(){
            int dailyWage=0;
            int empPresent=(int)(Math.random()*10)%3;
            if(empPresent==IS_PRESENT)
                dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
            else if(empPresent==IS_PART_TIME)
                dailyWage=WAGE_PER_HOUR*PART_TIME_HOUR;
            System.out.println("Daily Wage is "+dailyWage);
            return dailyWage;
    }
}
