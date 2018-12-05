package image;

public class NotSupportedException extends RuntimeException {

    String message;

    NotSupportedException(String message){
        this.message = message;
    }
}
