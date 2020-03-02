public class Run extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Поток Б: " + i);
            if (i == 100) {
                System.out.println("Поток Б завершлился");
            }
        }
    }
}
