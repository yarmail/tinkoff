package tasks_2022.task1;

/*
Проверяем работу Main класса
 */
public class Test {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int x = 1;
        int n = (a + b)/2;
        if (a <= b) {
            System.out.println("NO");
        } else if (a%2 != b%2) {
            System.out.println("NO");
        } else if (a - x < n) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
