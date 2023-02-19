package telran.lessons.homewoerk;

public class Mobile extends Phone {

    private int number;

    public Mobile() {
    }

    public Mobile(int number) {
        this.number = number;
    }
    @Override
    public void call(String name) {
        System.out.println(name + " call to number " + number+" via Mobile");
//        super.call(name);
//        System.out.println(" via Mobile"+"\n");

    }

    @Override
    public void receiveCall(String name) {
        System.out.println(name + " receive call from number " + number +" via Mobile");

//        super.receiveCall(name);
//        System.out.println(" via Mobile"+"\n");

    }


}
