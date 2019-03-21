package love.programming;



public class arrayClass {

    public static void main(String[] args) {
        int[] myIntArray1 = new int[10];

        for (int i = 0; i < myIntArray1.length; i++) {

            myIntArray1[i] = i;
            System.out.println(myIntArray1[i]);
        }

        String[] myStringArray = {"Uma", "Purush", "Krithi", "Pranay", "sahasra", "keerthana"};
        for (int i = 0; i < myStringArray.length; i++) {


            System.out.println(myStringArray[i]);
        }

        String[] arraySample = {"r", "o", "c", "k", "s", "t", "a", "R"};
        {


            System.out.println("Character at position 5: " + arraySample[5]);
            System.out.println("Character at position 4; " + arraySample[4]);
        }
        int[] myArray1 = new int[50];

        for (int i = 0; i > myArray1.length; i--) {

            myIntArray1[i] = i;
            System.out.println(myArray1[i]);
        }
        int[] a = {1, 2, 3, 4, 8};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) ;
            }
            System.out.println( a[i]);

        }
        //descending order
        int[] x = {23, 24, 25, 26, 27, 28};
        for (int i = 0; i < x.length; i++) {
            if ( x[i] < x[i]) ;

            System.out.println( x[i]);

        }
        int[] myIntArray2 = {1, 2, 3, 4,};
        {
            System.out.println(myIntArray2);

        }


    }}






