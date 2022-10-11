package codewars;

class KataSheep {

    public static String countingSheep(int num) {
        String count = "";
        for (int i = 1; i <= num; i++) {
            count = count + i + " sheep...";
        }
        return count;
    }
}
