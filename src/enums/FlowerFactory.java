package enums;

/**
 * Created by cs.ucu.edu.ua on 12/25/2016.
 */

public enum FlowerFactory {
    BIRTHDAY, FUNERAL, WEDDING;
    public String toString(){
        switch (this){
            case BIRTHDAY:
                return "Bucket for birthday.";
            case FUNERAL:
                return "Bucket for funeral.";
            case WEDDING:
                return "Bucket for wedding.";
            default:
                return "no factory.";
        }


    }
}
