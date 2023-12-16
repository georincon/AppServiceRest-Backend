package com.example.backend.interfaces;

import java.util.List;
import java.util.Map;

import com.example.backend.modelo.Persona;

public interface PersonaInterface{
	public List<Map<String, Object>>listar();
	public List<Map<String, Object>>listarId(int id);
	public int add(Persona p);
	public int edit(Persona p);
	public int delete(int id);

}
