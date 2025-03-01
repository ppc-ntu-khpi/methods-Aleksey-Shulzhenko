package domain;
/**
 * Клас Exercise містить метод для знаходження всіх "злих чисел" 
 * у заданому діапазоні чисел.
 */
public class Exercise {
    /**
     * Метод знаходить усі "злі числа" у заданому діапазоні.
     *
     * @param start початок діапазону (включно)
     * @param end кінець діапазону (включно)
     * @return рядок злі чисел, розділених комами
     */
    public static String Calculate(int start, int end) {
        StringBuilder result = new StringBuilder();
        
        for (int i = start; i <= end; i++) {
            if (isEvil(i)) {
                if (result.length() > 0) {
                    result.append(", ");
                }
                result.append(i);
            }
        }
        return result.toString();
    }
    /**
     * Перевіряє, чи є число "злим" (Evil number).
     * "Злі числа" — це числа, у двійковому представленні яких міститься парна кількість одиниць.
     *
     * @param number число для перевірки
     * @return true, якщо число "зле", інакше false
     */
    private static boolean isEvil(int number) {
        return Integer.bitCount(number) % 2 == 0;
    }
}
