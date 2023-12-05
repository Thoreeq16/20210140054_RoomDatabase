package com.example.pertemuan10.Repositori

import com.example.pertemuan10.data.DataSiswa
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<DataSiswa>>

    fun getSiswaStream(id: Int): Flow<DataSiswa?>

    suspend fun insertSiswa(siswa: DataSiswa)

    suspend fun deleteSiswa(siswa: DataSiswa)

    suspend fun updateSiswa(siswa: DataSiswa)
}