package set;

import java.util.HashSet;
import java.util.Set;

public class InvitedSet {

    private Set<Invited> invitedSet;

    public InvitedSet(){
        this.invitedSet = new HashSet<>();
    }

    public void addInvited(String name, int code){
        invitedSet.add(new Invited(name, code));
    }

    public void removeInvited(int code){
        invitedSet.removeIf(x -> x.getCode() == code);
    }

    public int totalInvited(){
        return invitedSet.size();
    }

    public void showInvitedSet(){
        System.out.println(invitedSet);
    }

    public static void main(String[] args) {

        InvitedSet is = new InvitedSet();

        is.addInvited("Aelmajan", 123);
        is.addInvited("Dante", 456);
        is.addInvited("Torfin", 789);

        is.removeInvited(456);

        System.out.println(is.invitedSet);
        System.out.println(is.totalInvited());
        is.showInvitedSet();
    }
}
