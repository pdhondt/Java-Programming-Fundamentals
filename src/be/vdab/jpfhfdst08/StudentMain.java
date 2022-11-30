package be.vdab.jpfhfdst08;

public class StudentMain {
    public static void main(String[] args) {

        var student1 = new Student("Peter");
        var student2 = new Student("Tiago", 95);

        System.out.println("De eerste student heet " + student1.getNaam() +
                " en behaalde een score van " + student1.getScore());
        System.out.println("De tweede student heet " + student2.getNaam() +
                " en behaalde een score van " + student2.getScore());

        student1.setNaam("Lena");
        student1.setScore(100);
        student2.setScore(99);

        System.out.println("");
        System.out.println("De eerste student heet " + student1.getNaam() +
                " en behaalde een score van " + student1.getScore());
        System.out.println("De tweede student heet " + student2.getNaam() +
                " en behaalde een score van " + student2.getScore());

    }
}
