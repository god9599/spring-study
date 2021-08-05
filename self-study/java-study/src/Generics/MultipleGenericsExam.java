package Generics;

class Soccer {
    public String team;
    Soccer(String team) {
        this.team = team;
    }
}
class Player<T, S> {
    public T team;
    public S name;
    Player(T team, S name) {
        this.team = team;
        this.name = name;
    }
}

public class MultipleGenericsExam {
    public static void main(String[] args) {
        Player<Soccer, String> player = new Player<Soccer, String>(new Soccer("FC seoul"), "JYPark");
    }
}
