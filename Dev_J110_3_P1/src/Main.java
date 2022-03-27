
public class Main {

    public static void main(String[] args) {
        
/* Для опытов создано три стринговых списка:
     - linkedList - нормальный список, имеет несколько одинаковых элементов;
     - oneElemeentList - список с единственным элементом;
     - emptyLinkedList - пустой список.   
*/
        String[] stringData = new String[]{"кот", "лошадь", "корова", "кот", "обезьяна", "лебедь", "сова", "кот"}; 
        
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addToListFromArray(stringData); 
        
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
        - Метод addToListFromArray(String[] data) добавляет данные в начало списка из массива с сохранением порядка.
        - Метод extractFirstFromList() извлекает и возвращает значение из начала списка без его удаления из списка;
        - Метод extractFirstAndRemoveFromList() извлекает и возвращает значение из начала списка с удалением его из списка;
        - Метод addToTailList(String data) добавляет данные в конец списка;
        - Метод extractTailDataFromList() извлекает и возвращает значение из конца списка без его удаления;
        - Метод extractTailAndRemoveFromList() извлекает и возвращает значение из конца списка с удалением его из списка;
        - Метод isInList(String toEquals) определяет, содержит ли список переданное в метод значение toEquals, или нет. 
          Возвращает true, если содержит и false, если такого значение в списке нет;
        - Метод isEmptyList(), определяющий, является ли список пустым, или нет. 
          Возвращает true, если список пустой и false, если не пустой;
        - Метод printAllList() - осуществляет печать всех значений списка. 
          Если список пустой, выводит сообщение "Элементы списка отсутствуют, список пустой.";
        - *Метод removeFromListIfHas(String toRemove) удаляет переданное в метод значение toRemove из списка. 
          Если значения в списке нет, то ничего происходить не должно; 
        - Метод countListElements(), возвращающий количество элементов списка.
*/        
    }
}
