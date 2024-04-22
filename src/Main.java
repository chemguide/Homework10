public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);
        //Задача 2
        System.out.println("\nЗадача 2");
        String fullNameUpCase = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullNameUpCase);
        //Задача 3
        System.out.println("\nЗадача 3");
        fullName = "Иванов Семён Семёнович";
        String fullNameReplacedYo = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника - " + fullNameReplacedYo);
    }
}