package uz.aim.hhuz.exceptions;

public class VacancyNotFoundException extends RuntimeException{
    public VacancyNotFoundException(String message) {
        super(message);
    }
}
