package com.proximus.backend.proximusBackend.service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.proximus.backend.proximusBackend.model.Canal;

/**
 * 
 * @author Marwa Essahli
 *
 */
@Service
public class CanalServiceImpl implements CanalService {

	@Autowired
	ObjectMapper objectMapper;
	
	/**
	 * Gets all canals.
	 * 
	 * @return the list of canal
	 */
	@Override
	public List<Canal> getAllCanals() {
		List<Canal>  canalList= new ArrayList<Canal>();
		 URL resource = getClass().getClassLoader().getResource("ListCanals.json"); 
		try {
			JSONParser parser = new JSONParser();
			Object obj= parser.parse(new FileReader(resource.getPath()));
			
			canalList = objectMapper.readValue(obj.toString(), new TypeReference<List<Canal>>(){}) ;
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return canalList;
	}

/**
	 * Validate canal.
	 * 
	 * @param canal the canal
	 * @return the canal
	 */
	@Override
	public Canal validateCanal(Canal canal) {
		// TODO Auto-generated method stub
		canal.setAvailability(true);
		return canal;
	}

/**
	 * Invalidate canal.
	 * 
	 * @param canal the canal
	 * @return the canal
	 */
	@Override
	public Canal inValidateCanal(Canal canal) {
		// TODO Auto-generated method stub
		canal.setAvailability(false);
		return canal;
	}

}
