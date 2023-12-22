package tasks_2023_2.task2;

/*
сюда для проверки вручную подставляем сроку
Работаем по 2 примеру
*/
public class Test {
    public static void main(String[] args) {
        String m = "5"; //количество измерений
        int n = Integer.parseInt(m);
        int[] intArray = new int[n];
        int count = 0;

        int startDegree = -1;

        int maxDegree = 0;
        boolean plusINF = true;
        boolean[] boolArray = new boolean[n];
        String [] string = {"0 -", "8 -", "4 0+","-3 0+","5 0+"}; //создаем проверочный массив 2 примера
        for (int i = 0; i < n; i++){
            String[] str1 = string[i].split("\\s"); //добавляем тут, s= пробелы
            intArray[i] = Integer.parseInt(str1[0]);
            if (str1[1].equals("-")){
                boolArray[i] = false;
            }else {
                boolArray[i] = true;
            }
        }

        for (int i = 0; i<n; i++){
            if (!boolArray[i]){
                plusINF = false;
                count = i;
                break;
            }
        }

        if (!plusINF) {
            while (true) {
                maxDegree = startDegree;
                boolean flag = false;
                for (int i = count + 1; i < n; i++) {
                    maxDegree += intArray[i];
                    boolean checker;
                    if (maxDegree >= 0){
                        checker = true;
                    }else {
                        checker = false;
                    }
                    if (!(checker == boolArray[i])) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }

                if (flag) {
                    break;
                } else {
                    startDegree--;
                }
            }
            System.out.println(maxDegree);
        }else{
            System.out.println("inf");
        }
    }
}
