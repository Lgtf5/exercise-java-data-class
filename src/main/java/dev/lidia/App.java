package dev.lidia;

public final class App {
    private App() {

    }
    public static void main(String[] args) {
        EntityData Ana = new EntityData("Ana", " García", 15863427, 1978);
        System.out.println("She is " + Ana.getName() + Ana.getLastName() +  " and she born on " + Ana.getBirthYear() + " and her identity document is " + Ana.getNumberDocId() + ".");
    }

}
