public class Main {
    public static void main(String[] args) {

        Book tomSawyer = new Book("Том Сойер", 1876, "Марк Твен");
        System.out.println("Название произведения = " + tomSawyer.getBookName() );
        System.out.println("Год издания = " + tomSawyer.getBookAge());
        Author markTwen = new Author("Марк", "Твен");
        System.out.println("Имя и фамилие автора  - " + markTwen.getNameAuthor() + " " + markTwen.getSurnameAuthor() );



    }
}