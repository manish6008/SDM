class SinglyList{
    Static class Node {
        private int data;
        private Node next;

        public Node(){
            data=0;
            next=null;
        }
        public Node(int val){
            data=val;
            next=null;
        }
        private Node head;
        public SinglyList(){
            head=null;
        }
        void addFirst(int val){
            Node newNode = new Node(val);
            newNode.next=head;
            head=newNode;
        }
        public class SinglyListMain{
            public static void main(String[] args){
                SinglyList list = new SinglyList();
                list.addFirst(10);
                list.addFirst(20);
                list.addFirst(30);
                list.addFirst(40);
            }
        }
    }
}