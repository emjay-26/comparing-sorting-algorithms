
//compiling note (Jake's machine)
// to compile: javac src/*.java
// to run: java -cp src Main


//NOTE - array sizes
//small - 20
//medium - 200
//large - 2k


public class Main {


    public static void main(String[] args) {


        ArrayGenerator arrays = new ArrayGenerator();

        int[] smallArray = arrays.getSmallArray();
        int[] mediumArray = arrays.getMediumArray();
        int[] largeArray = arrays.getLargeArray();


        int[] smallArrayNS = arrays.getSmallNearlySorted();
        int[] mediumArrayNS = arrays.getMediumNearlySorted();
        int[] largeArrayNS = arrays.getLargeNearlySorted();



//        Jonathan's test to upload
         System.out.println("Jonathan's test");
         long quickSortstartTime = System.nanoTime();

         int[] jonathanArray = arrays.getSmallArray();
         quickSortstartTime = System.nanoTime();
         QuickSort.runSort(jonathanArray,0, 19);
         long quickSortendTime = System.nanoTime();
         long quickSortDuration = quickSortendTime - quickSortstartTime ;
         System.out.println("Quicksort Small Array Execution time: " + quickSortDuration / 1_000_000.0 + " ms");

        jonathanArray = arrays.getMediumArray();
        quickSortstartTime = System.nanoTime();
        QuickSort.runSort(jonathanArray,0, 19);
        quickSortendTime = System.nanoTime();
        quickSortDuration = quickSortendTime - quickSortstartTime ;
        System.out.println("Quicksort Medium Array Execution time: " + quickSortDuration / 1_000_000.0 + " ms");

        jonathanArray = arrays.getLargeArray();
        quickSortstartTime = System.nanoTime();
        QuickSort.runSort(jonathanArray,0, 19);
        quickSortendTime = System.nanoTime();
        quickSortDuration = quickSortendTime - quickSortstartTime ;
        System.out.println("Quicksort Large Array Execution time: " + quickSortDuration / 1_000_000.0 + " ms");

        jonathanArray = arrays.getSmallNearlySorted();
        quickSortstartTime = System.nanoTime();
        QuickSort.runSort(jonathanArray,0, 19);
        quickSortendTime = System.nanoTime();
        quickSortDuration = quickSortendTime - quickSortstartTime ;
        System.out.println("Quicksort Small Near Sorted Array Execution time: " + quickSortDuration / 1_000_000.0 + " ms");

        jonathanArray = arrays.getMediumNearlySorted();
        quickSortstartTime = System.nanoTime();
        QuickSort.runSort(jonathanArray,0, 19);
        quickSortendTime = System.nanoTime();
        quickSortDuration = quickSortendTime - quickSortstartTime ;
        System.out.println("Quicksort Medium Near Sorted Array Execution time: " + quickSortDuration / 1_000_000.0 + " ms");

        jonathanArray = arrays.getLargeNearlySorted();
        quickSortstartTime = System.nanoTime();
        QuickSort.runSort(jonathanArray,0, 19);
        quickSortendTime = System.nanoTime();
        quickSortDuration = quickSortendTime - quickSortstartTime ;
        System.out.println("Quicksort Large Array Near Sorted Execution time: " + quickSortDuration / 1_000_000.0 + " ms");





        //Jake section on insertion sort
         System.out.println("\nJakes's insertion sort test");
         long insertionSortStartTime = System.nanoTime();

        //small
        int[] jakeSmallArray = arrays.getSmallArray();
         insertionSortStartTime = System.nanoTime();
         InsertionSort.sort(jakeSmallArray, 20);
         long insertionSortEndTime = System.nanoTime();
         long insertionSortDuration = quickSortendTime - quickSortstartTime ;
         System.out.println("Insertion Sort Small Array Execution time: " + quickSortDuration / 1_000_000.0 + " ms");

        //medium
        int[] jakeMediumArray = arrays.getMediumArray();
        insertionSortStartTime = System.nanoTime();
        InsertionSort.sort(jakeMediumArray, 100);
        insertionSortEndTime = System.nanoTime();
        insertionSortDuration = insertionSortEndTime - insertionSortStartTime;
        System.out.println("Insertion Sort Medium Array Execution time: " + insertionSortDuration / 1_000_000.0 + " ms");

        //large
        int[] jakeLargeArray = arrays.getLargeArray();
        insertionSortStartTime = System.nanoTime();
        InsertionSort.sort(jakeLargeArray, 1000);
        insertionSortEndTime = System.nanoTime();
        insertionSortDuration = insertionSortEndTime - insertionSortStartTime;
        System.out.println("Insertion Sort Large Array Execution time: " + insertionSortDuration / 1_000_000.0 + " ms");

        //small nearly sorted
        int[] jakeSmallArrayNS = arrays.getSmallNearlySorted();
        insertionSortStartTime = System.nanoTime();
        InsertionSort.sort(jakeSmallArrayNS, 20);
        insertionSortEndTime = System.nanoTime();
        insertionSortDuration = insertionSortEndTime - insertionSortStartTime;
        System.out.println("Insertion Sort Small Near Sorted Array Execution time: " + insertionSortDuration / 1_000_000.0 + " ms");

        //medium neraly sorted
        int[] jakeMediumArrayNS = arrays.getMediumNearlySorted();
        insertionSortStartTime = System.nanoTime();
        InsertionSort.sort(jakeMediumArrayNS, 100);
        insertionSortEndTime = System.nanoTime();
        insertionSortDuration = insertionSortEndTime - insertionSortStartTime;
        System.out.println("Insertion Sort Medium Near Sorted Array Execution time: " + insertionSortDuration / 1_000_000.0 + " ms");

        //large nearly sorted
        int[] jakeLargeArrayNS = arrays.getLargeNearlySorted();
        insertionSortStartTime = System.nanoTime();
        InsertionSort.sort(jakeLargeArrayNS, 1000);
        insertionSortEndTime = System.nanoTime();
        insertionSortDuration = insertionSortEndTime - insertionSortStartTime;
        System.out.println("Insertion Sort Large Near Sorted Array Execution time: " + insertionSortDuration / 1_000_000.0 + " ms");








        //MJ's test to upload
        System.out.println("\nMJ's shell sort test");
        long shellSortStartTime, shellSortEndTime, shellSortDuration;

        int[] mjSmallArray = arrays.getSmallArray();
        shellSortStartTime = System.nanoTime();
        ShellSort.sort(mjSmallArray, mjSmallArray.length);
        shellSortEndTime = System.nanoTime();
        shellSortDuration = shellSortEndTime - shellSortStartTime;
        System.out.println("Shell Sort Small Array Execution time: " + shellSortDuration / 1_000_000.0 + " ms");

        int[] mjMediumArray = arrays.getMediumArray();
        shellSortStartTime = System.nanoTime();
        ShellSort.sort(mjMediumArray, mjMediumArray.length);
        shellSortEndTime = System.nanoTime();
        shellSortDuration = shellSortEndTime - shellSortStartTime;
        System.out.println("Shell Sort Medium Array Execution time: " + shellSortDuration / 1_000_000.0 + " ms");

        int[] mjLargeArray = arrays.getLargeArray();
        shellSortStartTime = System.nanoTime();
        ShellSort.sort(mjLargeArray, mjLargeArray.length);
        shellSortEndTime = System.nanoTime();
        shellSortDuration = shellSortEndTime - shellSortStartTime;
        System.out.println("Shell Sort Large Array Execution time: " + shellSortDuration / 1_000_000.0 + " ms");

        int[] mjSmallArrayNS = arrays.getSmallNearlySorted();
        shellSortStartTime = System.nanoTime();
        ShellSort.sort(mjSmallArrayNS, mjSmallArrayNS.length);
        shellSortEndTime = System.nanoTime();
        shellSortDuration = shellSortEndTime - shellSortStartTime;
        System.out.println("Shell Sort Small Nearly Sorted Array Execution time: " + shellSortDuration / 1_000_000.0 + " ms");

        int[] mjMediumArrayNS = arrays.getMediumNearlySorted();
        shellSortStartTime = System.nanoTime();
        ShellSort.sort(mjMediumArrayNS, mjMediumArrayNS.length);
        shellSortEndTime = System.nanoTime();
        shellSortDuration = shellSortEndTime - shellSortStartTime;
        System.out.println("Shell Sort Medium Nearly Sorted Array Execution time: " + shellSortDuration / 1_000_000.0 + " ms");

        int[] mjLargeArrayNS = arrays.getLargeNearlySorted();
        shellSortStartTime = System.nanoTime();
        ShellSort.sort(mjLargeArrayNS, mjLargeArrayNS.length);
        shellSortEndTime = System.nanoTime();
        shellSortDuration = shellSortEndTime - shellSortStartTime;
        System.out.println("Shell Sort Large Nearly Sorted Array Execution time: " + shellSortDuration / 1_000_000.0 + " ms");

    }

    private static void printArray(int[] array, int size){
        for (int i = 0; i < size; i++){
            System.out.println(array[i]);
        }
    }


}
