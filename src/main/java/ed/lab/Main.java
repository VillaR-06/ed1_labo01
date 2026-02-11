package ed.lab;

import java.util.Random;

public class Main {



    private static final ArrayGenerator<Integer> sortedArrayGenerator = length -> {
        Integer[] array = new Integer[length];
        for (int i = 0; i < length; i++) {
            array[i] = i;
        }
        return array;
    };

    private static final ArrayGenerator<Integer> invertedArrayGenerator = length -> {
        Integer[] array = new Integer[length];
        for (int i = 0; i < length; i++) {
            array[i] = length - i;
        }
        return array;
    };

    private static final ArrayGenerator<Integer> randomArrayGenerator = length -> {
        Integer[] array = new Integer[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(length);
        }
        return array;
    };



    private static final QuickSort<Integer> highPivotQuickSort =
            SortingAlgorithms::highPivotQuickSort;

    private static final QuickSort<Integer> lowPivotQuickSort =
            SortingAlgorithms::lowPivotQuickSort;

    private static final QuickSort<Integer> randomPivotQuickSort =
            SortingAlgorithms::randomPivotQuickSort;



    public static ArrayGenerator<Integer> getSortedArrayGenerator() {
        return sortedArrayGenerator;
    }

    public static ArrayGenerator<Integer> getInvertedArrayGenerator() {
        return invertedArrayGenerator;
    }

    public static ArrayGenerator<Integer> getRandomArrayGenerator() {
        return randomArrayGenerator;
    }

    public static QuickSort<Integer> getHighPivotQuickSort() {
        return highPivotQuickSort;
    }

    public static QuickSort<Integer> getLowPivotQuickSort() {
        return lowPivotQuickSort;
    }

    public static QuickSort<Integer> getRandomPivotQuickSort() {
        return randomPivotQuickSort;
    }



    public static void main(String[] args) {

        SortingTester<Integer> tester = new SortingTester<>();

        System.out.println("Ordenando arreglo ordenado:");
        tester.testSorting(sortedArrayGenerator, highPivotQuickSort);
        tester.testSorting(sortedArrayGenerator, lowPivotQuickSort);
        tester.testSorting(sortedArrayGenerator, randomPivotQuickSort);

        System.out.println("================================");

        System.out.println("Ordenando arreglo invertido:");
        tester.testSorting(invertedArrayGenerator, highPivotQuickSort);
        tester.testSorting(invertedArrayGenerator, lowPivotQuickSort);
        tester.testSorting(invertedArrayGenerator, randomPivotQuickSort);

        System.out.println("================================");

        System.out.println("Ordenando arreglo aleatorio:");
        tester.testSorting(randomArrayGenerator, highPivotQuickSort);
        tester.testSorting(randomArrayGenerator, lowPivotQuickSort);
        tester.testSorting(randomArrayGenerator, randomPivotQuickSort);
    }
}
