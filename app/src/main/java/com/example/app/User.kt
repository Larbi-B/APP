package com.example.app

import android.provider.ContactsContract.CommonDataKinds.Email
import java.net.PasswordAuthentication

class User (val nom:String, val prenom:String, var email:String, var mdp:String) {

    var connecte = false

    fun setConnected ()
    {
        this.connecte = true
    }

    fun getConnected ():Boolean
    {
        return this.connecte
    }

    fun getMail():String
    {
        return this.email
    }
}




