public class vy {
    public static void main(String[] args) {
        int j = 2;
        for (int i = 0; i <= 10; i++) {
            if (j > 0) {
                System.out.println("ok");
            }
            j = 5 - (j * 2);
        }
        System.out.println(j);
    }
}
