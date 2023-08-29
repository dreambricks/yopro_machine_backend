package com.dreambricks.yopro_machine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;


    public List<Player> getAll(){
        System.out.print(this.playerRepository.findAll());
        return this.playerRepository.findAll();
    }

}
