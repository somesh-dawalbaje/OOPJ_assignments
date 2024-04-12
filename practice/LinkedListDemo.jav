//linked list implementation using inner class

class LinkedListDemo{

    private static class node{
        private int data;
        private node node_next;

        public node(int data){
            this.data=data;
            node_next=null;
        }
    }

    private node head;

    public LinkedListDemo(){
        this.head=null;
    }

    public void addFirst(int data){
        node new_node=new node(data);
        new_node.node_next=head;
        head = new_node;
    }

    public void print(){
        node current_node=head;
        while(current_node!=null){
            System.out.print(current_node.data+" ");
            current_node=current_node.node_next;
        }
        System.out.println();
    }
}

class Demo{
    public static void main(String[] args) {
        LinkedListDemo lld=new LinkedListDemo();
        lld.addFirst(12);
        lld.print();
    }
}