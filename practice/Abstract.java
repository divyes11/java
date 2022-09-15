abstract class Bike{
    abstract void start();
    abstract void stop();
    abstract void run();
}

class Plender extends Bike{
    public void start(){
            System.out.println("START BIKE");
    }

    public void stop(){
            System.out.println("STOP BIKE");
    }

    public void run(){
            System.out.println("RUNNING BIKE");
    }
}

public class Abstract {
    public static void main(String[]args){
        Plender pr = new Plender();
        pr.start();
        pr.run();
        pr.stop();
        
    }
}