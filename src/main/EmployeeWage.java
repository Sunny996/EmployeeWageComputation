package main;

public class EmployeeWage {
    public int final IS_PRESENT=1;
    public int final IS_ABSENT=0;
    public int final WAGE_PER_HOUR=20;
    public int final FULL_DAY_HOUR=8;
    public int final PART_TIME_HOUR = 4;
    public int final IS_PART_TIME = 2

        public int empDailyWage(){
            int dailyWage=0;
            int empPresentSwitch=(int)(Math.random()*10)%3;
            switch(empPresentSwitch){
                case IS_PRESENT:
                    dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    dailyWage=WAGE_PER_HOUR*PART_TIME_HOUR;
                    break;

            }
            System.out.println("Daily Wage is "+dailyWage);
            return dailyWage;
    }
}
