import java.util.Stack;

public class Vanguard {




    public static void main(String[] args) {



        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = true;
        if (b1 & b2 | b2 & b3 | b2){
            System.out.print("ok ");
        }
        if (b1 & b2 | b2 & b3 | b2 | b1){
            System.out.println("dokey ");
        }

        Stack s = new Stack();
        s.push(1);
        s.push(1.1);
        s.push("z");

        s.forEach(x -> System.out.println(x));





    }




}








//public class Solution{
//
//    private static final Scanner scanner = new Scanner(System.in);
//    String[] keyboardsItems = scanner.nextLine().split(" ");
//
//}




//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] scores = new int[n];
//
//        String[] scoresItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int scoresItem = Integer.parseInt(scoresItems[i]);
//            scores[i] = scoresItem;
//        }
//
//        int[] result = breakingRecords(scores);
//
//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
//    }
//}
