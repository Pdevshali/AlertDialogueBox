package com.example.alertdialogueboxproject

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialogueboxproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        binding.textView2.setOnClickListener {
            val options = arrayOf("Html", "Css", "C++", "JavaScript")

            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Q1: Which programming language use for backend" +
                    "of website ?")
            builder1.setIcon(R.drawable.baseline_question_answer_24)
            builder1.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "You have choosen ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, i ->
                // What action should we perform

            })
            builder1.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, i ->
                // What action should we perform

            })
            builder1.show()
        }

        binding.textView3.setOnClickListener {
            val options = arrayOf("webDevelopment", "MobileApp", "WindowsApp", "MachineLearning")

            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Q2: Python language is used for?")
            builder1.setIcon(R.drawable.baseline_question_answer_24)
            builder1.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "Tou have choose ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, i ->
                // What action should we perform

            })
            builder1.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, i ->
                // What action should we perform

            })
            builder1.show()
        }

        binding.textView4.setOnClickListener {
            val options = arrayOf("const", "tupple", "onClickListener", "prompt")

            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Q3: Which of the following are KeyWord of javaScript")
            builder1.setIcon(R.drawable.baseline_question_answer_24)
            builder1.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "Tou have choose ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, i ->
                // What action should we perform

            })
            builder1.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, i ->
                // What action should we perform

            })
            builder1.show()
        }

        binding.btn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Are You sure?")
            builder.setIcon(R.drawable.baseline_exit_to_app_24)
            builder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                finish()
            })
            builder.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->

            })
            builder.show()
        }

    }
}