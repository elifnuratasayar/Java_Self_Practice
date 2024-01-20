package day04_practice_tasks;

public class HttpStatusCode {

    public static void main(String[] args) {
        int statusCode=200;
        String Print;
        switch (statusCode){
            case 200 -> Print = "Ok";
            case 201 -> Print ="Created";
            case 202 -> Print="Accepted";
            case 301 -> Print="Moved Permanently";
            case 303 -> Print="See Other";
            case 304 -> Print="Not Modified";
            case 307 -> Print="Temporary Redirect";
            case 400 -> Print= "Bad Request";
            case 401 -> Print="Unauthorized";
            case 403 -> Print="Forbidden";
            case 404 -> Print="Not Found";
            case 410 -> Print="Gone";
            case 500 -> Print="Internal Server Error";
            case 503 -> Print="Service Unavailable";
            default -> Print= "Invalid";}
            System.out.println(Print);
        }
}
