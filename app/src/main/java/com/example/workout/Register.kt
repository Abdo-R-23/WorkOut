package com.example.workout

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.workout.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class Register : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        mAuth = FirebaseAuth.getInstance()
        binding.apply {
            buttonCreate.setOnClickListener {
                registerUser()
            }
            buttonAlreadyHaveAccount.setOnClickListener {
                intent = Intent(applicationContext, Login::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)
            }
        }
    }
    private fun registerUser() {
        binding.apply {
            if (nameRegister.editText?.text?.isEmpty() == true) {
                nameRegister.editText?.error = "name is required !"
                return
            }

            if (emailRegister.editText?.text?.isEmpty() == true) {
                emailRegister.editText?.error = "email is required !"
                return
            }


            if (!Patterns.EMAIL_ADDRESS.matcher(emailRegister.editText?.text.toString())
                            .matches()
            ) {
                emailRegister.editText?.error = "valid email is required"
                return
            }

            if (passwordRegister.editText?.text?.isEmpty() == true) {
                passwordRegister.editText?.error = "password is required !"
                return
            }

            if (passwordRegister.editText?.text?.length!! < 6) {
                passwordRegister.editText?.error = "password cannot be less than 6 characters"
                return
            }

            mAuth.createUserWithEmailAndPassword(
                    emailRegister.editText?.text?.trim().toString(),
                    passwordRegister.editText?.text?.trim().toString()
            )
                    .addOnCompleteListener {
                        if (it.isSuccessful) {
                            val intent = Intent(applicationContext, MainActivity::class.java)
                            startActivity(intent)
                            finish()
                        } else {
                            intent = Intent(applicationContext, Login::class.java)
                            startActivity(intent)
                        }
                    }
        }
    }
}