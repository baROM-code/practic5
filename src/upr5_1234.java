public class upr5_1234
{
    public static void main(String[] args)
    {
        CoWorker[] persWorker = new CoWorker[5];
        persWorker[0] = new CoWorker("Иванов Иван", "Инженер", "ivivan@mail.com", "892312312", 30000, 30);
        persWorker[1] = new CoWorker("Саша Петров", "Менеджер", "petrovivan@mail.com", "892315612", 18000, 23);
        persWorker[2] = new CoWorker("Ксения Кудря", "Агент по кадрам", "ksyuku@mail.com", "892812313", 30000, 25);
        persWorker[3] = new CoWorker("Джон До", "Босс", "jodo@mail.com", "892311111", 333000, 43);
        persWorker[4] = new CoWorker("Илон Маск", "Разаработчик java", "ilonmask@mail.com", "892012345", 700000, 44);

        System.out.println("Сотрудники старше 40 лет");
        for (int i = 0; i < persWorker.length; i++)
        {
            if (persWorker[i].age > 40) persWorker[i].info();
        }

    }

}
