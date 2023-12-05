package com.example.pertemuan10.Repositori

import com.example.pertemuan10.data.DataSiswa
import com.example.pertemuan10.data.SiswaDao
import kotlinx.coroutines.flow.Flow

class OfflineRepositoriSiswa(private val siswaDao: SiswaDao):RepositoriSiswa {
    override fun getAllSiswaStream(): Flow<List<DataSiswa>> = siswaDao.getAllSiswa()

    override fun getSiswaStream(id: Int): Flow<DataSiswa?> = siswaDao.getSiswa(id)

    override suspend fun insertSiswa(siswa: DataSiswa) = siswaDao.insert(siswa)

    override suspend fun deleteSiswa(siswa: DataSiswa) = siswaDao.delete(siswa)

    override suspend fun updateSiswa(siswa: DataSiswa) = siswaDao.update(siswa)
}