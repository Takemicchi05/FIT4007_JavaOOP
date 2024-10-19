public class PrintArray<T> {
    public void printArray(T[] array){
        for(T element : array){
            System.out.println(element);
        }
        System.out.println();
    }
}
