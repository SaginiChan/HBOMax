package com.example.hbo2

import android.app.Activity
import android.content.Intent
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.hbo2.R.layout.signup
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.core.utilities.ParsedUrl
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.signup.*
import java.util.*

class SignnUpActivity   : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(signup)

        button_register.setOnClickListener {
            performRegister()
        }

        already_have_accounttextView.setOnClickListener {

            Log.d("RegisterActivity", "Try to show login activity")

            //launch the login activity somehow

            val intent = Intent(this, FirstPage::class.java)
            startActivity(intent)
        }
        select_photoimage_view.setOnClickListener {
            Log.d("MainActivity", "Try to show photoselector")

            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            startActivityForResult(intent, 0)
        }

    }

    var selectedPhotouri: Uri? = null

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 0 && resultCode == Activity.RESULT_OK && data != null) {

            //proceed and check what the selected image was
            Log.d("RegisterActivity", "Photo was selected")


            selectedPhotouri = data.data
            val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, selectedPhotouri)


            select_photoimage_view.setImageBitmap( bitmap )

            photo_button.alpha = 0f


            //  val bitmapDrawable = BitmapDrawable(bitmap)
            //  select_photoimage_view.setBackgroundDrawable(bitmapDrawable)
        }
    }


    private fun performRegister() {
        val email = email_edittext.text.toString()
        val password = password_edittext.text.toString()

        if (email.isEmpty() || password.isEmpty()) {

            Toast.makeText(this, "YO EMAIL AND PASSWORD, DUUUH", Toast.LENGTH_SHORT).show()
            return
        }

        //Firebase authentication to create a user and password

        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (!it.isSuccessful) return@addOnCompleteListener

                //else if successful
                Log.d("Main", "Successfully created user with uid: ${it.result?.user?.uid}")
                Toast.makeText(this, "Welcome To HBO Max", Toast.LENGTH_SHORT).show()
                Toast.makeText(this, "May The Force Be With You", Toast.LENGTH_SHORT).show()

                uploadImageToFirebaseStorage()
            }
            .addOnFailureListener {

                Log.d("main", "Failed to create user: ${it.message}")
                Toast.makeText(this, "Failed To Create User", Toast.LENGTH_SHORT).show()


                Toast.makeText(this, "OR YOUR PASSWORD GAME TOO WEAK!!", Toast.LENGTH_SHORT).show()
            }
    }


    private fun uploadImageToFirebaseStorage() {
        if (selectedPhotouri == null) return

        val filename = UUID.randomUUID().toString()
        val ref = FirebaseStorage.getInstance().getReference("/images/$filename")
        ref.putFile(selectedPhotouri!!)
            .addOnSuccessListener {
                Log.d("Register", "Successfully uploaded image: ${it.metadata?.path} ")

                val intent = Intent(this, FirstPage::class.java )
                intent.flags =Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent)
            }

        ref.downloadUrl.addOnSuccessListener {
            (it.toString())

            Log.d("RegisterActivity", "File Location: $it")

        }
    }
}

