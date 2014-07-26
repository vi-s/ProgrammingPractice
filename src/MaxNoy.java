/**
 * Problems from: http://maxnoy.com/interviews.html
 *
 * Created by Vikram on 7/24/2014.
 */
public class MaxNoy {

    private static class LinkedList<T> {
        Node<T> head;
        int size;

        public void insert(T data){
            if(head == null){
                head = new Node<T>(data);
                head.next = null;
            }else{
                Node<T> probe = head;

                while(probe.next!=null){
                    probe=probe.next;
                }

                probe.next = new Node<T>(data);
            }
        }

        public T delete(T data) {
            Node<T> probe = head;

            if(head == null) return null;

            if(head.data.equals(data)){
                head = head.next;
                return data;
            }else{
                while(probe.next != null){
                    if(probe.next.data.equals(data)){
                        probe.next = probe.next.next;
                        return data;
                    }else{
                        probe = probe.next;
                    }
                }
            }

            return null;
        }

        public void printList(){
            Node<T> probe = head;
            String toPrint = "";

            while(probe != null){
                toPrint += probe.data.toString() + " -> ";
                probe = probe.next;
            }

            toPrint += "null";

            System.out.println(toPrint);
        }


    }

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data){
            this.data = data;
        }
    }

    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();

        list.insert("s");
        list.insert("d");
        list.insert("f");

        list.printList();

        list.delete("z");
        list.printList();

    }

}
