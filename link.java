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
          void addFirst (int val){
            Node newNode = new Node(val);
            if (head==null){
                head=newNode;
            }
            else{
                Node trav = head;
                while(trav.next!=null)
                trav=trav.next;
                trav.next=newNode;
            }
          }


        public class SinglyListMain{
            public static void main(String[] args){
                int choice;
                int val;
                SinglyList list = new SinglyList();
                list.addFirst(10);
                list.addFirst(20);
                list.addFirst(30);
                list.addFirst(40);

                Scanner sc= new Scanner(System.in);
                do{
                    system.out.println("press 1 for add first Node \n press 2 for add element at Last Node \n press 3 for exit");

                choice= sc.nextInt();
                switch(choice){
                    case:1
                    System.out.print("Enter new element");
                    val= sc.nextInt();
                    list.addFirst(val);
                    break;

                    case:2
                    System.out.print("Enter new element");
                    val= sc.nextInt();
                    list.addFirst(val);
                    break;

                }
                }
                while(choice!=3);
            }
        }
    }
}