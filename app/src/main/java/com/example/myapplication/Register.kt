package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

lateinit var log:EditText
lateinit var pas:EditText
class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        log=findViewById(R.id.login)
        pas=findViewById(R.id.password)
    }

    fun Main(view: View) {
        if(log!!.text.isNullOrEmpty()==false   || pas!!.text.isNullOrEmpty()==false)
        {
            if(log!!.text.toString()=="ects" && pas!!.text.toString()=="ects2024")
            {
               val intent= Intent(this,Main::class.java)
                   startActivity(intent)
            }else
            {

            }
        }else
        {
           val alert=AlertDialog.Builder(this)
                .setTitle("Error")
               .setMessage("Places is empty")
               .setPositiveButton("ok") { dialog, which -> dialog.dismiss()}
               .create()
               .show()

        }

    }
}


