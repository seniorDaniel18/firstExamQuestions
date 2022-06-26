import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

        int question = rn.nextInt(0,65);

        //Если найдёте грамотические или ещё какие-то ошибки - не обессудь, я старался T_T

        switch (question) {
            case 0:
                System.out.println("Отдохните от вопросов и сделайте 5мин перерыв ^_^");
                break;
            case 1:
                System.out.println("Что такое алгоритм?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer1 = sc.next();
                if (answer1.equals("q")){
                    System.out.println("Алгоритм — это последовательность действий, которые необходимо выполнить, чтобы решить поставленную задачу.");
                }
                break;
            case 2:
                System.out.println("Какими путями можно вывести информацию на консоль?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer2 = sc.next();
                if (answer2.equals("q")){
                    System.out.println("С помощью методов print();, println();, printf();. С помощью Scanner");
                }
                break;
            case 3:
                System.out.println("Какие виды комментариев есть и для чего они используются?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer3 = sc.next();
                if (answer3.equals("q")){
                    System.out.println("Однострочные // и многострочные /* */. Используются в основном для заметок");
                }
                break;
            case 4:
                System.out.println("Какие типы есть в Java?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer4 = sc.next();
                if (answer4.equals("q")){
                    System.out.println("Примитивный логический boolean. Примитивные числовые byte, short, int, long, char || double, float");
                }
                break;
            case 5:
                System.out.println("Что такое переменная?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer5 = sc.next();
                if (answer5.equals("q")){
                    System.out.println("Это кантейнер, в котором может храниться значение данных для дальнейшего использования");
                }
                break;
            case 6:
                System.out.println("Из каких частей состоит переменная?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer6 = sc.next();
                if (answer6.equals("q")){
                    System.out.println("3 (тип, имя, значение");
                }
                break;
            case 7:
                System.out.println("Что используется для получения информации ИЗ консоли?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer7 = sc.next();
                if (answer7.equals("q")){
                    System.out.println("Scanner");
                }
                break;
            case 8:
                System.out.println("Какую работу выполняет амперсанд?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer8 = sc.next();
                if (answer8.equals("q")){
                    System.out.println("Амперсад нужен для проверки двух или более условий");
                }
                break;
            case 9:
                System.out.println("Что такое инкремент и декремент?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer9 = sc.next();
                if (answer9.equals("q")){
                    System.out.println("Инкремент увеличивает значение на единицу i++;. Декремент уменьшает i--;");
                }
                break;
            case 10:
                System.out.println("Что такое постфикс и префикс"); // i++ ++i?
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer10 = sc.next();
                if (answer10.equals("q")){
                    System.out.println("Операторы увеличения/уменьшения. Постфикс i++ | Префикс ++i");
                }
                break;
            case 11:
                System.out.println("Расскажите методы класса Math");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer11 = sc.next();
                if (answer11.equals("q")){
                    System.out.println(".sqrt(a); - находит квадратный корень");
                    System.out.println(".pow(a, b); - возведение в степень");
                    System.out.println(".round(a.b); - округление");
                    System.out.println(".ceil(a.b); - потолок на округление");
                    System.out.println( ".floor(a.b); - пол на округление");
                }
                break;
            case 12:
                System.out.println("Что такое Random?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer12 = sc.next();
                if (answer12.equals("q")){
                    System.out.println("Генератор случайных числе");
                }
                break;
            case 13:
                System.out.println("Как получить случайное число от -51 до 2?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer13 = sc.next();
                if (answer13.equals("q")){
                    System.out.println("В аргумент дать диапозон (-51, 2)");
                }
                break;
            case 14:
                System.out.println("Как изменить тип какой-либо информации в Java?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer14 = sc.next();
                if (answer14.equals("q")){
                    System.out.println("Сделать type casting");
                }
                break;
            case 15:
                System.out.println("Что такое конкатенация?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer15 = sc.next();
                if (answer15.equals("q")){
                    System.out.println("Операция объединения строк");
                }
                break;
            case 16:
                System.out.println("Сколько в Java условных операторов?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer16 = sc.next();
                if (answer16.equals("q")){
                    System.out.println("6 (== | > | < | >= | <= | !=)");
                }
                break;
            case 17:
                System.out.println("Какие значения принимает if в качестве условия?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer17 = sc.next();
                if (answer17.equals("q")){
                    System.out.println("В качестве условия - сравнение двух строк");
                }
                break;
            case 18:
                System.out.println("Можно ли написать блок if без блока else?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer18 = sc.next();
                if (answer18.equals("q")){
                    System.out.println("Да");
                }
                break;
            case 19:
                System.out.println("Какое значение может вернуть оператор сравнивания 'больше/меньше'?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer19 = sc.next();
                if (answer19.equals("q")){
                    System.out.println("Максимальное или минимальное значение");
                }
                break;
            case 20:
                System.out.println("Сколько частей у тернарного оператора?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer20 = sc.next();
                if (answer20.equals("q")){
                    System.out.println("3 (условие + 2 выражения)");
                }
                break;
            case 21:
                System.out.println("Что будет если не поставить break в switch case?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer21 = sc.next();
                if (answer21.equals("q")){
                    System.out.println("Код продолжит выполнение, игнорируя следующие сравнения");
                }
                break;
            case 22:
                System.out.println("Сколько циклов в Java?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer22 = sc.next();
                if (answer22.equals("q")){
                    System.out.println("4 (while | do while | for | for each");
                }
                break;
            case 23:
                System.out.println("Что такое цикл?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer23 = sc.next();
                if (answer23.equals("q")){
                    System.out.println("Блок команд, который выполняется снова и снова, пока условие true");
                }
                break;
            case 24:
                System.out.println("Какие значения в качестве условия берут циклы?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer24 = sc.next();
                if (answer24.equals("q")){
                    System.out.println("Правила которые работаят от и до");
                }
                break;
            case 25:
                System.out.println("В чём разница между while и do while?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer25 = sc.next();
                if (answer25.equals("q")){
                    System.out.println("while сначала проверяет условие, do while сначала делает, потом проверяет");
                }
                break;
            case 26:
                System.out.println("Какую проблему решают циклы?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer26 = sc.next();
                if (answer26.equals("q")){
                    System.out.println("Не нужно делать одно и тоже действие много раз");
                }
                break;
            case 27:
                System.out.println("В чём разница между for и foreach?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer27 = sc.next();
                if (answer27.equals("q")){
                    System.out.println("foreach обрабатывает экземпляр каждого элемента в массиве");
                    System.out.println("for работает с любыми данными, не только с элементами массива");
                }
                break;
            case 28:
                System.out.println("Как сделать дэбаг кода?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer28 = sc.next();
                if (answer28.equals("q")){
                    System.out.println("1.Выбрать нужную для проверки часть кода");
                    System.out.println("2.Нажать на жука сверху");
                }
                break;
            case 29:
                System.out.println("Что такое массив?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer29 = sc.next();
                if (answer29.equals("q")){
                    System.out.println("'каробка' в которой храняться элементы одного типа с определённой нумерацией");
                }
                break;
            case 30:
                System.out.println("Со скольки начинается индекс массива?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer30 = sc.next();
                if (answer30.equals("q")){
                    System.out.println("Индекс начинается с 0");
                }
                break;
            case 31:
                System.out.println("Сколько индексов у массива?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer31 = sc.next();
                if (answer31.equals("q")){
                    System.out.println("Сколько захотим");
                }
                break;
            case 32:
                System.out.println("Массив какого типа можно построить?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer32 = sc.next();
                if (answer32.equals("q")){
                    System.out.println("Числового (int, double и т.д.), логического (boolean) и String");
                }
                break;
            case 33:
                System.out.println("Способы построения массива и в чём их отличия?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer33 = sc.next();
                if (answer33.equals("q")){
                    System.out.println("1.Дать массиву определённый размер и далее заниматься постраением");
                    System.out.println("2.Строить массив без определённого размера");
                    System.out.println("Разница:");
                    System.out.println("В 1-ом случае мы можем дать только ограниченное кол-во значений");
                    System.out.println("Во 2-ом сколько угодно");
                }
                break;
            case 34:
                System.out.println("Как узнать размер массива?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer34 = sc.next();
                if (answer34.equals("q")){
                    System.out.println("System.out.println(array.length)");
                }
                break;
            case 35:
                System.out.println("Как взять элементы из массива?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer35 = sc.next();
                if (answer35.equals("q")){
                    System.out.println("System.out.println(array[i])");
                }
                break;
            case 36:
                System.out.println("Какие есть виды метода?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer36 = sc.next();
                if (answer36.equals("q")){
                    System.out.println("Возвращающий и не возвращающий");
                }
                break;
            case 37:
                System.out.println("Какую проблему решает метод?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer37 = sc.next();
                if (answer37.equals("q")){
                    System.out.println("Не приходится писать один и тот же код несколько раз");
                }
                break;
            case 38:
                System.out.println("В чём разница между параметром и аргументом?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer38 = sc.next();
                if (answer38.equals("q")){
                    System.out.println("Параметр - переменная, определённая методом, которая принимает значение при вызове метода");
                    System.out.println("Аргумент - значение, передаваемое методу при вызове метода");
                }
                break;
            case 39:
                System.out.println("Какое место называется параметром метода?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer39 = sc.next();
                if (answer39.equals("q")){
                    System.out.println("внутри () после имени метода");
                }
                break;
            case 40:
                System.out.println("Какой тип и сколько параметров можно дать методу?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer40 = sc.next();
                if (answer40.equals("q")){
                    System.out.println("Любой тип, любое кол-во параметров");
                }
                break;
            case 41:
                System.out.println("Где можно дать аргумент методу?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer41 = sc.next();
                if (answer41.equals("q")){
                    System.out.println("В методе main при вызове метода");
                }
                break;
            case 42:
                System.out.println("Можно ли в параметр метода дать массив?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer42 = sc.next();
                if (answer42.equals("q")){
                    System.out.println("Да");
                }
                break;
            case 43:
                System.out.println("Можно ли к методу void приписать return?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer43 = sc.next();
                if (answer43.equals("q")){
                    System.out.println("Нет");
                }
                break;
            case 44:
                System.out.println("Значения какого типа может вернуть возвращающий метод?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer44 = sc.next();
                if (answer44.equals("q")){
                    System.out.println("Любого");
                }
                break;
            case 45:
                System.out.println("Что можно написать внутри метода?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer45 = sc.next();
                if (answer45.equals("q")){
                    System.out.println("Код (формулу) которая будет использоваться в дальнейшем");
                }
                break;
            case 46:
                System.out.println("Может ли метод возвращать массив?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer46 = sc.next();
                if (answer46.equals("q")){
                    System.out.println("Да");
                }
                break;
            case 47:
                System.out.println("Можно ли не писать return в возвращающий метод?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer47 = sc.next();
                if (answer47.equals("q")){
                    System.out.println("Нет");
                }
                break;
            case 48:
                System.out.println("Сколько раз мы можем вызывать метод?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer48 = sc.next();
                if (answer48.equals("q")){
                    System.out.println("Сколько угодно");
                }
                break;
            case 49:
                System.out.println("Где можно вызывать метод?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer49 = sc.next();
                if (answer49.equals("q")){
                    System.out.println("В главном методе main");
                }
                break;
            case 50:
                System.out.println("Сколько методов можно построить в Java?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer50 = sc.next();
                if (answer50.equals("q")){
                    System.out.println("Сколько угодно");
                }
                break;
            case 51:
                System.out.println("Можно ли имена методов сделать одинаковыми?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer51 = sc.next();
                if (answer51.equals("q")){
                    System.out.println("Нет");
                }
                break;
            case 52:
                System.out.println("Для чего нужен возвращающий метод?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer52 = sc.next();
                if (answer52.equals("q")){
                    System.out.println("Чтобы вернуть значение метода. Чтобы в дальнейшем исползовать код");
                }
                break;
            case 53:
                System.out.println("Что такое varargs?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer53 = sc.next();
                if (answer53.equals("q")){
                    System.out.println("Список переменной длины, в которой лежат аргументы");
                }
                break;
            case 54:
                System.out.println("Какую проблему решает varargs?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer54 = sc.next();
                if (answer54.equals("q")){
                    System.out.println("Varargs позваляет создавать методы с произвольным количеством аргументов");
                }
                break;
            case 55:
                System.out.println("Сколько varargs можем дать в один метод?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer55 = sc.next();
                if (answer55.equals("q")){
                    System.out.println("Один");
                }
                break;
            case 56:
                System.out.println("Можно ли после varargs дать другие параметры?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer56 = sc.next();
                if (answer56.equals("q")){
                    System.out.println("Нет");
                }
                break;
            case 57:
                System.out.println("Какую работу выполняет charAt();?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer57 = sc.next();
                if (answer57.equals("q")){
                    System.out.println("Возвращает символ, расположенный по указонному индексу");
                }
                break;
            case 58:
                System.out.println("Как работает метод substring();?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer58 = sc.next();
                if (answer58.equals("q")){
                    System.out.println("Начинает строку с того индекса, который задали");
                    System.out.println("И заканчивает тем, который дали");
                }
                break;
            case 59:
                System.out.println("Как работает метод contains();?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer59 = sc.next();
                if (answer59.equals("q")){
                    System.out.println("Проверяет наличие указанного элемента в данной строке");
                }
                break;
            case 60:
                System.out.println("Для чего нужны методы toUpperCase(); и toLowerCase();?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer60 = sc.next();
                if (answer60.equals("q")){
                    System.out.println("toUpperCase - делает все буквы в данной стpоке заглавными");
                    System.out.println("toLowerCase - делает все буквы в данной строке прописными");
                }
                break;
            case 61:
                System.out.println("Для чего нужен метод trim();?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer61 = sc.next();
                if (answer61.equals("q")){
                    System.out.println("Удаляет лишние пробелы в начале и в конце");
                }
                break;
            case 62:
                System.out.println("Для чего нужен метод equals();?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer62 = sc.next();
                if (answer62.equals("q")){
                    System.out.println("Сравнивает две строки");
                }
                break;
            case 63:
                System.out.println("Для чего нужен метод replace();?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer63 = sc.next();
                if (answer63.equals("q")){
                    System.out.println("Заменяет символ в строке");
                }
                break;
            case 64:
                System.out.println("Как можно назвать String?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String answer64 = sc.next();
                if (answer64.equals("q")){
                    System.out.println("Тип данных, который хранит строки");
                }
                break;
            default:
                System.out.println("Отдохните от вопросов и сделайте 5мин перерыв ^_^");
        }

                System.out.println("\n---------------------------");
                System.out.println("code author: Даниель ❤️❤️❤️");

    }
}