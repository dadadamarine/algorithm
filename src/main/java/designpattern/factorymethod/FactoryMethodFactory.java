package designpattern.factorymethod;

public class FactoryMethodFactory {

    public Robot generate(String type){
        if(type.equals("A")){
            return new ARobot();
        }
        if(type.equals("B")){
            return new BRobot();
        }
        return new ARobot();
    }


}
