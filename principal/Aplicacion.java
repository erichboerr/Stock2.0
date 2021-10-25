package principal;

import ventanas.Inicial;
import ventanas.estadisticas.*;
import ventanas.servicios.*;
import ventanas.proveedores.*;
import ventanas.impresoras.*;
import ventanas.insumos.*;

/*Creado 
Erich Boerr
erichboerr@hotmail.com
17 oct 2021*/

public class Aplicacion {
	
	public void IniciarAplicacion() {
		
		Coordinador miCoordinador= new Coordinador();
		
		//objetos unicos 
		
		Inicial miPantallaInicial =new Inicial();		
		miPantallaInicial.setCoodinador(miCoordinador);
		miCoordinador.setInicial(miPantallaInicial);
		
		PantallaNuevoServicio miPantallaNuevoServicio =new PantallaNuevoServicio();
		miPantallaNuevoServicio.setCoordinador(miCoordinador);
		miCoordinador.setmiPantallaNuevoServicio(miPantallaNuevoServicio);
		
		PantallaModificacionServicio miPantallaModificacionServicio = new PantallaModificacionServicio();
		miPantallaModificacionServicio.setCoodinador(miCoordinador);
		miCoordinador.setmiPantallaModificacionServicio(miPantallaModificacionServicio);
		
		PantallaNuevoProveedor miPantallaNuevoProveedor = new PantallaNuevoProveedor();
		miPantallaNuevoProveedor.setCoordinador(miCoordinador);
		miCoordinador.setMiPantallaNuevoProveedor(miPantallaNuevoProveedor);
		
		PantallaModificacionProveedor miPanModificacionProveedor = new PantallaModificacionProveedor();
		miPanModificacionProveedor.setCoordinador(miCoordinador);
		miCoordinador.setMiPantallaModificarProveedor(miPanModificacionProveedor);
		
		PantallaBajaProveedor miPantallaBajaProveedor = new PantallaBajaProveedor();
		miPantallaBajaProveedor.setCoordinador(miCoordinador);
		miCoordinador.setmiPantallaBajaProveedor(miPantallaBajaProveedor);
		
		PantallaNuevaImpresora miPantallaNuevaImpresora = new PantallaNuevaImpresora();
		miPantallaNuevaImpresora.setCoordinador(miCoordinador);
		miCoordinador.setmiPantallaNuevaImpresora(miPantallaNuevaImpresora);
		
		PantallaBajaImpresora miPantallaBajaImpresoraServicio = new PantallaBajaImpresora();
		miPantallaBajaImpresoraServicio.setCoordinador(miCoordinador);
		miCoordinador.miPantallaBajaImpresoraServicio(miPantallaBajaImpresoraServicio);
		
		PantallaEntregarImpresoraNuevaServicio miPantallaEntregarImpresoraNuevaServicio = new PantallaEntregarImpresoraNuevaServicio();
		miPantallaEntregarImpresoraNuevaServicio.setCoordinador(miCoordinador);
		miCoordinador.miPantallaEntregarImpresoraNuevaServicio(miPantallaEntregarImpresoraNuevaServicio);
		
		PantallaEntregarImpresoraUsadaServicio miPantallaEntregarImpresoraUsadaServicio = new PantallaEntregarImpresoraUsadaServicio();
		miPantallaEntregarImpresoraUsadaServicio.setCoordinador(miCoordinador);
		miCoordinador.miPantallaEntregarImpresoraUsadaServicio(miPantallaEntregarImpresoraUsadaServicio);
		
		PantallaQuitarImpresoraServicio miPantallaQuitarImpresoraServicio = new PantallaQuitarImpresoraServicio();
		miPantallaQuitarImpresoraServicio.setCoordinador(miCoordinador);
		miCoordinador.miPantallaQuitarImpresoraServicio(miPantallaQuitarImpresoraServicio);
		
		PantallaActualizarSerieImpresora miPantallaActualizarSerieImpresora = new PantallaActualizarSerieImpresora();
		miPantallaActualizarSerieImpresora.setCoordinador(miCoordinador);
		miCoordinador.setmiPantallaActualizarSerieImpresora(miPantallaActualizarSerieImpresora);
		
		PantallaMarca miPantallaMarca = new PantallaMarca();
		miPantallaMarca.setCoordinador(miCoordinador);
		miCoordinador.setmiPantallaMarca(miPantallaMarca);
		
		PantallaModelo miPantallaModelo = new PantallaModelo();
		miPantallaModelo.setCoordinador(miCoordinador);
		miCoordinador.setmiPantallaModelo(miPantallaModelo);
		
		PantallaIngresoInsumos miPanIngresoInsumos = new PantallaIngresoInsumos();
		miPanIngresoInsumos.setCoordinador(miCoordinador);
		miCoordinador.setmiPantallaIngresoInsumos(miPanIngresoInsumos);
		
		PantallaIngresoInsumosVarios miPantallaIngresoInsumosVarios = new PantallaIngresoInsumosVarios();
		miPantallaIngresoInsumosVarios.setCoordinador(miCoordinador);
		miCoordinador.setmiPantallaIngresoInsumosVarios(miPantallaIngresoInsumosVarios);
		
		PantallaNuevosInsumosImpresora miPantallaNuevoInsumoImpresora = new PantallaNuevosInsumosImpresora();
		miPantallaNuevoInsumoImpresora.setCoordinador(miCoordinador);
		miCoordinador.setmiPantallaNuevoInsumoImpresora(miPantallaNuevoInsumoImpresora);
		
		PantallaIngresosPorInsumo miPantallaIngresosPorInsumo = new PantallaIngresosPorInsumo();
		miPantallaIngresosPorInsumo.setCoordinador(miCoordinador);
		miCoordinador.setmiPantallaIngresosPorInsumo(miPantallaIngresosPorInsumo);
		
		PantallaIngresosPorProveedor miPantallaIngresosPorProveedor = new PantallaIngresosPorProveedor();
		miPantallaIngresosPorProveedor.setCoordinador(miCoordinador);
		miCoordinador.setmiPantallaIngresosPorProveedor(miPantallaIngresosPorProveedor);
		
		PantallaSalidaPorInsumos miPantallaSalidaPorInsumos =new PantallaSalidaPorInsumos();
		miPantallaSalidaPorInsumos.setCoordinador(miCoordinador);
		miCoordinador.setPantallaSalidaPorInsumos(miPantallaSalidaPorInsumos);
		
		PantallaSalidaPorServicio miPantallaSalidaPorServicio =new PantallaSalidaPorServicio();
		miPantallaSalidaPorServicio.setCoordinador(miCoordinador);
		miCoordinador.setPanatallaSalidaPorServicio(miPantallaSalidaPorServicio);
		
		PantallaNuevosInsumosVarios miPantallaNuevosInsumosVarios = new PantallaNuevosInsumosVarios();
		miPantallaNuevosInsumosVarios.setCoordinador(miCoordinador);
		miCoordinador.setPantallaNuevosInsumosVarios(miPantallaNuevosInsumosVarios);
		
		
		
		
		/*********************************************/
		miCoordinador.iniciarPantallaPricipal();
	}


		
}
