package ar.com.unpaz.repositorio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.crud.Funcionalidades;
import ar.com.unpaz.model.Camino;

public class LeerArchivoDeCaminoRepositorio implements Funcionalidades{
	
	@Override
	public List<Camino> getListCaminos(){
		File sFile = new File("vial.csv");
		List<Camino> sListCamino = new ArrayList<Camino>();
		FileReader sFileReader;
		try {
			sFileReader = new FileReader(sFile);
			BufferedReader sBufferedReader = new BufferedReader(sFileReader);
			String linea = "";
			while((linea = sBufferedReader.readLine()) !=null) {
				String data[] = linea.split(",");
				Camino sCamino = new Camino();
				sCamino.codigo = data[0];
				sCamino.tipo = data[1];
				sCamino.id = data[2];
				sCamino.nombre = data[3];
				sCamino.valor = data[4];
				sListCamino.add(sCamino);
			}	
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return sListCamino;
	}

}
