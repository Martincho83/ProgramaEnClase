package ar.com.unpaz.servicio;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.crud.Funcionalidades;
import ar.com.unpaz.model.Camino;
import ar.com.unpaz.repositorio.LeerArchivoDeCaminoRepositorio;

public class LeerArchivoDeCaminoServicio implements Funcionalidades{
	
	@Override
	public List<Camino> getListCaminos(){
		LeerArchivoDeCaminoRepositorio repo = new LeerArchivoDeCaminoRepositorio();
		List<Camino> sList = new ArrayList<Camino>();
		sList = repo.getListCaminos();
		return sList;
	}
}
