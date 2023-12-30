// Menyatakan bahwa kelas ini berada dalam paket (package) Sorting.
package Sorting;

// Mengimpor kelas Arrays dari pustaka java.util untuk menggunakan metode toString() dalam menampilkan array.
import java.util.Arrays;

// Mengimpor kelas Scanner dari pustaka java.util untuk menerima input dari pengguna.
import java.util.Scanner;

//  Mendefinisikan kelas BubbleSort.
class BubbleSort {

    // Mendefinisikan sebuah metode bernama bubbleSort yang menerima array integer arr sebagai parameter untuk melakukan pengurutan menggunakan algoritma Bubble Sort.
    public static void bubbleSort(int[] arr) {  
        // Menyimpan panjang array dalam variabel n.
        int n = arr.length;
        // Mulai dari iterasi pertama untuk melakukan Bubble Sort dengan memeriksa dan menukar elemen yang sesuai.
        for (int i = 0; i < n - 1; i++) {
            // Iterasi kedua di dalam iterasi pertama untuk memeriksa elemen-elemen yang berdekatan dan menukar jika diperlukan agar array terurut.
            for (int j = 0; j < n - i - 1; j++) {
                // Membandingkan elemen saat ini dengan elemen berikutnya.
                if (arr[j] > arr[j + 1]) {
                     // Menukar posisi elemen saat ini dengan elemen berikutnya jika urutannya tidak benar.
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {  // Metode utama yang akan dijalankan saat program dijalankan
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk menerima input dari pengguna.

        System.out.print("Masukkan jumlah elemen: "); //Menampilkan pesan untuk meminta jumlah elemen yang akan dimasukkan.
        int num = scanner.nextInt(); //Mengambil jumlah elemen dari input pengguna.
        int[] array = new int[num]; // Membuat array dengan ukuran sesuai jumlah elemen yang dimasukkan.

        System.out.println("Masukkan elemennya:");{}  // Menampilkan pesan memasukkan elemen.
        for (int i = 0; i < num; i++) { //Looping untuk mengisi array dengan nilai-nilai yang dimasukkan oleh pengguna.
            array[i] = scanner.nextInt(); // Mengisi array dengan elemen-elemen yang dimasukkan oleh pengguna.
        }

        System.out.println("Array before sorting: " + Arrays.toString(array)); // Menampilkan array sebelum diurutkan.
        bubbleSort(array); // Memanggil metode bubbleSort untuk mengurutkan array.
        System.out.println("Array after sorting: " + Arrays.toString(array)); // Menampilkan array setelah diurutkan.

        scanner.close(); //Menutup objek Scanner setelah selesai penggunaan untuk menghindari kebocoran memori.
    }
}
