package com.loki.separate.routing

import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import com.loki.singlemoduleapp.BStreamActivity
import com.loki.singlemoduleapp.core.routing.Router

class StreamRouting : Router {

    val TAG = "ROUTER"

    override fun launchStreamA(context: Context) {
        Log.d(TAG, "Stub this action")
        Toast.makeText(context, "Stub this action", Toast.LENGTH_SHORT).show()
    }

    override fun launchStreamB(context: Context) {
        context.startActivity(Intent(context, BStreamActivity::class.java))
    }
}