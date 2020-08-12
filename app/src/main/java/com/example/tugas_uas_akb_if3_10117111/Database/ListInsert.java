package com.example.tugas_uas_akb_if3_10117111.Database;

import android.content.Context;

/** NIM : 10117111
 * Nama : Tias Gumelar T
 * Kelas : IF-3
 * Tanggal : 08-08-2020**/

public class ListInsert {

    private static DatabaseHelper databaseHelper;

    public ListInsert(Context context){

        databaseHelper = new DatabaseHelper(context);
  //      Log.d("insert", "inserting data");
        databaseHelper.save(new TourPlace(1, "NuArt Sculpture Park",
                "Jl, Setra Duta Raya No.6, Ciwaruga, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat 40151",
                "Hari biasa 09.00-18.00 dan Weekend 11.00-22.00",
                "Museum galeri seni patung yang terletak di bagian Bandung Utara, Jawa Barat, Indonesia " +
                        "Tempat ini merupakan pusat seni patung karya Nyoman Nuarta, " +
                        "cocok untuk yang mempunyai hobi seni karena banyaknya spot berfoto yang bagus.",
                "https://www.dakatour.com/wp-content/uploads/2018/06/alamat-nuart-sculpture-park-bandung.jpg",
                "-6.877463", "107.5702503"));

        databaseHelper.save(new TourPlace(2, "Danau Wakadobol",
                "Giriasih, Kec. Batujajar, Kabupaten Bandung Barat, Jawa Barat 40561",
                "Setiap Hari 07.00-17.00",
                "Wisata danau alam yang luas dan dikelilingi oleh pasir dan batu yang dikelilingi oleh tebing. " +
                        "Untuk kalian yang ingin rekreasi dengan suasana danau yang alami terbentuk dari air hujan. " +
                        "Karena bentuk danau tersebut seperti cekungan karena air hujan cocok untuk spot foto juga.",
                "https://1.bp.blogspot.com/-oSnFmNGML7k/XAklqzfGavI/AAAAAAAAA90/Y5NYbFDSoNIu6SSoATbptXek3UQVplUvwCLcBGAs/s1600/img_20160715_152948.jpg",
                "-6.8890313", "107.5051282"));

        databaseHelper.save(new TourPlace(3, "Air Terjun Curug Penganten",
                "Desa Padaasih, Kec. Cisarua, Padaasih, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat 40551",
                "Setiap Hari 06.00-17.00",
                "Salah satu lokasi yang dapat dijadikan destinasi wisata yang menyukai panorama alam terutama air terjun. " +
                        "Air terjun di ketinggian 1050 Mdpl dengan tinggi mencapai 50 meter ini sangat indah, " +
                        "dikarenakan suasana sekitarnya sangat mendukung seperti pepohonan hijau.",
                "https://www.jejakpiknik.com/wp-content/uploads/2017/07/@imamarchipale-630x380.jpg",
                "-6.8356288", "107.5634705"));

        databaseHelper.save(new TourPlace(4, "Gunung Lalakon",
                "Situwangi, Kec. Cihampelas, Kabupaten Bandung Barat, Jawa Barat",
                "24 Jam",
                "Salah satu gunung yang populer di kabupaten bandung dikarenakan mitos yang ada. " +
                        "walaupun terdapat mitos diantara masyarakat disana, gungung tersebut sangat indah, " +
                        "Pemandangan berbentuk piramid dan udaranya yang sejuk cocok untuk dijadikan tempat rekreasi.",
                "https://ahmadnajip.files.wordpress.com/2011/11/lalakon.jpg",
                "-6.9580552", "107.503046"));

        databaseHelper.save(new TourPlace(5, "Taman Wisata Pakuhaji",
                "Cikawati Tengah, Pakuhaji, Kec. Ngamprah, Kabupaten Bandung Barat, Jawa Barat 40552",
                "Hari biasa 10.00 dan Weekend 09.00-21.00",
                "Sebuah taman yang sangat cocok bagi penggemar hewan dan terdapat taman yang indah. " +
                        "Cocok untuk digunakan sebagai tempat rekreasi bagi keluarga dan saudara, " +
                        "terdapat berbagai wahana permainan dan cocok juga untuk spot foto bagi yang suka selfie.",
                "https://tempatwisatadibandung.info/wp-content/uploads/2016/07/Wisata-Kuda-Nasi-Liwet-Paku-Haji-Cimahi.jpg",
                "-6.8356845", "107.5344586"));

    }



}
