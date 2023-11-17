public class AccessSpecifierCheck {
    public static void main(String[] args) {
        
        SamePackage one = new SamePackage();
//      one.privateMethod();    -- is not showing. REASON: private
        one.publicMethod();
        one.defaultMethod();
        one.proctectedMethod();

//        -----------------------------------------------------------------------------------------
        AnotherPackage two = new AnotherPackage();
        two.publicMethod();
//      two.privateMethod();    -- is not showing. REASON: private cannot be accessed from another class as well as another package
//      two.defaultMethod();    -- is not showing. REASON: default cannot be accessed from another package
//      two.proctectedMethod();    -- is not showing. REASON: procteced cannot be accessed from another package
    }
}

 class SamePackage{
    public void publicMethod(){
        System.out.println("This is public method.");
    }


    private void privateMethod(){
        System.out.println("This is private method");
    }

    protected void proctectedMethod() {
        System.out.println("This is protected method");
    }

    void defaultMethod() {
        System.out.println("This is private method");
    }

 }
