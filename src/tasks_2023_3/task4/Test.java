package tasks_2023_3.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Пробуем проверить пример 2 должно быть 7
 */
public class Test {
    public static void main(String[] args) {
        int n = 10;
        int[] a = {1, 2, 4, 2, 3, 1, 3, 9, 15, 23}; // задаем массив всего 10
        int maxTt =0;
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        int result = 2;
        for (int i=0; i < n; i++){
            int t = map1.getOrDefault(a[i], 0) + 1;
            map1.put(a[i], t);
            int tt = map2.getOrDefault(t, 0) + 1;
            if (t > 1 && map2.getOrDefault(t - 1, 0) == 1){
                map2.remove(t-1);
            } else if(t > 1){
                map2.put(t - 1, map2.getOrDefault(t - 1, 0) - 1);
            }
            map2.put(t, tt);
            if (t > maxTt){
                maxTt = t;
            }
        }

        for (int i = n-1; i > 0; i--){
            if((map2.size() == 1) || (map2.size() == 2 && map2.getOrDefault(1, 0) == 1) || (map2.size() == 2 && map2.getOrDefault(maxTt, 0) == 1 && map2.getOrDefault(maxTt -1, 0) != 0)){
                result =  i+1;
                break;
            }

            int t = map1.get(a[i]) - 1;
            if (maxTt == t+1 && map2.get(t + 1) == 1){
                maxTt -=1;
            }
            if(t == 0){
                map1.remove(a[i]);
            }else {
                map1.put(a[i], t);
            }
            int tt = map2.get(t+1) - 1;
            if (tt == 0){
                map2.remove(t + 1);
            }else {
                map2.put(t + 1, tt);
            }
            if (t != 0) {
                map2.put(t, map2.getOrDefault(t, 0) + 1);
            }
        }
        System.out.println(result);
    }
}