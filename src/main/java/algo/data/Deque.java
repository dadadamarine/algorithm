package algo.data;

public class Deque {
    static final int MAX = 100;
    private int[] arr;
    private int size;
    private int front;
    private int rear;

    public Deque(int size){
        arr = new int[size];
        front = -1;
        rear= -1;
        this.size = size;
    }

        /*// Operations on Deque:
    void  insertfront(int key);
    void  insertrear(int key);
    void  deletefront();
    void  deleterear();
    bool  isFull();
    bool  isEmpty();
    int  getFront();
        int  getRear();*/
        public boolean isEmpty(){
            if(front==-1){
                return true;
            }
            return false;
        }

        public boolean isFull(){
            if(front==0 && rear ==this.size-1){
                return true;
            }
            return false;
        }

        public void insertFront(int key){
            if(isFull()){
                return;
            }
            if( front == -1){
                front = rear = 0;
            }
            else if( front == 0){
                front = size -1;
            }
            else{
                front--;
            }
            arr[front] = key;
        }

        public void insertRear(int key){
            if(isFull()){
                return;
            }
            if(front == -1){
                front = rear = 0;
            }
            else if(rear == size -1){
                rear=0;
            }
            else{
                rear++;
            }
            arr[rear] = key;
        }

        void deleteFront(){
            if(isEmpty()){
                return;
            }
            if(front == rear){
                front = -1;
                rear = -1;
                return;
            }
            if(front == size-1){
                front = 0;
                return;
            }
            front = front + 1;
            return;
        }

        public void deleteRear(){
            if(isEmpty()){
                return;
            }
            if(front == rear){
                front = -1;
                rear = -1;
                return;
            }
            if(rear == 0){
                rear = size-1;
                return;
            }
            rear = rear-1;
        }
        int getFront(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
        int getRear(){
            if(isEmpty()){
                return -1;
            }
            return arr[rear];
        }
    public static void main(String[] args)
    {

        Deque dq = new Deque(5);

        System.out.println("Insert element at rear end  : 5 ");
        dq.insertRear(5);

        System.out.println("insert element at rear end : 10 ");
        dq.insertRear(10);

        System.out.println("get rear element : "+ dq.getRear());

        dq.deleteRear();
        System.out.println("After delete rear element new rear become : " +
                dq.getRear());

        System.out.println("inserting element at front end");
        dq.insertFront(15);

        System.out.println("get front element: " +dq.getFront());

        dq.deleteFront();

        System.out.println("After delete front element new front become : " +
                +  dq.getFront());

    }
}
