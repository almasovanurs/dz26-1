

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       /* Car деген класс тузунуз (Id, номер авто)
        Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
        HashMap тузунуз ключ - машина, маани - машинанын данныйлары
        HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.*/

        Map<Car, InformationCar> map = new HashMap<>();
        Car car1 = new Car(1, 111);
        Car car2 = new Car(2, 777);
        Car car3 = new Car(3, 555);


        InformationCar informationCar1 = new InformationCar(2022, "Mercedes-Benz", 8000660, "black");
        InformationCar informationCar2 = new InformationCar(2019, "BMW 7-series", 568007, "white" );
        InformationCar informationCar3 = new InformationCar(2021, "Toyota RAV4", 2671000, "black");

        map.put(car1, informationCar1);
        map.put(car2, informationCar2);
        map.put(car3, informationCar3);

        for(Map.Entry<Car, InformationCar> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

       }
    }
