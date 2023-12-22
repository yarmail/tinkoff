package tasks_2022.task3;

// тестируем решение
public class Test {
    public static void main(String[] args) {
        int n = 2;    // количество элементов в массиве
        long[] mas = new long[n];
        int x = 1;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            mas[0] = 3; // вручную заполняем массив
            mas[1] = 4;
        }
        x = ((int) Math.sqrt(mas[0])) + 1;
        long x1 = x;
        while (!flag){
            for (int i = 0; i < n;i++){
                if (ToDo(x1,mas[i]) < 0 ){
                    ++x;
                    x1 = x;
                    flag = false;
                    break;
                }
                x1 = ToDo(x1,mas[i]);
                flag = true;
            }
        }
        System.out.println(x);
    }

    public static long ToDo(long k, long a){
        return k*k -a;
    }
}
