package org.example;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.name = "My Book";
        book.author = "Andrey";
        book.price = 69;

        book.showContent();
        book.makePromo();

        if (book.onSale){
            book.price = 20;
            book.showContent();
        }else {
            book.price = 69;
        }



    }

}