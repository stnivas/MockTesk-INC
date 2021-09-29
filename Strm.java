public class Strm {
    public static void main(String[] args) {
        String name="varun";
        //int a=name.charAt(0)-'A'+65;
        String nam="nivas";

        for (int i = 0; i < nam.length(); i++) {
            System.out.println((char) ((25-(nam.charAt(i)-'a'))+97));

        }
        //System.out.println(a);
        for (int i = 0; i < name.length(); i++) {
            System.out.print((char) ((25-(name.charAt(i)-'a'))+97));
            System.out.println();

        }
    }
}
