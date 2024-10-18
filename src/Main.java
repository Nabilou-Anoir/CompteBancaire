//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CompteBancaire c1 = new CompteBancaire(800, 1000, "j.dupont", 1000);
        CompteBancaire c2 = new CompteBancaire(5000, 6000, "C.Durant", 5000);
        System.out.println(c1);
        System.out.println(c2);
        c1.effectuerRetrait(300);
        c2.effectuerRetrait(600);
        System.out.println(c1);
        System.out.println(c2);
        c1.debiter(500);
        System.out.println(c1);
        System.out.println(c2);
        c2.effectuerVirement(c1,1000);
        System.out.println(c1);
        System.out.println(c2);
    }
}