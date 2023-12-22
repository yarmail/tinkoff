package tasks_2023_3.task2;

import java.util.Scanner;

/*
Проверяем по 2 примеру, ответ должен быть 5
 */
public class Test {
    public static void main(String[] args) {
        int n,m, k, result;
        n = 7; // число джунов
        m = 3; // число синьеров
        k = 2; // число проверок

        if (n*k % m == 0){
            result = (n * k)/m;
        }else {
            result = (n * k)/m + 1;
        }
        System.out.println(result);
    }
}
