package com.example.pertemuan10.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface SiswaDao {
    @Insert(onConflict = OnConflictStrategy. IGNORE)
    suspend fun insert(siswa: DataSiswa)

    @Update
    suspend fun update (siswa: DataSiswa)

    @Delete
    suspend fun delete (siswa: DataSiswa)

    @Query("SELECT * from tblSiswa WHERE id = :id")
    fun getSiswa(id: Int): Flow<DataSiswa>

    @Query ("SELECT * from tblSiswa ORDER BY nama ASC")
    fun getAllSiswa(): Flow<List<DataSiswa>>
}