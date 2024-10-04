import java.util.List;

public class App {
    public static void main(String[] args) {

        // Test exercice 1
        StorageGenerique<String> listeEtudiant = new StorageGenerique<>();

        listeEtudiant.addElement("Moroko");
        listeEtudiant.addElement("KOFFI");
        listeEtudiant.addElement("ALI");

        System.out.println(listeEtudiant.getElement(1));

        System.out.println(listeEtudiant.size());

        StorageGenerique<Integer> noteEtudiant = new StorageGenerique<>();
        noteEtudiant.addElement(10);
        noteEtudiant.addElement(12);
        noteEtudiant.addElement(17);
        System.out.println(noteEtudiant.getElement(1));

        System.out.println(noteEtudiant.size());

        //Exercice 2
    }
}