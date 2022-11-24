import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner z1 = new Scanner(System.in);
        System.out.print("День рождения: ");
        int day = z1.nextInt();
        System.out.print("Месяц рождения: ");
        int month = z1.nextInt();
        System.out.print("Год рождения: ");
        int year = z1.nextInt();
        if (day>31 || day<0 || month>12 || month<0 || year>2022 || year<0)
        {
            System.out.println("Ошибка. Повторите попытку");
            return;
        }
        int dayNow = 17, monthNow = 11, yearNow = 2022;
        int differentYears = yearNow - year;
        if (monthNow < month)
            differentYears--;
        int differentMonths = monthNow - month;
        if (differentMonths < 0)
            differentMonths = differentMonths + 12;
        int differentDays = dayNow - day;
        if (differentDays < 0)
        {
            differentMonths--;
            if (differentMonths < 0)
            {
                differentYears--;
                differentMonths = differentMonths + 12;
            }
            differentDays = differentDays + 31;
        }
        System.out.printf(differentYears + " лет, " + differentMonths + " месяцев, " + differentDays + " дней");
        z1.close();
    }
}