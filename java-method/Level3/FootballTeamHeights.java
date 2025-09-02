public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        int sum = 0;
        int shortest = 250, tallest = 150;

        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); // 150–250
            System.out.print(heights[i] + " ");
            sum += heights[i];
            if (heights[i] < shortest) shortest = heights[i];
            if (heights[i] > tallest) tallest = heights[i];
        }
        double mean = sum / 11.0;
        System.out.println("\nShortest = " + shortest);
        System.out.println("Tallest = " + tallest);
        System.out.println("Mean height = " + mean);
    }
}
