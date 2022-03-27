
public class SinglyLinkedList {

    private Node firstNode; //изначально null
  
    //Метод добавляет данные в начало списка.
    public void addToListFirst(String data) {
        Node newNode = new Node();
        newNode.nodeData = data;
        newNode.linkToNext = firstNode;
        firstNode = newNode;
    }
    
    //Метод добавляет данные в начало списка из массива с сохранением порядка.
    public void addToListFromArray(String[] data) {
        for (String s : data) {
            Node newNode = new Node();
            newNode.nodeData = s;
            if (firstNode == null) {
                addToListFirst(s);
            } else if (firstNode.linkToNext == null) {
                firstNode.linkToNext = newNode;
            } else {
                Node current = firstNode;
                while (current.linkToNext != null) {
                    current = current.linkToNext;
                }
                current.linkToNext = newNode;
            }
        }
    }

    //извлечение значения из начала списка без его удаления из списка
    public String extractFirstFromList() {
        if (firstNode != null)
            return firstNode.nodeData;
        else
            throw new NullPointerException("Список пустой.");       
    }

    //Извлечение значения из начала списка с удалением его из списка
    public String extractFirstAndRemoveFromList() {
        if (firstNode != null) {
            String firstNodeData = firstNode.nodeData;
            firstNode = firstNode.linkToNext;
            return firstNodeData;  }
        else
            throw new NullPointerException("Список пустой.");
    }

    //добавление значения в конец списка
    public void addToTailList(String data) {
        Node newNode = new Node();
        newNode.nodeData = data;
        if (firstNode == null) {
            addToListFirst(data);
        } else if (firstNode.linkToNext == null) {
            firstNode.linkToNext = newNode;
        } else {
            Node current = firstNode;
            while (current.linkToNext != null) {
                current = current.linkToNext;
            }
            current.linkToNext = newNode;
        }
    }

    //извлечение значения из конца списка без его удаления
    public String extractTailDataFromList() {
        if (firstNode != null) {
            Node current = firstNode;
            while (current.linkToNext != null) {
                   current = current.linkToNext; }
            return current.nodeData; }        
        else
            throw new NullPointerException("Список пустой.");   
    }

    //извлечение значения из конца списка с удалением
    public String extractTailAndRemoveFromList() {

        if (firstNode != null && firstNode.linkToNext == null) {
            String data = firstNode.nodeData;
            firstNode = null;
            return data; }

        else if (firstNode != null && firstNode.linkToNext != null) {
            Node current = firstNode;
            Node temp = firstNode;
            while (current.linkToNext != null) {
                  temp = current;
                  current = current.linkToNext;
                }
            String data = current.nodeData;
            current = temp;
            current.linkToNext = null;
            return data;    
        }
        else 
            throw new NullPointerException("Список пустой.");
    }
    
    //Метод, определяющий, содержит ли список заданное значение, или нет

    public boolean isInList(String toEquals) {
        
        Node current = firstNode;
        Boolean result = false;
        
        if (current == null) 
            return false;
        else if (current.linkToNext == null) {
            return toEquals.equals(current.nodeData);
        } 
        else 
        {
            while (current.linkToNext != null) {
                if (toEquals.equals(current.nodeData)) {
                    result = true;
                    current = current.linkToNext;
                } 
                else 
                    current = current.linkToNext;                
            }
            if (toEquals.equals(current.nodeData)) 
                result = true;            
        return result;
        }
    }
    
       //Метод, определяющий, является ли список пустым, или нет;
    
    public boolean isEmptyList() {
        return firstNode == null;
    }

    //печать всех значений списка
    public void printAllList() {
        Node current = firstNode;
        if (current == null) {
            System.out.println("Элементы списка отсутствуют, список пустой.");
        } else if (current.linkToNext == null) {
            current.printNodeData();
            System.out.println();
        } else {
            while (current.linkToNext != null) {
                current.printNodeData();
                current = current.linkToNext;
                if (current.linkToNext == null) {
                    current.printNodeData();
                }
            }
            System.out.println();
        }
    }

    //Метод удаляющий заданное значение из списка; если значения в списке нет, то ничего происходить не должно.
    public void removeFromListIfHas(String toRemove) {

        if (firstNode != null) {
            if (firstNode.linkToNext != null) {
                if (toRemove.equals(firstNode.nodeData)) {
                    firstNode = firstNode.linkToNext;
                    //return; 
                }
                Node current = firstNode;
                while (current.linkToNext != null) {
                    if (toRemove.equals(current.linkToNext.nodeData)) {
                        current.linkToNext = current.linkToNext.linkToNext;
                        //return; 
                        //Сейчас удаляет все одинаковые искомые элементы, если одинаковых искомых элементов несколько. 
                        //Если нужно удалить единожды первый встретившийся - убрать коммент с return.
                    } 
                    else {
                        current = current.linkToNext;
                    }
                }
            } 
            else {
                if (toRemove.equals(firstNode.nodeData)) {
                    firstNode = null;
                }
            }
        }
    }
    
    //Метод, возвращающий количество элементов списка.
    public int countListElements() {
        Node current = firstNode;
        if (current == null) {
            return 0;
        } else if (current.linkToNext == null) {
            return 1;
        } else {
            int count = 0;
            while (current.linkToNext != null) {
                current = current.linkToNext;
                count++;
                if (current.linkToNext == null) {
                    count++;
                }
            }
            return count;
        }
    }

// вложенный класс Node  в сущностях которого хранятся данные и ссылка на следующий узел.
    class Node {

        public String nodeData;
        public Node linkToNext;

        public void printNodeData() {
            System.out.print(nodeData + "; ");
        }
    }
}
