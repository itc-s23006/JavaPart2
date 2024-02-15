package interface1;

public abstract class Player {
    /* public abstract void fight(); */
    Attack at ;

    public void setAt (Attack attack) {
        this.at = attack;
    }

    public void fight() {
        at.action();
    }
}
