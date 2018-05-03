package com.example.lenovo.intentfilterdemo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        btnOk.setOnClickListener{
            web()
        }
    }
    fun fun1(){
        val intent=Intent()
        intent.action="com.example.action.NEWS"
        intent.data= Uri.parse("http://www.google.com")
        startActivity(intent)
    }
    fun dial()=startActivity(Intent(Intent.ACTION_DIAL))

    fun call(){
        val intent=Intent(Intent.ACTION_CALL)
        intent.data= Uri.parse("tel://9503740614")
        startActivity(intent)
    }

    fun web(){
        val intent=Intent(Intent.ACTION_VIEW)
        intent.data= Uri.parse("http://www.google.com")
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
