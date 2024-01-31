public class PartA {
    public static void partA(int[] dieA, int[] dieB) {
        // 1. Total combinations
        int totalCombinations = dieA.length * dieB.length;
        System.out.println("Total combinations: " + totalCombinations);


        int[][] distribution = new int[7][7];
        for (int i : dieA) {
            for (int j : dieB) {
                distribution[i][j]++;
            }
        }
        for (int i = 1; i < distribution.length; i++) {
            for (int j = 1; j < distribution[i].length; j++) {
                System.out.print(distribution[i][j] + " ");
            }
            System.out.println();
        }


        for (int sum = 2; sum <= 12; sum++) {
            int count = 0;
            for (int i = 1; i <= 6; i++) {
                for (int j = 1; j <= 6; j++) {
                    if (i + j == sum) {
                        count++;
                    }
                }
            }
            System.out.println("P(Sum = " + sum + ") = " + count + "/36");
        }
    }
}
