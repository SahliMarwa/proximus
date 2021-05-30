package com.proximus.backend.proximusBackend.service;

import java.util.List;
import com.proximus.backend.proximusBackend.model.Canal;

/**
 * 
 * @author Marwa Essahli
 *
 */
public interface CanalService {
	List<Canal> getAllCanals();
	Canal validateCanal(Canal canal);
	Canal inValidateCanal(Canal canal);
}
