/**
Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена 
с разными телефонами, их необходимо считать, как одного человека с разными телефонами. 
Вывод должен быть отсортирован по убыванию числа телефонов.
 */
public class task_1 {

    public static void main(String[] args) {
        task0();
    }

    static void task0() {
        PhoneNums phoneNums = new PhoneNums();
        phoneNums.add("Иван", "1245863");
        phoneNums.add("Дмитрий", "5978554");
        phoneNums.add("Иван", "9756321");
        phoneNums.add("Александр", "8545632");
        phoneNums.add("Виталий", "1965874");
        phoneNums.add("Иван", "9635428");
        phoneNums.add("Александр", "5965741");

        System.out.println(phoneNums.getAll());
    }
}