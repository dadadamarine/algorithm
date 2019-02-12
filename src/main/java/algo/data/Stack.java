package algo.data;

public class Stack {

    private int size;
    private int top;
    private Data[] datas;

    public Stack(int size){
        this.size = size;
        this.top = -1;
        this.datas = new Data[size];
    }

    class Data{
        int data;

        Data(int data){
            this.data = data;
        }
    }

    public boolean isEmpty(){
        if(this.top<0){

            return true;
        }

        return false;
    }

    public boolean push(Data data){
        if(top > this.size-1){

            return false;
        }
        datas[++top] = data;

        return true;
    }
    public Data pop(){
        if(top<0){

            return null;
        }

        return datas[top--];
    }
    public Data peek(){
        if(top<0){

            return null;
        }

        return datas[top];
    }
}

