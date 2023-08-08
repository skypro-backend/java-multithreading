package lesson1.deadlock.bad;

public class Friend {
    private final String name;

    public Friend(String name) {
        this.name = name;
    }

    public void throwBall(Friend friend) {
        Friend monitor = (this.name.compareTo(friend.name) > 1 ?
                this :
                friend);

        synchronized (monitor) {
            System.out.printf("%s бросил мяч %sу\n", name, friend.name);

            friend.throwBall(this);
        }
    }


    public static void main(String[] args) {
        Friend chel = new Friend("Чел");
        Friend bratan = new Friend("Братан");

        Thread thread1 = new Thread(() -> chel.throwBall(bratan));
        Thread thread2 = new Thread(() -> bratan.throwBall(chel));

        thread1.start();
        thread2.start();
    }
}
