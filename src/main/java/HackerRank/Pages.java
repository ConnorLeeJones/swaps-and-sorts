package HackerRank;

public class Pages {

    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
//        int page1 = (p / 2);
//        int page2 = ((n - p) / 2);
//
//
//
//        return page1 < page2 ? page1 : page2;
        return Math.min(p/2, n/2 - p/2);
    }

    public static void main(String[] args) {
        System.out.println(pageCount(6, 5));
    }
}
