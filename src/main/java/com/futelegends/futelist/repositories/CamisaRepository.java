package com.futelegends.futelist.repositories;

import com.futelegends.futelist.CamisaProjection;
import com.futelegends.futelist.entities.Camisa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CamisaRepository extends JpaRepository<Camisa, Long> {


    @Query(nativeQuery = true, value = """
		SELECT tb_camisa.id, tb_camisa.title, tb_camisa.camisa_year AS `year`, tb_camisa.img_url AS imgUrl,
		tb_camisa.short_description AS shortDescription, tb_camisaentry.position
		FROM tb_camisa
		INNER JOIN tb_camisaentry ON tb_camisa.id = tb_camisaentry.camisa_id
		WHERE tb_camisaentry.lista_id = :listId
		ORDER BY tb_camisaentry.position
			""")
    List<CamisaProjection> searchByList(Long listId);

}


