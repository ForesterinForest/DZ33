public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 49;
        double height = 1.58;
        int result = BmiService.calculate(weight, height);
        System.out.println(result);
    }
}
