package com.futelegends.futelist.services;

import com.futelegends.futelist.CamisaProjection;
import com.futelegends.futelist.dto.CamisaDTO;
import com.futelegends.futelist.dto.CamisaFullDTO;
import com.futelegends.futelist.dto.CamisaListDTO;
import com.futelegends.futelist.entities.Camisa;
import com.futelegends.futelist.entities.CamisaList;
import com.futelegends.futelist.repositories.CamisaListRepository;
import com.futelegends.futelist.repositories.CamisaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class CamisaListService {

    @Autowired
    private CamisaListRepository camisaListRepository;

    @Autowired
    private CamisaRepository camisaRepository;


    @Transactional (readOnly = true)
    public List<CamisaListDTO> findAll() {
        List<CamisaList> result = camisaListRepository.findAll();
        return result.stream().map(x -> new CamisaListDTO(x)).toList();


    }
    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){

        List<CamisaProjection> list = camisaRepository.searchByList(listId);

        CamisaProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++) {
            camisaListRepository.updateBelongingPosition(listId, list.get(i).getId(),i);
        }

    }

}
