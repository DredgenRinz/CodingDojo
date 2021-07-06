public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    //Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    

    public void remove(){
        Node currNode = head;
        Node prev = null;
    
        while (currNode != null) {
            if(currNode.next == null){
                prev.next = null;
                currNode = currNode.next;
            } else{
                prev = currNode;
                currNode = currNode.next;
            }
        }
    }

    public void printValues(){
        Node currNode = head;
    
        System.out.print("LinkedList: ");
    
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.value + " ");
    
            // Go to next node
            currNode = currNode.next;
        }
        System.out.println("\n");
    }

    public String find(int v){
        Node currNode = head;
        int pos = 0;

        while (currNode != null) {
            if(currNode.value == v){
                return "Valor encontrado en el nodo "+ pos;
            } else{
                currNode = currNode.next;
                pos++;
            }
        }
        return "El valor no se ha encontrado";
    }
    public void removeAt(int pos){
        Node currNode = head;
        Node prev = null;
    
        while (currNode != null && pos > -1) {
            if(pos == 0){
                prev.next = currNode.next;
                currNode = currNode.next;
            } else{
                prev = currNode;
                currNode = currNode.next;
            }
            pos--;
        }
    }
    
}