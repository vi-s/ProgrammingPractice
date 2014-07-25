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
            if(head == null){
                return null;
            }else{
                Node<T> probe = head;

                while(probe.next != null){
                    if(probe.data.equals(data)){
                        //remove
                        if(probe.next == null){
                            probe = null;
                            break;
                        }else{
                            probe.data = probe.next.data;
                            probe.next = probe.next.next;
                            break;
                        }
                    }else{
                        probe = probe.next;
                    }
                }

                return null;
            }
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

        private class Node<T> {
            T data;
            Node<T> next;

            public Node(T data){
                this.data = data;
            }
        }
    }

    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();

        list.insert("s");
        list.insert("d");
        list.insert("f");

        list.printList();

        list.delete("s");
        list.printList();

    }

}
