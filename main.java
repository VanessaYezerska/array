public class main {
    public static void main(String[] args) {   // Task 1
        int[] numbers = new int[50];
        for (int i = 1, a = 0; a < 50; i += 2, a++) {
            numbers[a] = i;
            System.out.println(numbers[a]);
        }
    }
}
    class Task {

        public static void main(String[] args) {
            int array1[] = new int[20];
            for (int i = 0; i < 20; i++) {
                array1[i] = (int) (Math.random() * 10);
                System.out.print(array1[i] + " ");
            }
            System.out.println(" ");
            int array2[] = new int[20];
            for (int i = 0; i < array2.length; i++) {
                if (0 == i % 2)
                    array2[i] = array1[i];
                else
                    array2[i] = 0;
                System.out.print(array2[i] + " ");

            }
        }
    }
     class Task2 {
    public static void main(String[] args) {
        int array1[] = new int[20];
        for (int i = 0; i < 20; i++) {
            array1[i] = (int) (Math.random() * 10);
            System.out.print(array1[i] + " ");
        }
        System.out.println(" ");
        int array2[] = new int[20];
        for (int i = 0; i < array2.length; i++) {
            if (0 == i % 2)
                array2[i] = array1[i];
            else
                array2[i] = 0;
            System.out.print(array2[i] + " ");

        }

    }
}
   class Task3 {
    public static void main(String[] args) {
        int array1[] = new int[10];
        int array2[] = new int[10];
        int array3[] = new int[10];
        double mid1 = 0, mid2 = 0;
        for (int i = 0; i < 10; i++) {
            array1[i] = (int) (Math.random() * 10);
            mid1 = mid1 + array1[i];
            System.out.print(array1[i] + " ");
        }
        for (int i = 0; i < 10; i++) {
            array2[i] = (int) (Math.random() * 10);
            mid2 = mid2 + array2[i];
            System.out.print(array2[i] + " ");
        }
        for (int i = 0; i < 10; i++) {
            array3[i] = array1[i] + array2[i];
            System.out.println(array3[i] + " ");
        }
        System.out.println();
    }
}
 class Task4 {
    public static void main(String[] args) {
        int counter = 0;

        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 15);
            System.out.print(array[i] + " ");
        }

            for (int i = 0; i < 10; i++) {
                if (array[i] % 2 == 0)
                    counter++;
            }
            System.out.println("\n" + counter);
        }
    }
  class Task5{
    public static void main(String[] args) {
        int array[][] = new int[15][];
        array[0] = new int[5];
        array[1] = new int[5];
        array[2] = new int[5];
        array[3] = new int[5];
        array[4] = new int[8];
        array[5] = new int[8];
        array[6] = new int[8];
        array[7] = new int[8];
        array[8] = new int[3];
        array[9] = new int[3];
        array[10] = new int[3];
        array[11] = new int[3];
        array[12] = new int[9];
        array[13] = new int[9];
        array[14] = new int[9];
        for (int i=0; i< array.length; i++){
            for (int j=0; j<array[i].length; j++){
                array[i][j] = (int) (Math.random()*15);
                System.out.print(array[i][j] + " ");
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }
}