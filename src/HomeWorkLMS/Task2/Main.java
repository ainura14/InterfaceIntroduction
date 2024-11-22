package HomeWorkLMS.Task2;

public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark();
        Duck duck = new Duck();
        Turtle turtle = new Turtle();
        Swimable[] oceanarium = {shark, duck, turtle};

        for (Swimable swimable : oceanarium) {
            swimable.swimable();
        }

    }
}
