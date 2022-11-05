package com.mdgz.dam.labdam2022.persistencia.room.daos;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.mdgz.dam.labdam2022.model.Ubicacion;
import com.mdgz.dam.labdam2022.persistencia.room.entidades.UbicacionEntity;

import java.util.List;
@Dao
public interface UbicacionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertarUbicacion(UbicacionEntity ubicacion);

    @Insert
    void insertarTodos(List<UbicacionEntity> ubicaciones);

    @Query("SELECT * FROM Ubicacion")
    List<UbicacionEntity> recuperarUbicaciones();

    //Buscar por id
    @Query("SELECT * FROM Ubicacion WHERE id = :id")
    UbicacionEntity getUbicacionPorId(Integer id);
    
}
