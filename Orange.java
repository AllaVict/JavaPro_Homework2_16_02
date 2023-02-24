package telran.lessons.homewoerk;


public class Orange extends Phone {

    private int number;

    public Orange() {
        this.number = number;
    }

    public Orange(int number) {
        this.number = number;
    }

    @Override
    public void call(String name) {
        System.out.println(name + " call to number " + number+" via Orange");

    }

    @Override
    public void receiveCall(String name) {
        System.out.println(name + " receive call from number " + number +" via Orange");

    }



}
