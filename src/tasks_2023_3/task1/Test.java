package tasks_2023_3.task1;

/*
Проверка по 4 примеру NO
(идея может быть отсортировать и сравнить по первому символу?)
 */
public class Test {
    public static void main(String[] args) {
        final int n = 4;
        int[] h = {5, 2, 3, 1}; //заменяем чтоние на готовый массив
        if (((h[0] >= h[1])&&(h[1] >= h[2])&&(h[2] >= h[3]))||((h[0] <= h[1])&&(h[1] <= h[2])&&(h[2] <= h[3]))){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
