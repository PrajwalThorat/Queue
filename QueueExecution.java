public class QueueExecution {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Dequeue();
        queue.Dequeue();
        queue.Enqueue(30);
        queue.Enqueue(40);
        queue.Enqueue(50);
        System.out.println("Queue Front : "+queue.front.data);
        System.out.println("Queue Rear  : "+queue.rear.data);
    }
}
