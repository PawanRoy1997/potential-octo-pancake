package com.simpleapps.usbtatheringapp.utils

import android.Manifest.permission.ACCESS_NETWORK_STATE
import android.app.Activity
import android.content.Context
import androidx.core.content.ContextCompat
import androidx.core.content.PermissionChecker.PERMISSION_GRANTED

class PermissionUtil {
    /*
     * We have to deal with the following here...
     *
     * 1. if we have permission or not
     * 2. if not then get permission
     * 3. if refused to give, then inform via callback
     */

    // Permissions Required are
    val networkStatePerm = ACCESS_NETWORK_STATE
    val netStatePermCode = 123

    /**
     * Let's start if user has permission or not
     *
     * For that we require
     * @param context
     * @param permission
     *
     * @return whether permission is granted or not
     */
    fun hasPermission(context: Context, permission: String): Boolean {
        return ContextCompat.checkSelfPermission(
            context,
            permission
        ) == PERMISSION_GRANTED
    }

    /**
     * Now the next, If not then ger permission
     *
     * This requires similar params
     * @param context
     * @param permission
     * @param activity
     * @param permCode
     */
    fun checkAndRequestParam(context: Context, permission: String, activity: Activity, permCode:Int) {
        if(!hasPermission(context, permission)){
            activity.requestPermissions(arrayOf(permission), permCode)
        }
    }


}