package telran.lessons.homewoerk;

// 1)Создать класс Phone  с методами call() и receiveCall();
//  Данные методы должны звонить по указанному номеру и принимать звонки от передаваемого номера.
//  (требуется параметр в методах)
//  (примерная логика метода call следующая Phone "name" … call to "number" …)
//  (примерная логика метода receiveCall следующая Phone "name" … receive call from"number" …)
// ---------------------------------------------
//  Создать три дополнительных класса - разновидность телефонов,
//  которые должны иметь свою реализацию вышеуказанных методов.
//  (классы должны быть связаны с классом Phone)
// ---------------------------------------------
//  Каждый из трех классов телефонов , должен иметь
//  --переменную, которая будет инициализировать(называть) данный телефон(),
//  --переменную которая будет принимать номер телефона по которому совершать звонок и от которого принимать звонок.
//  Внимательно подумать, какая переменная должна относиться к классу, а какая должна передаваться в метод.
// ---------------------------------------------
//  В методе main создать объекты вышеуказанных типов.
// ----------------------------------------------
//  в классе основной программы добавить метод makeCall(),
//  который в качестве параметра может принимать любой телефон и совершать звонок,
//  по указанному номеру, подумать как и откуда передавать переменную с номером.
// ----------------------------------------------
//  Аналогично добавить метод receiveCall , который может принимать звонки с любого телефона
//  и любого номера.
// ------------------------------------------------
//  2) Добавить методы в основной класс, которые могу принимать массив телефонов и совершать и получать звонки.

public class Main {

    public static void main(String[] args) {

        Phone phoneOne = new Phone(555555);
        Orange orangeOne = new Orange(777777);
        Mobile mobileOne = new Mobile(888888);
        Vodafone vodafoneOne = new Vodafone(999999);

        phoneOne.call("Bill");
//        System.out.print("\n");
        orangeOne.call("Kate");
        mobileOne.call("Lily");
        vodafoneOne.call("Jane");
        System.out.println("-----------------");
        phoneOne.receiveCall("James");
//        System.out.print("\n");
        orangeOne.receiveCall("Mike");
        mobileOne.receiveCall("Faina");
        vodafoneOne.receiveCall("Iren");
        System.out.println("-----------------");
        Phone[] phones = {new Phone(333),new Orange(444),new Mobile(555),new Vodafone(666)};

        for(Phone ePhone: phones){
            ePhone.call("Faina");
        }
        for(Phone ePhone: phones){
            ePhone.receiveCall("Mille");
        }

        System.out.println("------------------");
        for(Phone ePhone: phones){
            makeCall(ePhone, "Jane");
            receiveCall(ePhone,"Kate");
        }


    }


    public static void makeCall(Phone phone, String name){
//        System.out.println("This makeCall function call to number " +number);
        phone.call(name);
    }

    public static void receiveCall(Phone phone, String name){
//        System.out.println("This receiveCall function receive call from number " +number);
        phone.receiveCall(name);
    }

}
