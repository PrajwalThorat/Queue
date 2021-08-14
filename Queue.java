public class Queue {
    Node front ;
    Node rear ;

    public Queue(){
        this.front = this.rear = null ; 
    }

    public void Enqueue(int item){
        Node node = new Node(item);
        if(this.rear==null){
            this.front = this.rear = node;
            return;
        }
        this.rear.nextNode = node;
        this.rear = node ;
    }

    public void Dequeue(){
        if(this.front==null){
            System.out.println("Queue is Empty!!");
            return;
        }
        Node node = this.front ;
        this.front = this.front.nextNode;

        if(this.front==null){
            this.rear = null;
        }
    }
}
