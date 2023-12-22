package tasks_2022.task5;

/*
Заполняем данные вручную из первого примера
Замечание
В Первом тесте из условия Линк за один прыжок
поднимается к отметке на расстоянии 1 метр от вершины
При этом он соскальзывает вниз на один метр.
Следующим прыжком он запрыгнет на гору.
 */
public class Test {
    public static void main(String[] args) {
        int n = 3; // высота горы
        int a[] = new int[n]; //массив прыжков
        int b[] = new int[n]; //массив соскальзываний
        boolean check[] = new boolean[n];
        for (int i = 0; i < n; i++){
            a[0] = 0;
            a[1] = 2;
            a[2] = 2;
        }
        for (int i = 0; i < n; i++){
            b[0] = 1;
            b[1] = 1;
            b[2] = 0;
        }
        boolean flag = false;
        int l = 0;
        int count = 0;
        int max = 0;
        metka:
        while (!flag){
            if (!check[l]) {
                check[l] = true;
                for (int i = 1; i <= a[n-l-1]; i++){
                    int l1 = l + i;
                    if (l1 >= n) {
                        flag = true;
                        break metka;
                    } else {
                        l1 = l1 - b[n - l1 - 1];
                    }
                    max = Math.max(max, l1);

                }
                count++;
                l = max;
                max = 0;
            } else{
                break;
            }
        }
        if (flag){
            System.out.println(count+1);
        }else {
            System.out.println(-1);
        }
    }
}