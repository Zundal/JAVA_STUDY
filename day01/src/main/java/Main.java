public class Main {
    public static void main(String[] args) {
        String city1 = "Asia";
        String city2 = "Europe";

        city2 = city1;

        System.out.println(city1.length());
        String city4 = String.format("%s-%s", city1, city2);
        System.out.println(city4);

        int[] nums2 = {1,2,3};
        System.out.println(nums2);

        int[] lotto = new int[6];
        lotto[0]=-1;
        int a = lotto[0];
        lotto=new int[]{2,3,4,5};

        String[] myNum = new String[]{"2016-08-17", "2016-09-17", "2016-03-17"};
        String[] myNum2 = {"2016-08-17", "2016-09-17", "2016-03-17"};
        System.out.println(myNum);
        System.out.println(myNum2);
    }
}
