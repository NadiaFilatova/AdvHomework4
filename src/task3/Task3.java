package task3;

import java.time.LocalDate;
import java.time.LocalDateTime;

//Спроектуйте та розробте метод, який визначає, скільки часу пройшло із заданої дати.
//За допомогою цього методи виведіть у консоль, скільки часу пройшло з вашого дня народження
// у зручному для сприйняття вигляді,
// наприклад: «Вам виповнилося 20 років, 3 місяці, 18 днів, 4 години, 5 хвилин та 10 секунд».
public class Task3 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        
        LocalDateTime local = localDateTime
                .minusYears(1999)
                .minusMonths(7)
                .minusDays(9)
                .minusHours(3)
                .minusMinutes(45)
                .minusSeconds(0);

        System.out.println("Мені виповнилося " + local.getYear() + " роки " + local.getDayOfMonth() + " місяців "
                + local.getDayOfMonth() + " днів " + local.getHour() + " годин "
                + local.getMinute() + " хвилин " + local.getSecond() + " секунд ");
    }
}
