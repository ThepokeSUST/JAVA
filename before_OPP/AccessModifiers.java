package before_OPP;

public class AccessModifiers {
    /*
     * In Java, Access modifiers helps to restrict the scope of a class,
     * constructor, variable, method, or data member. It provides security,
     * accessibility, etc. to the user depending upon the access modifier used with
     * the element. In this article, let us learn about Java Access Modifiers, their
     * types, and the uses of access modifiers.
     */
    /*
     * Types of Access Modifiers
     * There are 4 types of access modifiers available in Java:
     * 
     * Default – No keyword required
     * Private
     * Protected
     * Public
     * 
     */
    /*
     * 1. Default Access Modifier
     * When no access modifier is specified for a class, method, or data member, it
     * is said to be having the default access modifier by default. The default
     * access modifiers are accessible only within the same package.
     */
    /*
     * 2. Private Access Modifier
     * The private access modifier is specified using the keyword private. The
     * methods or data members declared as private are accessible only within the
     * class in which they are declared.
     * 
     * Any other class of the same package will not be able to access these members.
     * Top-level classes or interfaces can not be declared as private because,
     * private means “only visible within the enclosing class“.
     * protected means “only visible within the enclosing class and any subclasses“.
     */

    /*
     * 3. Protected Access Modifier
     * The protected access modifier is specified using the keyword protected. The
     * methods or data members declared as protected are accessible within the same
     * package or subclasses in different packages.
     */

    /*
     * 4. Public Access Modifier
     * The public access modifier is specified using the keyword public.
     * 
     * The public access modifier has the widest scope among all other access
     * modifiers.
     * Classes, methods, or data members that are declared as public are accessible
     * from everywhere in the program. There is no restriction on the scope of
     * public data members.
     */
}
