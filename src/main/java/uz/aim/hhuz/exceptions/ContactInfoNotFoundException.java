package uz.aim.hhuz.exceptions;

public class ContactInfoNotFoundException extends RuntimeException{
    public ContactInfoNotFoundException(String message) {
        super(message);
    }
}
