package tasks_2023_2.task3;



/*
Пробуем сэмулировать 1 пример
Пока не получается
 */
public class Test {
    public static void main(String[] args) {
        int n, m, k;
        n = 3; // количество телескопов
        m = 2; // количество звезд
        k = 3; // количество режимов
        int[] p = {1, 2, 3}; // режимы, в которых остались телескопы с предыдущего наблюдения
        int[] a = {1, 2}; // номера телескопов
        int[] b = {1, 3};// номера телескопов
        boolean[] checkDone = new boolean[m];
        int countOfCheckDone = 0;
        int count = 0;

        for (int i = 0; i < n; i++){ // режимы телескопов
           // p[i] = scanner.nextInt(); ранее сканировалось
        }

        for (int i = 0; i < m; i++){ // номера телескопов
            //a[i] = scanner.nextInt();
            //b[i] = scanner.nextInt();
            if(p[a[i]-1] == p[b[i]-1]){
                checkDone[i] = true;
                countOfCheckDone++;
            }
        }

        while (countOfCheckDone < m) {

            int[] countMaxP = new int[k];
            int maxP = 0;
            int numberOfMaxP = 0;
            for (int i = 0; i < m; i++) {
                if (!checkDone[i]) {
                    countMaxP[p[a[i]-1]-1]++;
                    countMaxP[p[b[i]-1]-1]++;
                }
            }

            for (int i = 0; i < k; i++) {
                if (numberOfMaxP <= countMaxP[i]) {
                    maxP = i+1;
                    numberOfMaxP = countMaxP[i];
                }
            }

            for (int i = 0; i < m; i++) {
                if (!checkDone[i]) {
                    if (a[i] == maxP) {
                        b[i] = maxP;
                        count++;
                        break;
                    }
                    if (b[i] == maxP) {
                        a[i] = maxP;
                        count++;
                        break;
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                if (p[a[i]-1] == p[b[i]-1]) {
                    checkDone[i] = true;
                    countOfCheckDone++;
                }
            }
        }
        System.out.println(count);
    }
}