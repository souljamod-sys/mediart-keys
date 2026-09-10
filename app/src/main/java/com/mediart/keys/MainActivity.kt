package com.mediart.keys
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
class MainActivity: AppCompatActivity(){
 override fun onCreate(s: Bundle?){
  super.onCreate(s)
  val layout = LinearLayout(this).apply{orientation=LinearLayout.VERTICAL}
  val title = TextView(this).apply{text="Mediart Keys - Piano Ready"; textSize=20f; setPadding(20,100,20,20)}
  val btn = Button(this).apply{text="Play C Note"}
  btn.setOnClickListener{ Toast.makeText(this,"Piano Sound! Add your samples next",Toast.LENGTH_SHORT).show() }
  layout.addView(title); layout.addView(btn)
  setContentView(layout)
 }
}
