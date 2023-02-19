package telran.lessons.homewoerk;


// 1)Создать класс Phone  с методами call() и receiveCall();
//  Данные методы должны звонить по указанному номеру и принимать звонки от передаваемого номера.(требуется параметр в методах)
//  (примерная логика метода call следующая Phone "name" … call to "number" …)
//  (примерная логика метода receiveCall следующая Phone "name" … receive call from"number" …)
public class Phone {
    private int number;

    public Phone() {
    }

    public Phone(int number) {
        this.number = number;
    }

    public void call(String name) {
        System.out.println(name + " call to number " + number + " ");
    }

    public void receiveCall(String name) {
        System.out.println(name + " receive call from number " + number + " ");
    }


}
