package com.example.myjitpacklibrary

import android.content.Context
import android.widget.Toast

class DemoTest {

    fun showDemoToast(context: Context){
        Toast.makeText(context,"Hello JitPack Demo",Toast.LENGTH_SHORT).show()
    }
}