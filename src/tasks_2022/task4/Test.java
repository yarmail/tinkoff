package tasks_2022.task4;

// тестируем решение
public class Test {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int count = 0;
        if (((2*n - m - 1) % 3 == 0) & ((2*m - n - 1) % 3 == 0)) {
            int x = (2 * n - m - 1) / 3 ;
            int y = (2 * m - n - 1) / 3 ;
            count =  getFactorial(x+y)/(getFactorial(x)*getFactorial(y));
        }
        System.out.println(count);
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
