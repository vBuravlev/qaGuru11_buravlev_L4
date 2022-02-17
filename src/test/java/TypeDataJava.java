public class TypeDataJava {

    // Примитивные типы данных
    byte aByte; // 8 bit -128 ... 127
    short aShort = 100; // 16 bit -32768 ... 32767
    int aInt = 1_100_000; // 32 bit -2 ^ 31 ... (2 ^ 31) -1   самый используемый
    long aLong = 100L; // 64 bit -2 ^ 63 ... (2 ^ 63) -1

    float aFloat = 0.0F; // 32 bit
    double aDouble = 0.0; // 64 bit   самый используемый тип не целых значений (для хранения, но не арифметики)

    char aChar = 'n';
    boolean aBoolean = false;

    // Ссылочный тип данных
    String aString = "hello, Testers!";

    public static void main(String[] args) {
        // + -- сложение
        // - -- вычитание
        // * -- умножение
        // / -- целочисленное деление
        // % -- остаток от деления
        // инкремент ++
        // декремент --

        // >
        // <
        // >=
        // <=
        // ==
        // !=

        // =
        // +=
        // -=

        // && (&)
        // || (|)
        // !

        byte a = 1;
        int i = 100, j = 91;
        long l = 50_100_100_100L;

        // a = a + 128; выход за пределы типа byte
        //  j  = j - 999999999999999999999999999; выход за пределы типа int
        System.out.println(((j + i) > (i - j)) + " boolean type");
        System.out.println(j * i + " multiplication int");
        System.out.println(j / i + "division int");
        System.out.println(j % i + " the remainder of the division");
        System.out.println(l + j + " long + int");
        System.out.println((i += j) + " assignment operator with arithmetic addition operator");

        System.out.println((i++));
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        System.out.println(a > i);
        System.out.println(j != i);

        float f = 0.22F;
        double d = 19.44444D;

        System.out.println(((f - d) > 0) && ((d - f) > 0));
        System.out.println(((f - d) > 0) || ((d - f) > 0));
        System.out.println(d / f);
        System.out.println(d % f);

        char y = 'e', z = 'g';
        boolean booleanType = false;

        System.out.println(y + z + " char + char"); //
        System.out.println(!booleanType);
    }


}
