package ru.mirea.pr_2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Lev Tolstoy", "tolstoy.l.n.@mail.ru", 'M');
        Author a2 = new Author("Jack London", "london.j@gmail.com", 'M');
        Author a3 = new Author("Ayn Rand", "ayn_rand@mail.ru", 'F');

        a2.setEmail("jack_london@mail.ru");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
