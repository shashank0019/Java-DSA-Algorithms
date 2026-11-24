
package strings;

public class StringBufferAndBuilder {

    // 1. append() - Adds content at the end
    public static void demoAppend() {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb);
    }

    // 2. insert() - Inserts content at a specified index
    public static void demoInsert() {
        StringBuilder sb = new StringBuilder("jva");
        sb.insert(1, "a");
        System.out.println(sb);
    }

    // 3. delete() - Deletes characters (start included, end excluded)
    public static void demoDelete() {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.delete(4, 14);
        System.out.println(sb);
    }

    // 4. replace() - Replaces characters between two indexes
    public static void demoReplace() {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.replace(0, 4, "Python");
        System.out.println(sb);
    }

    // 5. reverse() - Reverses the entire character sequence
    public static void demoReverse() {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.reverse();
        System.out.println(sb);
    }

    // 6. capacity() - Returns allocated storage capacity
    // Initial capacity = 16 + string length
    public static void demoCapacity() {
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }

    // 7. ensureCapacity() - Ensures minimum required capacity
    // Does not change string content; return type is void
    public static void demoEnsureCapacity() {
        StringBuilder sb = new StringBuilder("Java");

        sb.ensureCapacity(50);

        System.out.println(sb.capacity());
    }

    // 8. setCharAt() - Changes a character at a given index
    public static void demoSetCharAt() {
        StringBuilder sb = new StringBuilder("Java");
        sb.setCharAt(0, 'K');
        System.out.println(sb);
    }

    // 9. setLength() - Changes the current length
    // Smaller length removes characters; larger length adds null characters
    public static void demoSetLength() {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.setLength(4);
        System.out.println(sb);
    }

    // 10. substring() - Extracts a portion; end index is excluded
    // Returns String; original StringBuilder remains unchanged
    public static void demoSubstring() {
        StringBuilder sb = new StringBuilder("Java Programming");

        String result = sb.substring(0, 4);

        System.out.println(result);
        System.out.println(sb);
    }

    // 11. toString() - Converts StringBuilder into String
    public static void demoToString() {
        StringBuilder sb = new StringBuilder("Java");

        String str = sb.toString();

        System.out.println(str);
    }


    // =========================================
    // STRINGBUFFER
    // =========================================

    // StringBuffer - Mutable and synchronized (thread-safe methods)
    // Similar methods to StringBuilder:
    // append(), insert(), delete(), replace(), reverse()
    // capacity(), ensureCapacity(), setCharAt(), setLength()

    // 12. append() - Adds content at the end
    public static void bufferAppend() {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);
    }

    // 13. insert() - Inserts content at a specified index
    public static void bufferInsert() {
        StringBuffer sb = new StringBuffer("jva");
        sb.insert(1, "a");
        System.out.println(sb);
    }

    // 14. delete() - Deletes characters between indexes
    public static void bufferDelete() {
        StringBuffer sb = new StringBuffer("Java Programming");
        sb.delete(4, 14);
        System.out.println(sb);
    }

    // 15. replace() - Replaces characters between indexes
    public static void bufferReplace() {
        StringBuffer sb = new StringBuffer("Java Programming");
        sb.replace(0, 4, "Python");
        System.out.println(sb);
    }

    // 16. reverse() - Reverses the character sequence
    public static void bufferReverse() {
        StringBuffer sb = new StringBuffer("Java Programming");
        sb.reverse();
        System.out.println(sb);
    }

    // 17. capacity() - Returns allocated storage capacity
    public static void bufferCapacity() {
        StringBuffer sb = new StringBuffer("Java");
        System.out.println(sb.capacity());
    }

    // 18. ensureCapacity() - Ensures minimum required capacity
    public static void bufferEnsureCapacity() {
        StringBuffer sb = new StringBuffer("Java");
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }

    // 19. setCharAt() - Changes a character at a given index
    public static void bufferSetCharAt() {
        StringBuffer sb = new StringBuffer("Java");
        sb.setCharAt(0, 'K');
        System.out.println(sb);
    }

    // 20. setLength() - Changes the current length
    public static void bufferSetLength() {
        StringBuffer sb = new StringBuffer("Java Programming");
        sb.setLength(4);
        System.out.println(sb);
    }

    // 21. substring() - Extracts a portion and returns String
    public static void bufferSubstring() {
        StringBuffer sb = new StringBuffer("Java Programming");
        String result = sb.substring(0, 4);
        System.out.println(result);
        System.out.println(sb);
    }

    // 22. toString() - Converts StringBuffer into String
    public static void bufferToString() {
        StringBuffer sb = new StringBuffer("Java");
        String str = sb.toString();
        System.out.println(str);
    }


    public static void main(String[] args) {

        demoAppend();
        demoInsert();
        demoDelete();
        demoReplace();
        demoReverse();
        demoCapacity();
        demoEnsureCapacity();
        demoSetCharAt();
        demoSetLength();
        demoSubstring();
        demoToString();

        bufferAppend();
        bufferInsert();
        bufferDelete();
        bufferReplace();
        bufferReverse();
        bufferCapacity();
        bufferEnsureCapacity();
        bufferSetCharAt();
        bufferSetLength();
        bufferSubstring();
        bufferToString();
    }
}

