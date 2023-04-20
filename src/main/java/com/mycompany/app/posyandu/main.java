package com.mycompany.app.posyandu;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class main {

    public static void main(String[] args) {
        // TODO code application logic here
//        Login login = new Login();
//        login.setVisible(true);
//        login.setLocationRelativeTo(null);
            
        Menu menu = new Menu();
        menu.setVisible(true);
//        dispose();
        menu.setLocationRelativeTo(null);
        
//        Alert alert = new Alert(Alert.AlertType.ERROR);
//        alert.setHeaderText("Kesalahan");
//        alert.setContentText("Kolom teks harus diisi.");
//        alert.showAndWait();
        
        // membuat dokumen baru untuk di-insert ke koleksi
//        Document newDocument = new Document("nama", "John")
//                                .append("umur", 35)
//                                .append("alamat", new Document("jalan", "Jl. Raya Kebayoran Lama")
//                                                            .append("kota", "Jakarta Selatan"));

        // melakukan insert dokumen ke koleksi
//        collection.insertOne(newDocument);

        // menampilkan semua dokumen di dalam koleksi
//        FindIterable<Document> documents = collection.find();
//        for (Document document : documents) {
//            System.out.println(document.toJson());
//        }
    }
    
}
