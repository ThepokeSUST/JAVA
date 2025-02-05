
public class Identifier {

    public static void main(String[] arg) {

        // identifier
        // it is the name given to the variable,class ,interfaces,method etc.These are
        // the unique names.
        // Every java variable must be identified via unique name.

        // there are certain rules fir defining a valied identifier.
        // The only allowed characters are all alphanumeric characters,dollar
        // sign,underscore.
        // identifiers should not start with digits.
        // reserved words cannot be used as an identifiers.
        // identifiers are case sensitive.
        // there is no limit on the length of the identifier.But it is advisable to use
        // an optimum length of 4-15 letters only.

        // reserved words
        // Any programming language reserve some words to represents funtionalities that
        // is defined by that language.These words are called reserved words.
        // They can be briefly categorized into two parts:Keywords and literals.

        // keywords
        // These are the reserved words that is used for internal process or
        // functionalities that is defined by the language.
        // the key word const and goto are reserved ,even though they are not currently
        // used.
        // beginning with jdk 9 , The underscore cannot be used by itself as an
        // identifier.
        int a;
        // int _;// declaration and initialization in one line is allowed.
        int _ = 6;
        // _=9;
        // int a= _ ;
        // int const=9;
        // int goto=0;//invalid variable declaration
        System.out.println();
    }
}
