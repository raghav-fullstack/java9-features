package trywithresources;

public class MyWorker implements AutoCloseable{

    MyWorker(){
        System.out.println("Creating the resource.");
    }

    public void doSomething(){
        System.out.println("Doing something.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing the resources.");

    }
}
