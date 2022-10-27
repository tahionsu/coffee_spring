package com.ntnv.gldva.coffee.exception;

public class CoffeeNotFoundException extends Exception {
    public CoffeeNotFoundException(String message) {
        super(message);
    }

    /*
    Для своих эксепшн классов желательно еще сделать конструктор с параметрами
    public CoffeeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    тогда можно делать выброску исключений со своим сообщением, не теряя предыдщее исключение.
    В твоем случае таких ситуаций сейчас нет, но всегда смотрим в будущее - может всегда возникнуть такая ситуация.

    Как минимум нужно помнить про этот конструктор :)

     */
}