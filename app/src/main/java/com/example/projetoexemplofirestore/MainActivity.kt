package com.example.projetoexemplofirestore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {

    var myDataBase: FirebaseFirestore? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myDataBase = FirebaseFirestore.getInstance()



        // Parte 1 - Criando collection e adicionando documents
//        val sistemaSolar = myDataBase!!.collection("sistema_solar")
//
//        sistemaSolar.add(mapOf(
//            "nome" to "Mercurio",
//            "gravidade" to 3.7,
//            "cor" to "Cinza"
//        ))
//
//        sistemaSolar.add(mapOf(
//            "nome" to "Plutao",
//            "gravidade" to 0.62,
//            "cor" to "Bege"
//        ))
//
//        sistemaSolar.document("planetaTerra")
//            .set(mapOf(
//                "nome" to "Terra",
//                "gravidade" to 10,
//                "cor" to "Azul"
//            ))
//        // Update Value
//        sistemaSolar.document("planetaTerra").update("nome", "Planeta Terra")








        // Parte 2 - Criando collection dentro de um document
//        val sistemaSolar = myDataBase!!.collection("sistema_solar")
//        val satelitesDaTerra = sistemaSolar.document("planetaTerra")
//            .collection("satelites")
//
//        satelitesDaTerra.add(mapOf(
//            "nome" to "Lua",
//            "gravidade" to 1.62,
//            "cor" to "Cinza"
//        ))






        // Parte 3 - Deletando Documents
//        myDataBase!!.collection("sistema_solar")
//            .document("planetaTerra")
//            .delete()
//
//
//
//        myDataBase!!.collection("sistema_solar")
//            .get().addOnSuccessListener {
//                it.forEach {
//                    it.reference.delete()
//                }
//            }
//
//
//
//        myDataBase!!.collection("sistema_solar")
//            .get().addOnSuccessListener {
//
//                // Cria o batch de operações
//                val myBatch = myDataBase!!.batch()
//
//                // Adiciona os documentos para o batch
//                it.forEach {
//                    myBatch.delete(it.reference)
//                }
//
//                // Executa o batch
//                myBatch.commit()
//            }








        // Parte 4 - Querys
//        val sistemaSolar = myDataBase!!.collection("sistema_solar")
//
//        val planetaTerraDoc = myDataBase!!
//            .collection("sistema_solar")
//            .document("planetaTerra")
//
//        planetaTerraDoc.get().addOnSuccessListener {
//            println(
//                "Saida: Gravidade da ${it.get("nome")} é ${it.get("gravidade")} m/s/s"
//            )
//        }
//
//        sistemaSolar
//            .whereEqualTo("nome", "Mercurio")
//            .get().addOnSuccessListener {
//                it.forEach {
//                    println(
//                        "Saida: Gravidade de ${it.get("nome")} é ${it.get("gravidade")} m/s/s"
//                    )
//                }
//            }
//
//        sistemaSolar.get().addOnSuccessListener {
//            it.forEach {
//                println("Saida:" +  it.get("nome"))
//            }
//        }

    }
}
