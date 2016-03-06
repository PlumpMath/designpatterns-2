package pl.training.spring;

public class DieselEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Diesel engine started...");
    }

    @Override
    public void stop() {
        System.out.println("Diesel engine stopped...");
    }

}
