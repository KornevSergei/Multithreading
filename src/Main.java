public class Main {
    public static void main(String[] args) {
        MyThreadOne threadOne = new MyThreadOne();
        MyThreadTwo threadTwo = new MyThreadTwo();
        threadOne.start();
        threadTwo.start();
    }

    public static class MyThreadOne extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Поток А: " + i);
                if (i == 100) {
                    System.out.println("Поток А завершился");
                }
                check();
            }
        }
    }

    public static class MyThreadTwo extends Thread {
        @Override
        public void run() {

            for (int i = 1; i <= 100; i++) {
                System.out.println("Поток Б: " + i);
                if (i == 100) {
                    System.out.println("Поток Б завершился");
                }
            }
        }
    }

    public static void check() {
        if (threadOne.isAlive()) {
            try {
                threadOne.join();
            } catch (InterruptedException e) {
            }
            System.out.println("Победил поток А!");
        } else {
            System.out.println("Победил поток Б!");
        }
    }
}


