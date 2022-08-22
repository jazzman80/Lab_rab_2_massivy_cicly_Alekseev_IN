public class Main {
    public static void main(String[] args) {
        System.out.println("ТАБЛИЦА УМНОЖЕНИЯ");
        System.out.println();

        for (int i = 2; i < 10; i++){
            for (int j = 1; j < 11; j++){
                System.out.printf("%s x %s = %s%n", i,j,i*j);
            }
            System.out.println();
        }
    }
}