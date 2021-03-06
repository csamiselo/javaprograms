import com.sun.management.VMOption.Origin;

/* A simple program to demostrate how objects are passed by reference.
When a primitive type is passed to a method ,it is done by call of value 
Ojetc are implicitly passed by use of call by reference.
*/
class Original {
    int a, b;
    Original(int i, int j) {
    a = i;
    b = j;
    }
    // pass an object
    void method1(Original o) {
    o.a *= 2;
    o.b /= 2;
} //thus file has been edited 
}
class PassByReference {
public static void main(String args[]) {
Original ob = new Original(15, 20);
System.out.println("ob.a and ob.b before call: " +
ob.a + " " + ob.b);
ob.method1(ob);
System.out.println("ob.a and ob.b after call: " +
ob.a + " " + ob.b);
}
}