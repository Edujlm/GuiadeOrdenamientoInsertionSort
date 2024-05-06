
public class App {
    public static void insertionSort(int[] Estantes, String[] pastillas ) {

        int m = Estantes.length;
        for (int z = 1; z < m; z++) {
            int key = Estantes[z];
            String pastilla = pastillas[z];
            int w = z - 1;
            while (w >= 0 && Estantes[w] > key) {
                Estantes[w + 1] = Estantes[w];
                pastillas[w + 1] = pastillas[w];
                w--;
            }
            Estantes[w + 1] = key;
            pastillas[w+ 1] = pastilla;
        }
    }
    public static void main(String[] args) throws Exception{
        int[] Estante = {9, 4, 2, 5, 8, 3, 7};
        String[] pastilla = {"Centrium", "Ventlin", "Enantyum", "Diclofenac", "Sintrom", "Nolotil", "paracetamol"};
        System.out.println("Estante de pastillas desordenados:");
        for (int x = 0; x < pastilla.length; x++) {
            System.out.println(pastilla[x] + " estante: " + Estante[x]);
        }
       insertionSort(Estante, pastilla);

        System.out.println("\nEstantes de pastillas ordenados:");
        for (int y = 0; y < pastilla.length; y++) {
            System.out.println(pastilla[y] + " estante: " + Estante[y]);
       }     
     }
}
