package telran.lessons.homewoerk;

public class  Vodafone extends Phone {

    private int number;

    public Vodafone() {
    }

    public Vodafone(int number) {
        this.number = number;
    }

    @Override
    public void call(String name) {
        System.out.println(name + " call to number " + number+" via Vodafone");
//        super.call(name);
//        System.out.println(" via Vodafone");

    }

    @Override
    public void receiveCall(String name) {
        System.out.println(name + " receive call from number " + number +" via Vodafone");
//        super.receiveCall(name);
//        System.out.println(" via Vodafone");

    }
}
