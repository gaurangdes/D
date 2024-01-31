public class PartB {
    public static void partB(int[] dieA, int[] dieB) {
        int[] newDieA = UndoomDice.undoomDice(dieA);
        int[] newDieB = UndoomDice.undoomDice(dieB);

        // Display the new dice
        for (int i : newDieA) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : newDieB) {
            System.out.print(i + " ");
        }
    }
}
