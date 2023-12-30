//Mendefinisikan paket Graph dan mengimpor kelas-kelas yang diperlukan dari paket java.util.
package Graph;

import java.util.*;

//Mendefinisikan kelas UndirectedGraph yang merepresentasikan graf tak berarah. Menggunakan Map untuk menyimpan daftar ketetanggaan dari setiap node dengan tipe Character.
class UndirectedGraph {
    private Map<Character, List<Character>> adjacencyList;

    public UndirectedGraph() {
        adjacencyList = new HashMap<>();
    }

    //Metode addNode menambahkan node baru ke graf dengan daftar ketetanggaan kosong.
    public void addNode(Character node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    //Metode addEdge menambahkan edge (sisi) antara dua node ke graf tak berarah dengan cara menambahkan keterhubungan dari kedua node ke daftar ketetanggaan masing-masing.
    public void addEdge(Character source, Character destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    //Metode getNeighbors mengembalikan daftar node tetangga dari node yang diberikan.
    public List<Character> getNeighbors(Character node) {
        return adjacencyList.getOrDefault(node, Collections.emptyList());
    }

    //Metode printGraph mencetak graf dengan menampilkan node-node dan tetangganya, memberikan gambaran visual hubungan antar node.
    public void printGraph() {
        for (Character node : adjacencyList.keySet()) {
            System.out.print("Node " + node + " terhubung dengan: ");
            for (Character neighbor : adjacencyList.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    //Metode main adalah titik masuk program yang membuat objek graph, menambahkan beberapa node dan edge ke graf, serta mencetak graf untuk menunjukkan hubungan antar node yang telah ditambahkan.
    public static void main(String[] args) {
        UndirectedGraph graph = new UndirectedGraph();

        // Menambahkan node-node ke graf
        graph.addNode('X');
        graph.addNode('Y');
        graph.addNode('Z');
        graph.addNode('W');

        // Menambahkan edge-edge ke graf
        graph.addEdge('X', 'Y');
        graph.addEdge('X', 'Z');
        graph.addEdge('Y', 'Z');
        graph.addEdge('Z', 'W');

        // Mencetak graf untuk menunjukkan hubungan antar node
        graph.printGraph();
    }
}
