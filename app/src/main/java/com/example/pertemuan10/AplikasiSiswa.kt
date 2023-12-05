package com.example.pertemuan10

import android.app.Application
import com.example.pertemuan10.Repositori.ContainerApp
import com.example.pertemuan10.Repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}