class Queue {
    int front, rear, size;
    int capacity;
    int array[];
  
    public Queue(int capacity)
    {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }
  

    public boolean isFull(Queue queue)
    {
        return (queue.size == queue.capacity);
    }
  

    public boolean isEmpty(Queue queue)
    {
        return (queue.size == 0);
    }
  
    public void enqueue(int item)
    {
        if (isFull(this))
            return;
        this.rear = (this.rear + 1)
                    % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        
    }

    public int dequeue()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
  
        int item = this.array[this.front];
        this.front = (this.front + 1)
                     % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    public int peek()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
  
        return this.array[this.front];
    }

    public int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
  
        return this.array[this.rear];
    }
}
  