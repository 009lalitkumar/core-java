public class Details {
    static void details(String name, String city, String hobby) {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Hobby: " + hobby);
    }

    public static void main(String[] args) {
        String name = "Lalit Kumar";
        String city = "Gurgaon";
        String hobby = "Badminton,Guitar,Listening to Music";

        details(name, city, hobby);
    }
}
