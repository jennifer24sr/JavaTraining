package generics;

public class Generics<Y> {

    Y obj;
    public Generics(Y obj){
        this.obj = obj;
    }
    public Y getObject(){
        return this.obj;
    }
    public <Y> void genericsDisplay(Y type){
        System.out.println(type.getClass().getName() + " " + type);
    }
}

