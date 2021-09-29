package ru.mirea.task12;

public class SortingStudentsByGPA{
    public static void quickSort(Student array[], int low, int high) {
        int tempid;
        String tempname;
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int opora = array[middle].mark;

        int i = low, j = high;
        while (i <= j) {
            while (array[i].mark < opora) {
                i++;
            }

            while (array[j].mark > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i].mark;
                tempname = array[i].name;
                tempid = array[i].idNumber;
                array[i].mark = array[j].mark;
                array[i].idNumber = array[j].idNumber;
                array[i].name = array[j].name;
                array[j].mark = temp;
                array[j].idNumber = tempid;
                array[j].name = tempname;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

}
