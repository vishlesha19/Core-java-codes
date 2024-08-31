import java.lang.StringBuffer;

public class stringbufferexample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("vish");
        // mutable string
        System.out.println(sb.capacity()); // capcity
        System.out.println(sb.length()); // length

        // appending
        sb.append(" walunj");
        System.out.println(sb);

        // assign stringbuffer data to string
        String str = sb.toString();
        System.out.println(str);

        // delete character at index
        sb.deleteCharAt(4);
        System.out.println(sb); // removed space

        // inser value
        sb.insert(0, "ritesh");
        System.out.println(sb);

        // substring
        sb.substring(3);
        System.out.println(sb);

        // specific length - all other values will be null
        sb.setLength(30); // 30 size empty space will be null
        System.out.println(sb);

        // diff bet Stringbuffer and Stringbuilder is that
        // stringbuffer is threadsafe and stringbuilder is not

    }
}
