class Parent {
    String firstname;
    String lastname;

    Parent() {
        this.lastname = "Das";
    }

    Parent(String firstname) {
        this();
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return String.format("Firstname: %s %nLastname: %s", this.firstname, this.lastname);
    }
}

class Child extends Parent {
    Child() {
        super();
    }

    Child(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        System.out.println("CHILD OBJECT::");
        return super.toString();
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Parent parent = new Parent("Akash");
        System.out.println(parent);
        Child child = new Child("Pranab");
        System.out.println(child);
    }
}
