public class CoWorker
{
    // класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст
    String FIO;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    CoWorker(String FIO, String position, String email, String phone, int salary, int age)
    {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void info()
    {
        System.out.println("ФИО: " + FIO + "; Должность: " + position + "; email: " + email + "; Телефон: " + phone + "; ЗП: " + salary + "; Возраст: " + age);
    }
}


