
public class QueueMetodosImplementados <E> implements Queue<E> {

    private E[] data;
    private int p;

    public QueueMetodosImplementados(int len){     //Inicializamos el vector (es el constructor)
        this.data = (E[])new Object[len];   //Deprecado(java me aconseja otra manera de hacerlo)
        this.p =0;
    }

    public void push(E e) throws QueueFullException{
        if (this.isFull()) throw new QueueFullException();
        data[p++]=e;
    }

    private boolean isFull(){
        return (p>= this.data.length);
    }

    public E pop() throws QueueEmptyException{
        if(this.isEmpty()) throw new QueueEmptyException();
        E res= this.data[0];
        lshift();
        p--; // --> size()
        return res;
    }

    /**
     *  vIn: {0,1,2,3,4,5,6,7,8,9,10}
     *  vOut: {1,2,3,4,5,6,7,8,9,10,NULL}
     *
     *  v[i] = v[i+1]
     */
    private void lshift(){
        for (int i=0 ; i <this.data.length - 1; i++) {    //this.data[p] != null (es mejor jugar con el valor de los indices y no con el valor de la poisicion)
          //  System.out.println("i: "+i+ " "+ " data.len"+this.data.length);
            this.data[i] = this.data[i + 1];
        }
    }

    public boolean isEmpty() {
        return this.size()==0;
    }

    public int size() {
        return this.p;
    }
}
