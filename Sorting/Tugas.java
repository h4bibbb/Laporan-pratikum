package Sorting; // Menyatakan bahwa kelas ini berada dalam paket (package) Sorting.

public class Tugas { // Mendefinisikan kelas Tugas
    public static void main(String[] args) { // Metode utama yang akan dieksekusi pertama kali saat program dijalankan

        String[] strings = {"Ford", "Chevrolet", "Toyota", "Honda", "Mazda"};  // Membuat array string dengan beberapa merek mobil

        sort(strings); // Memanggil fungsi sort untuk mengurutkan array strings

        for (String string : strings) { // Looping untuk mencetak setiap elemen dalam array

            System.out.println(string); // Mencetak setiap elemen array
            
        }
    }

    static void sort(String[] arr){ // Fungsi sort untuk mengurutkan array string
        for (int i = 0; i < arr.length - 1; i++) { // Looping pertama untuk iterasi array
            for (int j = 0; j < arr.length - i - 1; j++) { // Looping kedua untuk iterasi array
                if (arr[j].compareTo(arr[j + 1]) > 0) { // Membandingkan elemen array menggunakan metode compareTo
                    // Swap arr[j] and arr[j+1]
                    String temp = arr[j]; //Menyimpan nilai sementara arr[j]
                    arr[j] = arr[j + 1]; // Menempatkan nilai arr[j+1] ke arr[j]
                    arr[j + 1] = temp; // Mengembalikan nilai sementara ke arr[j+1]
                }
            }
}}
}