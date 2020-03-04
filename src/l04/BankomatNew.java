/**Создать класс, описывающий банкомат. Набор купюр, находя щихся в банкомате должен задаваться тремя
 свойствами: количеством купюр номиналом 20, 50 и 100. Сделать методы для
добавления денег в банкомат. Сделать функцию, снимающую деньги, которая принимает сумму -
При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */

package l04;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        // создаем объект банкомат
        BankomatNew bankomat = new BankomatNew ();
        // вызываем метод и передаем ему пустой массив (0 объектов класса банкнот)
        bankomat.inputMoney ( new Banknote[ 0 ] );
        // вызываем метод
        bankomat.withdrawMoney ();
    }
}
// создаем класс банкомат
public class BankomatNew {
    //создаем пустой масиив кот будем заполнять когда будем класть деньги в банкомат
    private Banknote[] container1 = new Banknote[ 0 ];
// метод ввода денег (сами деньги кот мы кладем в банкомат)
    public void inputMoney(Banknote[] container2) {

        int container3Size = container1.length + container2.length;
        Banknote[] container3 = new Banknote[ container3Size ];

        for (int i = 0; i < container3.length; i++) {
            if ( i < container1.length ) {
                container3 [ i ] = container1[ i ];
            } else {
                int indexContainer2Array = i - container1.length;
                container3[ i ] = container2 [ indexContainer2Array ];
            }
        }

        container1 = container3;
    }

    public boolean withdrawMoney() {
        System.out.println ( "Введите желаемую сумму" );

        Scanner scanner = new Scanner ( System.in );
        int requestedMoney = scanner.nextInt ( );

        if ( requestedMoney > 800 ) {
            System.out.println ( "Ошибка! Запрошенная сумма больше единоразового лимита!" );

            return false;
        }
        // алгоритм выдачи денег
        float value = (float) requestedMoney / 20.0f;
        int value2 = (int) value;
        float value3 = value - value2;

        if ( requestedMoney % 100 == 0 ) {
            System.out.println ( "К выдаче " + requestedMoney + " р. К выдаче " + requestedMoney / 100 +
                    " cторублевых купюры" );

            return true;
        } else if ( requestedMoney % 50 == 0 ) {
            System.out.println ( "К выдаче " + requestedMoney + " р. К выдаче " + requestedMoney / 50 +
                    " пятидесятирублевых купюры" );

            return true;
        } else if ( requestedMoney % 20 == 0 ) {
            System.out.println ( "К выдаче " + requestedMoney + " р. К выдаче " + requestedMoney / 20 +
                    " двадцатирублевых купюры" );

            return true;
        } else if ( value3 == 0.5f && value >= 2.5 ) {
            //5 - это купюра с номинилом в 100
            //2.5 - это купюра с номинилом в 50
            //1 - это купюра с номинилом в 20

            int колличество20 = 0;
            int колличество50 = 0;
            int колличество100 = 0;

            // В таких ситуациях у нас всегда есть 50
            колличество50 += 1;
            value = value - 2.5f;

            if (value > 5) {
                колличество100 = (int) (value / 5);
                value = value - колличество100 * 5;
            }

            колличество20 = (int) value;

            System.out.println ( "К выдаче " + requestedMoney + " р." +
                    " Колличество двадцаток: " +  колличество20 + "\n" +
                    " Колличество пятидесяток: " +  колличество50 + "\n" +
                    " Колличество соток: " +  колличество100 + "\n");

            return true;
        } else {
            System.out.println ( "Введите другую сумму. В банкомате имеются купюры наминалом 20, 50 и 100 рублей. " +
                    "Максимальная сумма составляет 800 рублей" );

            return false;
        }
    }
}

class Banknote {
    private int faceValue;

    // создаем конструктор с номиналом купюры кот зададим при создании объекта
    Banknote(int money) {
        faceValue = money;
    }
}
