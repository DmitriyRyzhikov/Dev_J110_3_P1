

public class SinglyLinkedList {
    
    private Node firstNode; //Null

    public Node getFirstNode() {
        return firstNode;
    }
    //метод печатает данные из всего списка
    public void printAllList() {
        if(getFirstNode() == null)
            System.out.println("Список пустой");
        else if(getFirstNode().linkToNext == null)
            System.out.println(getFirstNode().nodeData);
        else  {
        while(getFirstNode().linkToNext != null) {
            System.out.println(getFirstNode().nodeData);
            firstNode = getFirstNode().linkToNext;
            if(getFirstNode().linkToNext == null)
                System.out.println(getFirstNode().nodeData);
            }
        } 
    }
    //Метод определяет пустой список или нет
    public void isEmptyList() {
        if(getFirstNode() == null)
            System.out.println("Список пустой");
        else
            System.out.println("Список содержит данные");       
    }
    //Метод добавляет данные в начало списка.
    public void addToListFirst(String nodeData) {
     Node nodeCurrent = new Node(); //созд.новый узел. Данные = 0, ссылка = Null
    nodeCurrent.nodeData = nodeData; //вносим данные в узел
    nodeCurrent.linkToNext = firstNode; 
//ссылка внутри nodeCurrent указывает на firstNode, делая firstNode вторым в списке
    firstNode = nodeCurrent; 
//теперь firstNode указывает не на Null, а на ставший вторым nodeCurrent 
    }
    ////Метод, возвращающий количество элементов списка.
    public int countListElements() {
        if(getFirstNode() == null)
              return 0;
        else if(getFirstNode().linkToNext == null) 
              return 1;
        else {
              int count = 10;
        while(getFirstNode().linkToNext != null) {
              count = count + 1;
              firstNode = getFirstNode().linkToNext;
            if(getFirstNode().linkToNext == null)
               count++;
            }
        return count;
        }
    }
         

// вложенный класс Node  в котором хранятся данные и ссылка на следующий узел.
class Node {
        
     public String nodeData; //данные, хранящиеся в узле
     public Node linkToNext; //ссылка на следующий узел
    
     //метод для вывода данных, хранящихся в узле в консоль
    public void printNodeData() {
        System.out.println(nodeData + " -> ");
    }
  }      
}
