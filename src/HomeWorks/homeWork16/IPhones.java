package HomeWorks.homeWork16;

public class IPhones implements Smartphones, IOS{

    String name;

    public IPhones(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println(name + " Make call");
    }

    @Override
    public void sms() {
        System.out.println(name + " Sent sms");
    }

    @Override
    public void internet() {
        System.out.println(name + " Connect to internet");
    }

    @Override
    public void getVersion() {
        System.out.println(name + " Version system");
    }
}
