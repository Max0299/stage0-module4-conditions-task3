package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {

    if(month <=12 && month >=1) {
        if (month <= 5 && month > 2) {
            System.out.println("Spring");
        } else if (month <= 8 && month > 5)
            System.out.println("Summer");
        else if (month <= 11 && month > 8) {
            System.out.println("Autumn");
        } else {
            System.out.println("Winter");
        }
    }else {
        System.out.println("wrong number!");
    }
    }
}
