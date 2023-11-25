public class BmiService {
    public static int calculate(int weight, double height) {
        return (int) (weight / (height * height));

    }
}
