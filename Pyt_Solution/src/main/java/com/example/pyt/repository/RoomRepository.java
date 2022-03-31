package com.example.pyt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pyt.model.Room;

@Repository
public interface RoomRepository extends JpaRepository <Room, Long>{

}