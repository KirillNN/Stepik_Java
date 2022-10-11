public class TotalPoints {
    public static void main(String[] args) {
        System.out.println(points(new String[]{"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}));
    }

    public static int points(String[] games) {
        int res = 0;
        for (String s : games) {
            String[] x = s.split(":");
            int sc1 = Integer.parseInt(x[0]);
            int sc2 = Integer.parseInt(x[1]);
            if (sc1 > sc2) {
                res += 3;
            } else if (sc1 == sc2) {
                res += 1;
            }
        }
        return res;
    }
}