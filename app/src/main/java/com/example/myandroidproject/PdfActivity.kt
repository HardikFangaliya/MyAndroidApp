package com.example.myandroidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class PdfActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)

        val pos = intent.getIntExtra("pos",0)
        val name = intent.getStringExtra("name")

        val pdf = findViewById<PDFView>(R.id.pdf2)
        val androidpdf = arrayOf("chone.pdf","chtwo.pdf","chthree.pdf","chfour.pdf","chfive.pdf")
        val sepdf = arrayOf("chone.pdf","chtwo.pdf","chthree.pdf","chfour.pdf","chfive.pdf")
        val asppdf = arrayOf("chone.pdf","chtwo.pdf","chthree.pdf","chfour.pdf","chfive.pdf")
        val daapdf = arrayOf("chone.pdf","chtwo.pdf","chthree.pdf","chfour.pdf","chfive.pdf")
        val awspdf = arrayOf("awsp.pdf","chone.pdf","chtwo.pdf","chthree.pdf","chfour.pdf")

        when(name){
            "android"->{
                pdf.fromAsset(androidpdf[pos]).load()
            }
            "se"->{
                pdf.fromAsset(sepdf[pos]).load()
            }
            "asp"->{
                pdf.fromAsset(asppdf[pos]).load()
            }
            "daa"->{
                pdf.fromAsset(daapdf[pos]).load()
            }
            "aws"->{
                pdf.fromAsset(awspdf[pos]).load()
            }

        }
    }
}