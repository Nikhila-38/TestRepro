package ex_003_Literals;

public class Lab021_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A'; //  A to Z, a-z, !@#$%^&*()_+
        char c2 = 'B';
        char c3 = '$';
        char c4 = '*';
        char c5 = '%';
        char c6 = '8';

        // Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("NikhilaLavanya");// here it is displayed same
        System.out.println("Nikhila"+new_line+"Lavanya"); // first nikhila will be shown, then is next line lavanya
        System.out.println("Nikhila"+tab_line+"Lavanya"); // space is shown btwn nikhila and lavanya
        System.out.println("Nikhila"+back_space+"Lavanya"); // for nikhila, a will not displayed
        System.out.println("Nikhila is old"+carriage_return+"Lavanya"); // Nikhila is old is removed and only lavanya is shown

        System.out.println("Hi, This is the first line"+new_line+"This is second line\n This is Third line");


        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char c11  = '\u1F60'; // any language char can be converted by using unicode
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

    }
}
