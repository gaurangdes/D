/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package d;

/**
 *
 * @author ASUS
 */
public class D {
    public static void main(String[] args) {
        int[] dieA = {1, 2, 3, 4, 5, 6};
        int[] dieB = {1, 2, 3, 4, 5, 6};

        // Part A
        System.out.println("Part A:");
        partA(dieA, dieB);

        // Part B
        System.out.println("Part B:");
        partB(dieA, dieB);
    }

    public static void partA(int[] dieA, int[] dieB) {
        // 1. Total combinations
        int totalCombinations = dieA.length * dieB.length;
        System.out.println("Total combinations: " + totalCombinations);

        // 2. Distribution of all possible combinations
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

        // 3. Probability of all possible sums
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

    public static void partB(int[] dieA, int[] dieB) {
        int[] newDieA = undoomDice(dieA);
        int[] newDieB = undoomDice(dieB);

        // Display the new dice
        for (int i : newDieA) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : newDieB) {
            System.out.print(i + " ");
        }
    }

    public static int[] undoomDice(int[] die) {
        int[] newDie = new int[die.length];
        for (int i = 0; i < die.length; i++) {
            newDie[i] = Math.min(die[i], 4);
        }
        return newDie;
    }
}
