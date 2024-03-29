package ar.com.unpaz.principal;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Camino;
import ar.com.unpaz.servicio.LeerArchivoDeCaminoServicio;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeerArchivoDeCaminoServicio servicio = new LeerArchivoDeCaminoServicio();
		List<Camino> lista = new ArrayList<Camino>();
		lista = servicio.getListCaminos();
		
		for (Camino camino : lista) {
			System.out.println("Codigo " +  camino.getCodigo() + ", Tipo "  + camino.getTipo() +", ID " + camino.getId() + ", Nombre " + camino.getNombre() + ", Valor " + camino.getValor() );
		}
	}
}
