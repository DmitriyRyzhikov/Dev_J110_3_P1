
public class Main {

    public static void main(String[] args) {
        
/* Для опытов создано три стринговых списка:
     - linkedList - нормальный список, имеет несколько одинаковых элементов;
     - oneElemeentList - список с единственным элементом;
     - emptyLinkedList - пустой список.   
*/
        SinglyLinkedList linkedList = new SinglyLinkedList();
        String[] stringData = new String[]{"кот", "лошадь", "корова", "кот", "обезьяна", "лебедь", "сова", "кот"};
        for (String data : stringData) {
            linkedList.addToListFirst(data);
        }
        SinglyLinkedList oneElemeentList = new SinglyLinkedList();
        oneElemeentList.addToListFirst("попугай");
        
        SinglyLinkedList emptyLinkedList = new SinglyLinkedList();

        // метод printAllList() выводит содержимое всех трех списков в консоль:
        linkedList.printAllList();
        oneElemeentList.printAllList();
        emptyLinkedList.printAllList();
        System.out.println();
/* Список доступных методов:
        - Метод addToListFirst(String data) добавляет данные в начало списка;
        - Метод extractFirstFromList() извлекает и возвращает значение из начала списка без его удаления из списка;
        - Метод extractFirstAndRemoveFromList() извлекает и возвращает значение из начала списка с удалением его из списка;
        - Метод addToTailList(String data) добавляет данные в конец списка;
        - Метод extractTailDataFromList() извлекает и возвращает значение из конца списка без его удаления;
        - Метод extractTailAndRemoveFromList() извлекает и возвращает значение из конца списка с удалением его из списка;
        - Метод определяющий, isInList(String toEquals) содержит ли список заданное значение, или нет. 
          Возвращает true, если содержит и false, если такого значение в списке нет;
        -
*/        
    }
}
