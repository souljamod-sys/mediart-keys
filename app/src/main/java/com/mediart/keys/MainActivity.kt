package com.mediart.keys
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
 override fun onCreate(b: Bundle?) {
  super.onCreate(b)
  val lv=ListView(this)
  val lessons=arrayOf("THEORY 1: Number System","THEORY 2: 2-5-1 Gospel","THEORY 3: Passing Chords","PRACTICAL C - Worship","PRACTICAL Db - Jazz","PRACTICAL Eb - Licks by Mediart")
  lv.adapter=ArrayAdapter(this, android.R.layout.simple_list_item_1, lessons)
  setContentView(lv)
 }
}
