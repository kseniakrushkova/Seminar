package ru.imit.omsu.seminar3;

public enum MarkState {
    ЗАЧТЕНО,УДОВЛЕТВОРИТЕЛЬНО,ХОРОШО,ОТЛИЧНО;

    public static MarkState fromString (String str){
        if(str==null){
            throw  new IllegalArgumentException("mark can not be applied");
        }
        try {
            return MarkState.valueOf(str);
        }catch (IllegalArgumentException e){
            throw  new IllegalArgumentException("mark can not be applied");
        }
    }
}
