public class Main {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();


        for (int i = 1; i <= 100; i++) {
            System.out.println("Поток А: " + i);
            if (i == 100){
                System.out.println("Поток А завершился");
            }
        }
        if(run.isAlive())
        {
            try{
                run.join();
            }catch(InterruptedException e){}

            System.out.println("Победил поток А!");
        }
        else	//если оппонент уже закончил высказываться
        {
            System.out.println("Победил поток Б!");
        }
    }
}
