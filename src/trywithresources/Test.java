package trywithresources;

public class Test {

    public static void main(String[] args) {
        MyWorker myWorker = new MyWorker();

        try(myWorker){
            myWorker.doSomething();
        }catch(Exception e){

        }
    }
}
