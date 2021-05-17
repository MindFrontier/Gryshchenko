package Gryshchenko.HW1;

public class Main {

    //Это я баловался с методами
    //public void outride(int OutrideInt){
    //    OutrideInt = (int) (normal + 1);}
    //Main OutrideInt = new Main();
    //OutrideInt.outride(2147483648);

    public static void main(String[] args) {
        int normal = 2147483647;
        int outride;
        outride = normal + 11;

        double fraction = 3.14159265358979323846;
        String symbol = "fool";
        boolean logical = true;

        byte byteNumber = 127;
        short shortNumber = 32767;
        long longNumber = 9223372036854775807L;
        float floatNumber = 3.14f;

        System.out.println("Целые числа для вычеслений без дробной части (Люди или что-то не требующее дробной части, например:  " + normal);
        System.out.println("Дробые числа для вычесления с дробной частью (Деньги, объёмы и т.д), например:  " + fraction);
        System.out.println("Символьные (Слова, даты и т.д.), например:  " + symbol);
        System.out.println("Логические (Правильность ввода логина, пароля и т.д.), например:  " + logical);
        System.out.println("byte =  " + byteNumber);
        System.out.println("short =  " + shortNumber);
        System.out.println("long =  " + longNumber);
        System.out.println("float =  " + floatNumber);
        System.out.println("Переполненый int:  " + outride);
        System.out.println("Скорее всего переполненое значение не может вместить такое число и начинает с самого начала добавляя то число которое было сверх возможного - 1");

        //Вопрос 1: В чем разница между флоат и дабл? почему при создании флоут нужно указывать букву f в конце числа.
        //Ответ: Флоат менее точный чем дабл. При создании любого дробного числа по умолчанию ставится дабл поэтому надо указать f в конце числа, на скольк я понялто же касается илонга
        //Ворос 2: Можно ли переполнить boolean?
        //Ответ: на сколько я понял нельзя потому что у нег мжет бытьотлько два значения, NULL не в счёт
    }


}
