
public class Ilias {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int a = 15;
        final int b = 3;
        String home;
        home = "coupe du monde";
        System.out.println("Bonjour tout le monde");
        System.out.println(home);
        System.out.println((a + b));
        int i;
        int factn = 1, n = 15;
        for (i = 1; i <= n; i++) {
            factn = i * factn;
        }
        System.out.println("le factoriel de 15 est :" + factn);

    }
}