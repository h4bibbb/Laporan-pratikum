package Graph; //Menunjukkan kelas-kelas dalam paket "Graph".

import java.util.*; //Memasukkan kelas-kelas dari paket java.util yang diperlukan.

//Mendefinisikan sisi pada graf dengan atribut destination untuk menunjukkan simpul tujuan dan weight untuk bobot sisi tersebut.
class Edge {
    String destination;
    int weight;

    public Edge(String destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }
}

//Kelas BfsGraphTraversal: Kelas utama yang merepresentasikan struktur graf menggunakan adjacencyList, di mana simpul direpresentasikan sebagai kunci (String) dan daftar sisi yang terhubung sebagai nilai (List<Edge>).
public class BfsGraphTraversal {
    private Map<String, List<Edge>> adjacencyList;

    public BfsGraphTraversal() {
        adjacencyList = new HashMap<>();
    }

    //Fungsi addEdge adalah cara kita menambahkan koneksi baru antara dua simpul ke dalam graf.
    public void addEdge(String source, String destination, int weight) {
        adjacencyList.putIfAbsent(source, new ArrayList<>());
        adjacencyList.get(source).add(new Edge(destination, weight));
    }

    //Fungsi getNeighbors memberikan daftar simpul yang terhubung ke simpul tertentu dalam graf.
    public List<Edge> getNeighbors(String node) {
        return adjacencyList.getOrDefault(node, Collections.emptyList());
    }

    //Fungsi bfsTraversal adalah algoritma penelusuran graf yang dimulai dari simpul tertentu. Ia mengunjungi setiap simpul terhubung satu per satu dalam urutan spesifik.
    public void bfsTraversal(String start) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.print(current + " ");

            for (Edge edge : adjacencyList.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(edge.destination)) {
                    queue.add(edge.destination);
                    visited.add(edge.destination);
                }
            }
        }
        System.out.println();
    }

    //Fungsi main adalah tempat program dimulai. Di sini, kita membuat graf, menambahkan beberapa hubungan di antara simpulnya, dan menjalankan algoritma penelusuran dimulai dari simpul "A".
    public static void main(String[] args) {
        BfsGraphTraversal graph = new BfsGraphTraversal();

        graph.addEdge("A", "B", 2);
        graph.addEdge("A", "C", 3);
        graph.addEdge("B", "C", 1);
        graph.addEdge("C", "D", 4);

        graph.bfsTraversal("A");
    }
}
