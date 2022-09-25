package zadanie_7;

public class zadanie_7 {
    public static void main(String[] args) {
        Polka polka = new Polka();
        Book[] book = new Book[3];
        for (int i = 0; i < book.length; i++){
            book[i] = new Book();
        }
        Book boook = new Book();
        boook.setName("rew");
        boook.setYear(1899);
        polka.setBooks(boook);
        boook = new Book();
        boook.setName("uytre");
        boook.setYear(1549);
        polka.setBooks(boook);
        boook = new Book();
        boook.setName("rwwww");
        boook.setYear(1899);
        polka.setBooks(boook);
        System.out.println(polka.oldestBook());
        polka.sortPolka();
    }
}

class Book{
    private String name;
    private String creater;
    private int year;
    private int pages;

    Book(){}
//    Book(Book other){
//         this.name = other.getName();;
//         this.creater = other.getCreater();
//         this.year = other.getYear();
//         this.pages = other.getPages();
//    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public String getCreater() {
        return creater;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }
}

class Polka{
    private Book[] books;
    Polka(){
        books = new Book[0];
    }
    Polka(int n){
        books = new Book[n];
        for (int i = 0 ; i < n; i++){
            books[i] = new Book();
        }
    }

    public void setBooks(Book book) {
        int k = 0;
        int count = 0;
        for (int i = 0; i < books.length; i++){
            if (books[i].getName() == null){
                k = i;
                count++;
                break;
            }
        }
        if (count == 0) {
            Book[] arr = new Book[this.books.length + 1];
            for (int i = 0; i < this.books.length; i++) {
                arr[i] = this.books[i];
            }
            arr[arr.length - 1] = book;
            books = new Book[arr.length];
            for (int i = 0; i < books.length; i++) {
//                books[i].setName(arr[i].getName());
                books[i] = arr[i];
            }
        }else {
            books[k] = book;
        }
    }

    public String oldestBook(){
        if (books.length != 0){
            Integer min = books[0].getYear();
            for (int i = 0; i < books.length; i++){
                if (books[i].getYear() < min){
                    min = books[i].getYear();
                }
            }
            return min.toString();
        }else {
            return "No books.";
        }
    }
    public void sortPolka(){
        for (int i = 0; i < books.length; i++){
            for (int j = 1; j < books.length; j++){
                if (books[j].getYear() < books[j - 1].getYear()){
                    Book boo = books[j];
                    books[j] = books[j - 1];
                    books[j - 1] = boo;
                }
            }
        }
        for (Book boo : books){
            System.out.println(boo.getName());
        }
    }
}