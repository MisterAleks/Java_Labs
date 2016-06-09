package Labs_Java.Lab_8;

import java.util.*;

/**
 * Created by Алексей on 17.05.2016.
 * <p/>
 * <p/>
 * КОЛЛЕКЦИИ
 * <p/>
 * 1. HashSet из растений. Создать коллекцию HashSet с типом элементов String.
 * Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 * Посмотреть, как изменился порядок добавленных элементов.
 * <p/>
 * 2. HashMap из 10 пар. Создать коллекцию HashMap<String, String>,
 * занести туда 10 пар строк: арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт,
 * дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 * Пример вывода (тут показана только одна строка): картофель - клубень
 * <p/>
 * 3. Коллекция HashMap из котов. Есть класс Cat, с полем имя (name, String).
 * Создать коллекцию HashMap<String, Cat>. Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
 * Вывести результат на экран, каждый элемент с новой строки.
 * <p/>
 * 4. Вывести на экран список ключей. Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
 * Вывести на экран список ключей, каждый элемент с новой строки.
 * <p/>
 * 5.Вывести на экран список значений. Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
 * Вывести на экран список значений, каждый элемент с новой строки.
 * <p/>
 * 6. Коллекция HashMap из Object. Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 * Пример вывода (тут показана только одна строка): Sim - 5
 */
public class Lab_8_MainClass {
    public static void main(String[] args) {
        //Задание №1
        Set<String> plants = new HashSet<String>();
        String set = "арбуз банан вишня груша дыня ежевика жень-шень земляника ирис картофель";
        String subSet = "";

        System.out.println("Первое задание. Исходный список:\n\n" + set + "\n");

        //Ввод. Разберем на части строку. Посимвольное присваивание подстроке. При встрече пробела
        //обнуление подстроки и запись в Set
        for (int i = 0; i < set.length(); i++) {
            if (set.charAt(i) == ' ') {
                plants.add(subSet);
                subSet = "";
            } else {
                subSet += set.charAt(i);
            }
        }
        //Последний не добавился, так как в конце исходной строки нет пробела
        plants.add(subSet);

        //Вывод без итератора в Set
        for (String out : plants) {
            System.out.println(out);
        }

        //
        //
        //Задание №2
        Map<String, String> pairs = new HashMap<String, String>();
        String hash = "арбуз:ягода банан:трава вишня:ягода груша:фрукт дыня:овощ ежевика:куст" +
                " жень-шень:корень земляника:ягода ирис:цветок картофель:клубень";

        //Подстроки Ключ и Значение
        String hashKey = "";
        String hashValue = "";

        System.out.println("\nВторое задание. Исходный список:\n\n" + hash + "\n");

        //Ввод
        for (int i = 0; i < hash.length(); i++) {
            if (hash.charAt(i) == ' ') {
                //Ввод достаточно специфичный. Заполняются обе подстроки, поэтому из первой нужно убрать вторую
                //Она заполнится и в первой, поскольку мы рассматриваем все до пробела (2 слова, записываются
                //одновременно в обе подстроки)

                //Вычитаем из текущей длины длину второй подстроки
                int end = hashKey.length() - hashValue.length();
                hashKey = hashKey.substring(0, end);

                pairs.put(hashKey, hashValue);
                hashKey = "";
                hashValue = "";
            } else
                if (hash.charAt(i) == ':') {
                    //А вот здесь спокойно обнуляем вторую подстроку. Так как в нее тоже запишется, но уже первая
                    hashValue = "";
                } else {
                    //При отсутствии разделителей, заполняем обе подстроки
                    hashKey += hash.charAt(i);
                    hashValue += hash.charAt(i);
                }
        }
        //Последний не добавился, так как в конце исходной строки нет пробела
        int end = hashKey.length() - hashValue.length();
        hashKey = hashKey.substring(0, end);

        //Добавляем и переходим к выводу
        pairs.put(hashKey, hashValue);

        //Тип HashMap для вывода не может обойтись без итератора!
        Iterator<Map.Entry<String, String>> iteratorPairs = pairs.entrySet().iterator();

        //Вывод
        while (iteratorPairs.hasNext()) {
            Map.Entry<String, String> map = iteratorPairs.next();
            String key = map.getKey();
            String value = map.getValue();
            System.out.println(key + " - " + value);
        }

        //
        //
        //Задание №3
        Map<String, Cat> cats = new HashMap<String, Cat>();

        System.out.println("\nТретье задание\n");

        //Ввод
        for (int i = 1; i < 11; i++) {
            String name = "Кот " + i;

            //Просто для справки)) Постоянно используется одна переменная cat
            //Это означает, что объекты создаются в переменной cat, записываются в HashMap cats и потом ссылка
            //на них в переменной затирается. Больше к ним никак не обратиться, кроме как из cats. В переменной
            //cat останется только последний объект класса Cat
            Cat cat = new Cat(name);
            cats.put(cat.getName(), cat);
        }

        Iterator<Map.Entry<String, Cat>> iteratorCats = cats.entrySet().iterator();

        //Вывод
        while (iteratorCats.hasNext()) {
            Map.Entry<String, Cat> out = iteratorCats.next();
            String key = out.getKey();
            Cat value = out.getValue();
            System.out.println(key + " - это объект Cat = " + value);
        }

        //
        //
        //Задание №4, Задание №5.
        //Делаются по принципу вывода в задании №2
        System.out.println("\nЗадания №4 и №5 делаются по принципу вывода ключей и значений в задании №2");

        //
        //
        //Задание №6
        //Делается по принципу задания №3
        System.out.println("\nЗадание №6 делается по принципу задания №3");
    }
}
