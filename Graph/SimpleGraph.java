package Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SimpleGraph {
    private Map<Integer, List<Integer>> adjacencyList;

    // Konstruktor untuk membuat objek SimpleGraph
    public SimpleGraph() {
        // Inisialisasi struktur data untuk menyimpan hubungan antar node
        adjacencyList = new HashMap<>();
    }

    // Menambahkan node baru ke dalam graf
    public void addNode(Integer node) {
        // Jika node belum ada dalam graf, tambahkan sebagai kunci baru dengan daftar
        // tetangga kosong
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    // Menambahkan edge ke dalam graf
    public void addEdge(int source, int destination) {
        // Tambahkan destination ke daftar tetangga dari source
        adjacencyList.get(source).add(destination);
        // Jika graf tidak terarah, tambahkan baris berikut untuk menambahkan edge
        // sebaliknya
        // adjacencyList.get(destination).add(source);
    }

    // Mendapatkan daftar tetangga dari suatu node
    public List<Integer> getNeighbors(int node) {
        // Mengembalikan daftar tetangga dari node atau daftar kosong jika node tidak
        // ditemukan
        return adjacencyList.getOrDefault(node, Collections.emptyList());
    }

    // Mencetak graf, menampilkan setiap node dan tetangganya
    public void printGraph() {
        for (int node : adjacencyList.keySet()) {
            System.out.print("Node " + node + " terhubung dengan: ");
            for (int neighbor : adjacencyList.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    // Metode utama untuk menguji implementasi SimpleGraph
    public static void main(String[] args) {
        SimpleGraph graph = new SimpleGraph();

        // Menambahkan node-node ke graf
        graph.addNode(10);
        graph.addNode(20);
        graph.addNode(30);
        graph.addNode(40);

        // Menambahkan edge-edge ke graf
        graph.addEdge(10, 20);
        graph.addEdge(10, 30);
        graph.addEdge(20, 30);
        graph.addEdge(30, 10);
        graph.addEdge(30, 40);

        // Mencetak graf untuk menunjukkan hubungan antar node
        graph.printGraph();
    }
}
