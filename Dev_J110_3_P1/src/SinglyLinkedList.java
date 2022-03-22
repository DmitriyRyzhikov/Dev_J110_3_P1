
public class SinglyLinkedList {

    private Node firstNode; //Null

    public Node getFirstNode() {
        return firstNode;
    }

    //метод печатает данные из всего списка
    public void printAllList() {
        Node current = firstNode;
        if (current == null) {
            System.out.println("Список пустой");
        } else if (current.linkToNext == null) {
            current.printNodeData();
        } else {
            while (current.linkToNext != null) {
                current.printNodeData();
                current = current.linkToNext;
                if (current.linkToNext == null) {
                    current.printNodeData();
                }
            }
        }
    }

    //Метод определяет пустой список или нет
    public void isEmptyList() {
        if (getFirstNode() == null) {
            System.out.println("Список пустой");
        } else {
            System.out.println("Список содержит данные");
        }
    }

    //Метод добавляет данные в начало списка.
    public void addToListFirst(String nodeData) {
        Node current = new Node();
        current.nodeData = nodeData;
        current.linkToNext = firstNode;
        firstNode = current; 
    }

    //Метод добавляет данные в конец списка.
    public void addToEndList(String nodeData) {
        Node newNode = new Node(); 
        newNode.nodeData = nodeData; 
        Node current = firstNode;
        while (current.linkToNext != null) {
            current = current.linkToNext;
        }
        current.linkToNext = newNode;

    }

    ////Метод, возвращающий количество элементов списка.
    public int countListElements() {
        Node current = firstNode;
        if (current == null) {
            return 0;
        } else if (current.linkToNext == null) {
            return 1;
        } else {
            int count = 0;
            while (current != null && current.linkToNext != null) {
                current = current.linkToNext;
                count++;
                if (current != null && current.linkToNext == null) {
                    count++;
                }
            }
            return count;
        }
    }

    class Node {

        public String nodeData;
        public Node linkToNext;

        public void printNodeData() {
            System.out.println(nodeData);
        }
    }
}
