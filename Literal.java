public class Literal {

    public static void main(String[] arg) {

        // literal
        // literal is constant value,which can be assigned to the variable.
        // it is the synthectic representation of boolean,numeric,character,string data;

        // Integral literal
        // for integral data types there are 4 ways in which integral literals are
        // specifys.
        // Decimal (0-9)
        int a = 453;
        // binary (0,1) (should be prefix with 0b or 0B)
        a = 0b01;
        // Octal (0-7) (should be prefix with 0);
        a = 017;
        // Hexadecimal (0-9 and a-f) (should be prefix with 0x or 0X).
        a = 0x982f;
        // BY default all integral literal is of int type.We can specify Explicitly as
        // long type be sufixed with l or L . there is no way to specify byte and
        // short.Whenever we signed integral literal to the byte or short variable and
        // if the value is within the range of destination type then it compiler
        // automatically treats it as destination type
        // we can specify long type be sufixed with l or L

        // FLoating point literal
        // for floating point literals we can't specify in octal and hexadecimal forms.

        // decimal form
        double d = 778.90;

        // By default all floating points literal is of double type. hence we cant
        // assign directly to the float variable.But we can specify explicitly floating
        // points literal as float type by sufixed with f or F.We can specify double
        // also by sufixed with d or D But this is not required as all floating points
        // literals are be default double.
        float f = 9.9f;
        f = 0b1;
        // int a=9;
        f = a;
        d = a;
        f = 012;// this is first convert into int then autoconversion hold
        d = 0x762;// this is first convert into int then autoconversion hold
        // d=0b101.1//error
        // d=0x123.23;//error
        // d = 02332.2;//works but this hold 2332.2
        // Thats why There is no Binary (0b/0B), Octal (0) representation in floating
        // point literals
        // But
        /*
         * Hexadecimal floating-point literals are supported, but must be in a form
         * similar to scientific notation,
         * but with a P or p 0x12.2P2 represents 72.5 (0x12.2 = 18.125 and P2 = 2^2 = 4,
         * then 18.125*4=72.5)
         * ● The value following the P, called the binary exponent, indicates the
         * power-of-two by which the
         * number is multiplied.
         */
        System.out.println(f);
        System.out.println(d);
        // Char literals in 4 ways.

        // single quote:
        char ch = 'A';
        // char literal as integral literal
        // we can specify char literal as integral literal,which represents the unicode
        // value of the character ...and the integral literal can be specified either in
        // decimal,octal or hexadecimal forms.But the allowed range is [0,65535]
        ch = 65535;
        // ch = 65536;// error incompatible types: possible lossy conversion from int to
        // char

        // Unicode Representation
        // we can specify char literals in unicode representation '\\uxxxx' here xxxx
        // represents 4 hexa number
        ch = '\uffff';// prints 65535.
        System.out.println((int) ch);
        /*
         * For octal notation, use the backslash followed by the
         * three-digit number. For example, '\141' is the letter 'a'.
         */
        ch = '\141';
        System.out.println(ch);
        // Escape sequence Every escape character can be specified as char literals.
        ch = '\n';
        System.out.println(10);
        System.out.println('\n' + ch + "ok");

        // String literals
        // Any sequence of characters within the double quotes is treated as string
        // literals.
        // boolean literal only two values are allowed i.e , true and flase.

        // we can separate digits with underscore(cannot come at the begining or the end
        // of a literal,permissible for more than one).
        int ii = 99_93;
        float ff = 0b011;
        double dd = 0xffffp010;// why
        System.out.println(010);
        System.out.println(dd);
        if (dd == 16776960.0) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
        double ddd = 16776960.0;
        System.out.println(ddd);

        if (ddd == 16776960.0) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }

        float fff = 00000_1232.32f;
        System.out.println(fff);

    }
}
