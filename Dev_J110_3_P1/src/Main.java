

public class Main {
    
    public static void main(String[] args) {
        
        SinglyLinkedList linkedList = new SinglyLinkedList();
        String[] stringData = new String[] {"собака", "кошка", "обезьяна", "лось" , "корова"};
        for(String data : stringData)
            linkedList.addToListFirst(data);
        
        SinglyLinkedList emptyLinkedList = new SinglyLinkedList();
        
        SinglyLinkedList oneElemeentList = new SinglyLinkedList();
        oneElemeentList.addToListFirst("попугай");
            
        linkedList.printAllList();
        emptyLinkedList.printAllList();
        oneElemeentList.printAllList();
        
        System.out.println();
        
        linkedList.isEmptyList();
        emptyLinkedList.isEmptyList();
        oneElemeentList.isEmptyList(); 
        
        System.out.println();
        
        linkedList.addToEndList("рысь");
        linkedList.printAllList();
        System.out.println();
        System.out.println(emptyLinkedList.countListElements());
        System.out.println(linkedList.countListElements());      
        System.out.println(oneElemeentList.countListElements());
        System.out.println();
        System.out.println(linkedList.extractFirstData());
        System.out.println();
        System.out.println(linkedList.extractAndRemoveFirstData());
        System.out.println();
        linkedList.printAllList();
        System.out.println();
        System.out.println(linkedList.extractEndData());
        System.out.println();
        linkedList.printAllList();
        
    
    }
}

