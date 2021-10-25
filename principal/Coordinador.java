package principal;

/*Creado 
Erich Boerr
erichboerr@hotmail.com
17 oct 2021*/

import ventanas.Inicial;
import ventanas.servicios.*;
import ventanas.proveedores.*;
import ventanas.impresoras.*;
import ventanas.insumos.*;
import ventanas.estadisticas.*;


public class Coordinador {
	
	private Inicial miPantallaInicial;
	private PantallaNuevoServicio miPantallaNuevoServicio;
	private PantallaModificacionServicio miPantallaModificacionServicio;
	private PantallaNuevoProveedor MiPantallaNuevoProveedor;
	private PantallaModificacionProveedor MiPantallaModificarProveedor;
	private PantallaBajaProveedor miPantallaBajaProveedor;
	private PantallaNuevaImpresora miPantallaNuevaImpresora;
	private PantallaBajaImpresora miPantallaBajaImpresoraServicio;
	private PantallaQuitarImpresoraServicio miPantallaQuitarImpresoraServicio;
	private PantallaActualizarSerieImpresora miPantallaActualizarSerieImpresora;
	private PantallaMarca miPantallaMarca;
	private PantallaModelo miPantallaModelo;
	private PantallaIngresoInsumos miPantallaIngresoInsumos;
	private PantallaIngresoInsumosVarios miPantallaIngresoInsumosVarios;
	private PantallaSalidaInsumos miPantallaSalidaInsumos;
	private PantallaIngresoInsumosVarios miPantallaSalidaInsumosVarios;
	private PantallaNuevosInsumosImpresora miPantallaNuevoInsumoImpresora;
	private PantallaIngresosPorProveedor miPantallaIngresosPorProveedor;
	private PantallaIngresosPorInsumo miPantallaIngresosPorInsumos;
	private PantallaSalidaPorInsumos miPantallaSalidaPorInsumos;
	private PantallaSalidaPorServicio miPantallaSalidaPorServicio;
	private PantallaNuevosInsumosVarios miPantallaNuevosInsumosVarios;
	private PantallaEntregarImpresoraNuevaServicio miPantallaEntregarImpresoraNuevaServicio;
	private PantallaEntregarImpresoraUsadaServicio miPantallaEntregarImpresoraUsadaServicio;
	
	
	
	/*********************************************************************************************************/
	
	public void setInicial(Inicial miPantallaInicial) {
		this.miPantallaInicial = miPantallaInicial;
	}
	
	public void setmiPantallaNuevoServicio(ventanas.servicios.PantallaNuevoServicio miPantallaNuevoServicio) {
		this.miPantallaNuevoServicio = miPantallaNuevoServicio;
	}
	
	public void setmiPantallaModificacionServicio(ventanas.servicios.PantallaModificacionServicio miPantallaModificacionServicio) {
		this.miPantallaModificacionServicio = miPantallaModificacionServicio;
	}
	
	public void setMiPantallaNuevoProveedor(ventanas.proveedores.PantallaNuevoProveedor MiPantallaNuevoProveedor) {
		this.MiPantallaNuevoProveedor = MiPantallaNuevoProveedor;
	}
	
	public void setMiPantallaModificarProveedor(ventanas.proveedores.PantallaModificacionProveedor MiPantallaModificarProveedor) {
		this.MiPantallaModificarProveedor = MiPantallaModificarProveedor;
	}
	
	public void setmiPantallaBajaProveedor(ventanas.proveedores.PantallaBajaProveedor miPantallaBajaProveedor) {
		this.miPantallaBajaProveedor = miPantallaBajaProveedor;
	}
	
	public void setmiPantallaNuevaImpresora(ventanas.impresoras.PantallaNuevaImpresora miPantallaNuevaImpresora) {
		this.miPantallaNuevaImpresora = miPantallaNuevaImpresora;
	}
	
	public void miPantallaBajaImpresoraServicio(PantallaBajaImpresora miPantallaBajaImpresoraServicio) {
		this.miPantallaBajaImpresoraServicio=miPantallaBajaImpresoraServicio;		
	}
	
	public void miPantallaEntregarImpresoraNuevaServicio(PantallaEntregarImpresoraNuevaServicio miPantallaEntregarImpresoraNuevaServicio) {
		this.miPantallaEntregarImpresoraNuevaServicio = miPantallaEntregarImpresoraNuevaServicio;				
	}
	
	public void miPantallaEntregarImpresoraUsadaServicio(PantallaEntregarImpresoraUsadaServicio miPantallaEntregarImpresoraUsadaServicio) {
		this.miPantallaEntregarImpresoraUsadaServicio = miPantallaEntregarImpresoraUsadaServicio;				
	}
	
	public void miPantallaQuitarImpresoraServicio(PantallaQuitarImpresoraServicio miPantallaQuitarImpresoraServicio) {
		this.miPantallaQuitarImpresoraServicio = miPantallaQuitarImpresoraServicio;
	}
	
	public void setmiPantallaActualizarSerieImpresora(PantallaActualizarSerieImpresora miPantallaActualizarSerieImpresora) {
		this.miPantallaActualizarSerieImpresora = miPantallaActualizarSerieImpresora;		
	}
	
	public void setmiPantallaMarca(PantallaMarca miPantallaMarca) {
		this.miPantallaMarca = miPantallaMarca;		
	}
	
	public void setmiPantallaModelo(PantallaModelo  miPantallaModelo) {
		this.miPantallaModelo = miPantallaModelo;		
	}
	
	public void setmiPantallaIngresoInsumos(PantallaIngresoInsumos miPantallaIngresoInsumos) {
		this.miPantallaIngresoInsumos = miPantallaIngresoInsumos;		
	}
	
	public void setmiPantallaIngresoInsumosVarios(PantallaIngresoInsumosVarios miPantallaIngresoInsumosVarios ) {
		this.miPantallaIngresoInsumosVarios = miPantallaIngresoInsumosVarios; 
	}
	
	public void setmiPantallaSalidaInsumos(PantallaSalidaInsumos miPantallaSalidaInsumos) {
		this.miPantallaSalidaInsumos=miPantallaSalidaInsumos;
	}
	
	public void setmiPantallaSalidaInsumosvarios(PantallaIngresoInsumosVarios miPantallaSalidaInsumosVarios) {
		this.miPantallaSalidaInsumosVarios=miPantallaSalidaInsumosVarios;
	}
	
	public void setmiPantallaNuevoInsumoImpresora(PantallaNuevosInsumosImpresora miPantallaNuevoInsumoImpresora) {
		this.miPantallaNuevoInsumoImpresora=miPantallaNuevoInsumoImpresora;
	}
	
	public void setmiPantallaIngresosPorInsumo(PantallaIngresosPorInsumo miPantallaIngresosPorInsumos) {
		this.miPantallaIngresosPorInsumos = miPantallaIngresosPorInsumos;		
	}
	
	public void setmiPantallaIngresosPorProveedor(PantallaIngresosPorProveedor miPantallaIngresosPorProveedor) {
		this.miPantallaIngresosPorProveedor = miPantallaIngresosPorProveedor;		
	}
	
	public void setPantallaSalidaPorInsumos(PantallaSalidaPorInsumos miPantallaSalidaInsumos) {
		this.miPantallaSalidaPorInsumos = miPantallaSalidaInsumos;
	}
	
	public void setPanatallaSalidaPorServicio(PantallaSalidaPorServicio miPantallaSalidaPorServicio) {
		this.miPantallaSalidaPorServicio = miPantallaSalidaPorServicio;
	}
	
	public void setPantallaNuevosInsumosVarios(PantallaNuevosInsumosVarios miPantallaNuevosInsumosVarios) {
		this.miPantallaNuevosInsumosVarios = miPantallaNuevosInsumosVarios;
	}
	
	// vivibilidad de pantallas
	
	public void iniciarPantallaPricipal() {
		miPantallaInicial.setVisible(true);
	}
	
	public void iniciarPantallaNuevoServicio() {
		miPantallaNuevoServicio.setVisible(true);
	}
	
	public void iniciarPantallaModificacionServicio() {
		miPantallaModificacionServicio.setVisible(true);
	}
	
	public void iniciarPantallaNuevoProveedor() {
		MiPantallaNuevoProveedor.setVisible(true);
	}
	
	public void iniciarPantallaModificarProveedor() {
		MiPantallaModificarProveedor.setVisible(true);
	}
	
	public void iniciarPantallaBajaProveedor() {
		miPantallaBajaProveedor.setVisible(true);
	}
	
	public void iniciarPantallaNuevaImpresora() {
		miPantallaNuevaImpresora.setVisible(true);
	}

	public void iniciarPantallaBajaImpresoraServicio() {
		miPantallaBajaImpresoraServicio.setVisible(true);		
	}

	public void iniciarPantallaEntregarImpresoraNuevaServicio() {
		miPantallaEntregarImpresoraNuevaServicio.setVisible(true);		
	}
	public void iniciarPantallaEntregarImpresoraUsadaServicio() {
		miPantallaEntregarImpresoraUsadaServicio.setVisible(true);
	}
	
	public void iniciarPantallaActualizarSerieImpresora() {
		miPantallaActualizarSerieImpresora.setVisible(true);		
	}

	public void iniciarPantallaMarca() {
		miPantallaMarca.setVisible(true);
	}
	
	public void iniciarPantallaModelo() {
		miPantallaModelo.setVisible(true);
	}
	
	public void iniciarPantallaIngresoInsumos() {
		miPantallaIngresoInsumos.setVisible(true);
	}
	
	public void iniciarPantallaIngresoInsumosVarios() {
		miPantallaIngresoInsumosVarios.setVisible(true);
	}
	
	public void iniciarPantallaSalidaInsumos() {
		miPantallaSalidaInsumos.setVisible(true);
	}
	
	public void iniciarPantallaSalidaInsumosVarios() {
		miPantallaSalidaInsumosVarios.setVisible(true);
	}
	
	public void iniciarPantallaNuevoInsumoImpresora() {
		miPantallaNuevoInsumoImpresora.setVisible(true);		
	}
	
	public void iniciarPantallaIngresosPorProveedor() {
		miPantallaIngresosPorProveedor.setVisible(true);
	}
	
	public void iniciarPantallaIngresosPorInsumo() {
		miPantallaIngresosPorInsumos.setVisible(true);
	}
	
	public void iniciarPantallaSalidaPorInsumos() {	
		miPantallaSalidaPorInsumos.setVisible(true);
	}
	
	public void iniciarPantallaSalidaPorServicio() {
		miPantallaSalidaPorServicio.setVisible(true);
	}

	public void iniciarPantallaNuevoInsumoVarios() {
		miPantallaNuevosInsumosVarios.setVisible(true);
		
	}

	public void iniciarPantallaQuitarImpresoraServicio() {
		miPantallaQuitarImpresoraServicio.setVisible(true);
		
	}
	
}
