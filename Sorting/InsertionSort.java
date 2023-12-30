package Sorting; //Menyatakan bahwa kelas ini berada dalam paket (package) Sorting.
import java.util.Arrays; // Mengimpor kelas Arrays dari pustaka java.util untuk menggunakan metode toString() dalam menampilkan array.

class InsertionSort { // Mendefinisikan kelas InsertionSort.
    public static void insertionSort(int[] arr) { // Mendefinisikan metode untuk melakukan pengurutan insertion sort pada array 
        int n = arr.length; // Menyimpan panjang array ke dalam variabel n,untuk ngecek berapa banyak angka yang mau diurutin. 
        for (int i = 1; i < n; i++) { // Perulangan untuk menelusuri array mulai dari elemen kedua
            int key = arr[i]; // Menyimpan nilai elemen saat ini sebagai 'key'
            int j = i - 1; // Menginisialisasi 'j' ke indeks sebelum elemen saat ini

            while (j >= 0 && arr[j] > key) { // Perulangan while untuk menggeser elemen-elemen array yang lebih besar dari 'key'
                arr[j + 1] = arr[j]; // Geser angka ke kanan biar ada tempat buat angka baru atau mengganti nilai elemen dengan nilai elemen sebelumnya.
                j = j - 1; // Pindah ke angka sebelumnya untuk dicek lagi.
            }
            arr[j + 1] = key; // Memasukkan nilai key ke posisi yang sesuai setelah pergeseran.
        }
    }

    public static void main(String[] args) { // Metode utama yang akan dijalankan saat program dimulai.
        int[] array = {12, 11, 13, 5, 6}; // Daftar angka yang mau kita urutin.

        System.out.println("Array before sorting: " + Arrays.toString(array)); // Menampilkan array sebelum diurutkan.
        insertionSort(array); // Memanggil metode insertionSort untuk mengurutkan array.
        System.out.println("Array after sorting: " + Arrays.toString(array)); // Menampilkan array setelah diurutkan.
    }
}

