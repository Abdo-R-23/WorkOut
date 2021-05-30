package com.example.workout

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.workout.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        auth = FirebaseAuth.getInstance()

        binding.apply {
            buttonLogin.setOnClickListener {
                loginUser()
            }
            buttonRegister.setOnClickListener {
                val intent = Intent(applicationContext, Register::class.java)
                startActivity(intent)
            }
        }
    }

    private fun loginUser() {
        binding.apply {
            if (emailLogin.editText?.text?.isEmpty() == true) {
                emailLogin.editText?.error = "email is required !"
                return
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(emailLogin.editText?.text.toString()).matches()) {
                emailLogin.editText?.error = "valid email is required"
                return
            }

            if (passwordLogin.editText?.text?.isEmpty() == true) {
                passwordLogin.editText?.error = "password is required !"
                return
            }

            if (passwordLogin.editText?.text?.length!! < 6) {
                passwordLogin.editText?.error = "password cannot be less than 6 characters"
                return
            }


            auth.signInWithEmailAndPassword(
                    emailLogin.editText?.text?.trim().toString(),
                    passwordLogin.editText?.text?.trim().toString()

            ).addOnCompleteListener {
                if (it.isSuccessful) {
                    val intent = Intent(applicationContext, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {

                    val toast = Toast.makeText(applicationContext, it.exception.toString(),Toast.LENGTH_LONG)
                    toast.show()
                }
            }
        }
    }
}
