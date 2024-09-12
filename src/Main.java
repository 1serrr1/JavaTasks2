import java.time.format.DateTimeParseException;

class CustomExceptions {
    // 1. Функция для нахождения максимума
    public static int findMax(int a, int b) {
        if (a == b) {
            throw new IllegalArgumentException("Числа равны");
        }
        return Math.max(a, b);
    }

    // 2. Калькулятор деления
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return (double) a / b;
    }

    // 3. Конвертер строк в числа
    public static int parseInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Строка не может быть конвертирована в число");
        }
    }

    // 4. Проверка возраста
    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
    }

    // 5. Нахождение корня
    public static double sqrt(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательное число");
        }
        return Math.sqrt(number);
    }

    // 6. Факториал
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Некорректное число");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 7. Проверка массива на нули
    public static void checkArrayForZeros(int[] array) {
        for (int num : array) {
            if (num == 0) {
                throw new IllegalArgumentException("В массиве есть нули");
            }
        }
    }

    // 8. Калькулятор возведения в степень
    public static double power(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Отрицательная степень");
        }
        return Math.pow(base, exponent);
    }

    // 9. Обрезка строки
    public static String truncateString(String str, int length) {
        if (length > str.length()) {
            throw new IllegalArgumentException("Длина обрезки больше длины строки");
        }
        return str.substring(0, length);
    }

    // 10. Поиск элемента в массиве
    public static int findElementInArray(int[] array, int element) {
        for (int num : array) {
            if (num == element) {
                return num;
            }
        }
        throw new IllegalArgumentException("Элемент не найден");
    }

    // 11. Конвертация в двоичную систему
    public static String toBinary(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательное число");
        }
        return Integer.toBinaryString(number);
    }

    // 12. Проверка делимости
    public static boolean isDivisible(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a % b == 0;
    }

    // 13. Чтение элемента списка
    public static <T> T getElementFromList(java.util.List<T> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
        }
        return list.get(index);
    }

    // 14. Парольная проверка
    public static void checkPasswordStrength(String password) {
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Пароль слишком слабый");
        }
    }

    // 15. Проверка даты
    public static void checkDateFormat(String date) {
        try {
            java.time.LocalDate.parse(date, java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Некорректный формат даты", date, 0);
        }
    }

    // 16. Конкатенация строк
    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк равна null");
        }
        return str1 + str2;
    }

    // 17. Остаток от деления
    public static int remainder(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a % b;
    }

    // 18. Квадратный корень
    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательное число");
        }
        return Math.sqrt(number);
    }

    // 19. Конвертер температуры
    public static double celsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Температура ниже абсолютного нуля");
        }
        return celsius * 9/5 + 32;
    }

    // 20. Проверка строки на пустоту
    public static void checkIfStringIsEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка пустая или равна null");
        }
    }

    public static void main(String[] args) {
        // Примеры использования функций
        // System.out.println(findMax(5, 10));
        // System.out.println(divide(10, 2));
        // System.out.println(parseInt("123"));
        // checkAge(151);
        // System.out.println(sqrt(16));
        // System.out.println(factorial(5));
        // checkArrayForZeros(new int[]{1, 0, 3});
        // System.out.println(power(2, 3));
        // System.out.println(truncateString("Hello, World!", 5));
        // System.out.println(findElementInArray(new int[]{1, 2, 3, 4}, 3));
        // System.out.println(toBinary(10));
        // System.out.println(isDivisible(10, 2));
        // System.out.println(getElementFromList(java.util.Arrays.asList("a", "b", "c"), 1));
        // checkPasswordStrength("5565");
        // checkDateFormat("31.12.20201");
        // System.out.println(concatenateStrings("Hello, ", "World!"));
        // System.out.println(remainder(10, 3));
        // System.out.println(calculateSquareRoot(16));
        // System.out.println(celsiusToFahrenheit(25));
        // checkIfStringIsEmpty("");
    }
}