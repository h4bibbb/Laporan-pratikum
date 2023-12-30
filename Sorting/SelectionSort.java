package Sorting; // Ini adalah pernyataan yang menentukan paket di mana kelas SelectionSort berada. Dalam hal ini, kelas SelectionSort berada dalam paket bernama "Sorting".
import java.util.Arrays; //  Mengimpor kelas Arrays dari paket java.util, yang digunakan untuk menggunakan metode toString() untuk mencetak array dalam bentuk yang mudah dibaca.

class SelectionSort { // Mendefinisikan kelas SelectionSort di mana algoritma pengurutan dan fungsi utama terdapat.
    public static void selectionSort(int[] arr) { // Metode utama yang akan dieksekusi pertama kali saat program dijalankan
        int n = arr.length; // Menyimpan panjang array ke dalam variabel n,untuk ngecek berapa banyak angka yang mau diurutin. 
        for (int i = 0; i < n - 1; i++) { // Looping untuk mencari nilai minimum
            int minIndex = i; // Mendeklarasikan variabel minIndex dan menginisialisasinya dengan nilai i
            for (int j = i + 1; j < n; j++) { // Looping untuk mencari nilai minimum
                if (arr[j] < arr[minIndex]) { // Membandingkan nilai elemen saat ini dengan nilai minimum yang tersimpan
                    minIndex = j; // Memperbarui indeks minimum jika ditemukan nilai yang lebih kecil
                }
            }
            int temp = arr[minIndex]; // Menyimpan nilai minimum sementara
            arr[minIndex] = arr[i]; //Menukar nilai minimum dengan nilai pada indeks i
            arr[i] = temp; // Mengatur elemen pertama yang belum diurutkan dengan nilai minimum yang disimpan
        }
    }

    public static void main(String[] args) { // Metode utama yang akan dijalankan saat program dimulai.
        int[] array = {22, 2, 90, 25, 20, 6, }; // Daftar angka yang mau kita urutin.

        System.out.println("Array before sorting: " + Arrays.toString(array)); // Menampilkan array sebelum diurutkan.
        selectionSort(array); // Memanggil metode selectionSort untuk mengurutkan array
        System.out.println("Array after sorting: " + Arrays.toString(array)); // Menampilkan array setelah diurutkan.
    }
}

