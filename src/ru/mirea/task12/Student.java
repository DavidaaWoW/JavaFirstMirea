package ru.mirea.task12;

public class Student {
    public String name;
    public int idNumber;
    public int mark;
    public Student( int idNumber, String name, int mark){
        this.name = name;
        this.idNumber = idNumber;
        this.mark = mark;
    }

    public void insertionSort(Student arr[], int length){
        int temp;
        int tempmark;
        int b;
        String tempname;
        if(length == 1){
            return;
        }
        for(int a = 1; a<length; a++){
            b = a;
            while(arr[b-1].idNumber > arr[b].idNumber){
                tempmark = arr[b].mark;
                tempname = arr[b].name;
                temp = arr[b].idNumber;
                arr[b].idNumber=arr[b-1].idNumber;
                arr[b].name = arr[b-1].name;
                arr[b].mark = arr[b-1].mark;
                arr[b-1].idNumber = temp;
                arr[b-1].name = tempname;
                arr[b-1].mark = tempmark;
                b--;
                if(b == 0)
                    break;
            }

        }
        return;
    }

    public void quickSort(Student array[], int low, int high) {
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

    public void studentsOut(Student arr[], int length){
        for(int a = 0; a<length; a++){
            System.out.println(arr[a].name+" "+arr[a].idNumber+" "+arr[a].mark);
        }

    }

    public void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void main(String[]args)
    {
        Student students[] = new Student[20];
        int rand;
        int randmark;
        for (int a = 0; a<20; a++){
            rand = (int)(Math.random()*100000000);
            randmark = ((int)(Math.random()*10))+1;
            while(rand<10000000)
                rand = (int)(Math.random()*100000000);
            students[a] = new Student(rand, ("John Doe"+(a+1)), randmark);
            System.out.println(students[a].name+" "+students[a].idNumber + " " + students[a].mark);
        }

        System.out.println("------------------------------------------");
        students[0].insertionSort(students, students.length);
        students[0].studentsOut(students, students.length);
        students[0].quickSort(students, 0, (students.length)-1);

        System.out.println("------------------------------------------");

        students[0].studentsOut(students, students.length);

        int mergeID[] = new int[20];

        for(int a = 0; a<20; a++){
            mergeID[a] = students[a].idNumber;
            System.out.println(mergeID[a]);
        }
        students[0].mergeSort(mergeID, mergeID.length);
        System.out.println("------------------------------------------");
        for(int a = 0; a<20; a++){
            System.out.println(mergeID[a]);
        }

    }
}
