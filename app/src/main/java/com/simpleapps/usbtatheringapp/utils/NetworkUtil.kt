package com.simpleapps.usbtatheringapp.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities.*

class NetworkUtil {
    private fun connMan(context: Context): ConnectivityManager {
        return context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }

    fun isConnected(context: Context): Boolean {
        var result = false
        val connMan = connMan(context)
        val network = connMan.activeNetwork ?: return false
        val capability = connMan.getNetworkCapabilities(network) ?: return false
        result = when {
            capability.hasTransport(TRANSPORT_CELLULAR) -> true
            capability.hasTransport(TRANSPORT_ETHERNET) -> true
            capability.hasTransport(TRANSPORT_WIFI) -> true
            else -> false
        }
        return result
    }
}