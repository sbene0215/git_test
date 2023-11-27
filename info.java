public class info {
    String name;
    int score;
    int remaining_lives;

    public info (String n, int s, int r) {
        name = n;
        score = s;
        remaining_lives = r;
    }

    public static void main(String[] args) {
        info info = new info("aaa", 564, 2);
        System.out.println(info.name);
    }
}
