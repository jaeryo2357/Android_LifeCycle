package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val intent = Intent(this@MainActivity, SubActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            AlertDialog.Builder(this)
                    .setTitle("생명주기 테스트")
                    .setMessage("어떤 콜백이?")
                    .setPositiveButton("종료") { dialog, _ -> dialog.dismiss() }
                    .show()
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            val intent = Intent(this@MainActivity, TransparentActivity::class.java)
            startActivity(intent)
        }
    }
}