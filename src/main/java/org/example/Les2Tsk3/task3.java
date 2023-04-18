package org.example.Les2Tsk3;
public class task3 {
    public static void main(String[] args) {
        int[]array = {-3,44,-5,5,56,3,-2,33};
        int[] arrayRes = replacementNegativeValues(array,doubleDigitSum (array));
        printArray(arrayRes);

    }

    /**
     *
     * @param arr - массив
     * @return - сумма двузначных элементов массива
     */
    public static int doubleDigitSum (int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
          if(arr[i]>9&&arr[i]<100)  {
              sum+=arr[i];
          }
        }
        return sum;
    }

    /**
     *
     * @param ar - массив
     * @param num - число
     * @return - массив где все отрицательные числа заменены на num
     */
    public static int[] replacementNegativeValues(int[]ar,int num){
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]<0){
                ar[i]=num;
            }
        }
        return ar;
    }

    /**
     *
     * @param printArr- массив для печати
     */
    public static void printArray(int[]printArr) {
        for (int i = 0; i < printArr.length; i++) {
            System.out.print(printArr[i]+" | ");

        }
    }
}
