class Sports {
    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    static final int NOOFPLAYERS = 11;

    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has " + NOOFPLAYERS + " players in " + getName());
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Sports sports = new Sports();
        Soccer soccer = new Soccer();

        System.out.println(sports.getName());
        sports.getNumberOfTeamMembers();
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
    }
}
