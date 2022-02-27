public class Main {
    public static void main(String[] args) {
        String city1 = "Asia";
        String city2 = "Europe";

        city2 = city1;

        System.out.println(city1.length());
        String city4 = String.format("%s-%s", city1, city2);
        System.out.println(city4);
    }
}
