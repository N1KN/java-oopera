package ru.practicum;

public class Theatre {
    public static void main(String[] args) {
        // Создаём актёров
        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 180);
        Actor actor2 = new Actor("Мария", "Сидорова", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Алексей", "Каланча", Gender.MALE, 210);

        // Создаём режиссёров
        Director director1 = new Director("Станислав", "Ковалёв", Gender.MALE, 10);
        Director director2 = new Director("Анна", "Фёдорова", Gender.FEMALE, 7);

        // Автор музыки и хореограф — строки, хранятся в полях спектаклей
        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Игорь Моисеев";

        // Создаём три спектакля: обычный, опера и балет
        Show regularShow = new Show("Вишнёвый сад", director1);
        Opera opera = new Opera("Евгений Онегин", director1, musicAuthor, "Либретто оперы: Онегин встречает Татьяну...", 30);
        Ballet ballet = new Ballet("Лебединое озеро", director2, musicAuthor, "Либретто балета: Принц Зигфрид встречает лебедей...", choreographer);

        // Распределяем актёров по спектаклям
        System.out.println("Добавляем актёров");
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);
        regularShow.addActor(actor3);

        opera.addActor(actor1);
        opera.addActor(actor2);
        // Пробуем добавить уже существующего актёра
        opera.addActor(actor1);

        ballet.addActor(actor2);
        ballet.addActor(actor3);

        // Выводим список актёров каждого спектакля
        System.out.println("\nАктёры в \"" + regularShow.getTitle() + "\":");
        regularShow.printListOfActors();

        System.out.println("\nАктёры в \"" + opera.getTitle() + "\":");
        opera.printListOfActors();

        System.out.println("\nАктёры в \"" + ballet.getTitle() + "\":");
        ballet.printListOfActors();

        // Заменяем актёра в одном из спектаклей
        System.out.println("\nЗамена актёра в \"" + opera.getTitle() + "\":");
        opera.replaceActor(actor3, "Петров");
        System.out.println("Список актёров после замены:");
        opera.printListOfActors();

        // Пробуем заменить несуществующего актёра
        System.out.println("\nПопытка замены несуществующего актёра в \"" + ballet.getTitle() + "\":");
        ballet.replaceActor(actor1, "SOMEONE ELSE");

        // Выводим либретто оперы и балета
        System.out.println("\nЛибретто \"" + opera.getTitle() + "\":");
        opera.printLibretto();

        System.out.println("\nЛибретто \"" + ballet.getTitle() + "\":");
        ballet.printLibretto();
    }
}
