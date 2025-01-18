public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer message = new StringBuffer("Hello");
        System.out.println(message);
        message.append(" priya");
        System.out.println(message);
        message.insert(6," Beautiful ");
        System.out.println(message);
        message.replace(5,15,"Amazing");
        System.out.println(message);
        message.delete(5, 13);
        System.out.println(message);
        message.reverse();
        
        System.out.println(message);
    }
}
