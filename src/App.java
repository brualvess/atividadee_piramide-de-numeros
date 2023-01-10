public class App {
    public static void main(String[] args) throws Exception {
        pyramidOfNumbers(1, 5);
    }

    public static void pyramidOfNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            String result = "";
            for (int y = 0; y < i ; y++) {
                result += Integer.toString(i);

            }
            System.out.println(result);
        }

    }
}
