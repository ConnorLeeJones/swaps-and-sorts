package HackerRank;

public class StringFormat {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        int n = 6;
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++){
                builder.append("#");
            }
            System.out.println(builder);
            builder = new StringBuilder();
        }
    }
}
