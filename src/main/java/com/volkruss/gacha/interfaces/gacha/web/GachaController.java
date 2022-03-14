package com.volkruss.gacha.interfaces.gacha.web;

import com.volkruss.gacha.interfaces.gacha.facade.GachaServiceFacade;
import com.volkruss.gacha.interfaces.gacha.facade.dto.CharacterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class GachaController {

	@Autowired
	private GachaServiceFacade gachaServiceFacade;

	@PostMapping("/api/get")
	public List<CharacterDTO> playGacha(@RequestBody UserGachaCommand command) {

		return gachaServiceFacade.playGacha(command.getUser_id(),command.getType());
	}

}
