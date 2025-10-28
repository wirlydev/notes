package equalityStuff;

public class Thanos {
    private String name;

    public void setName(String name){ this.name = name;}
    public String getName(){ return name;}

    public void snap(){
        System.out.println("I... am... inevitable...!!!");
        System.out.println(":::: .... ");
    }

    public boolean equals(Object other) {
        if (this==other) {
            return true;
        }

        if (!(other instanceof Thanos)) {
            return false;
        }

        Thanos t = (Thanos) other;

        return this.getName().equals(t.getName());
    }
}
