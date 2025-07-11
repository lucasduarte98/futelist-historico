package com.futelegends.futelist.repositories;

import com.futelegends.futelist.entities.Camisa;
import com.futelegends.futelist.entities.CamisaList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CamisaListRepository extends JpaRepository<CamisaList, Long> {

    @Modifying
    @Query(nativeQuery = true, value = "UPDATE tb_camisaentry SET position = :newPosition WHERE lista_id = :listId AND camisa_id = :camisaId")
    void updateBelongingPosition(Long listId, Long camisaId, Integer newPosition);

}
