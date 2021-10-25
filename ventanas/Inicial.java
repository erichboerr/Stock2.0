package ventanas;

/*Creado 
Erich Boerr
erichboerr@hotmail.com
17 oct 2021*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import principal.Coordinador;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Inicial extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenuItem mntmAgregarServicio;
	private JMenuItem mntmModificarServicio;
	private JMenuItem mntmAgregarProveedor;
	private JMenuItem mntmModificarProveedor;
	private JMenuItem mntmEliminarProveedor;
	private JMenuItem mntmAgregarNuevaImpresora;
	private JMenuItem mntmEntregaImpresoraNueva;	
	private JMenuItem mntmIngresoInsumosImp;
	private JMenuItem mntmSalidaInsumosImp;
	private JMenuItem mntmIngresoInsumosVarios;
	private JMenuItem mntmSalidaInsumosVarios;
	private JMenuItem mntmStock;
	private JMenuItem mntmSalidasPorInsumo;
	private JMenuItem mntmSalidasPorServicio;
	private JMenuItem mntmingresoPorProveedor;
	private JMenuItem mntmingresoPorInsumo;
	private JLabel lblLogo;
	
	private Coordinador miCoordinador;
	private JMenuItem mntmActualizarSerie;
	private JMenuItem mntmBajaImpresora;
	private JMenuItem mntmnuevoInsumoImpresora;
	private JMenu mnInsumosImpresoras;
	private JMenu mnImpresoras;
	private JMenu mnInsumosVarios;
	private JMenu mnEstadisticas;
	private JMenu mnProveedores;
	private JMenu mnServicio;
	private JMenu mntmmovimientoXInsumo;
	private JMenu mntmmovimientoXProveedor;
	private JMenuItem mntmNuevoInsumoVarios;
	private JMenuItem mntmQuitarImpresoraDelServicio;
	private JMenuItem mntmEntregarImpresoraUsada;
	
	public Inicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 853, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		complementos();	
	}
	
	public void setCoodinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador; 
		
	}
	
	public void complementos() {
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 837, 22);
		contentPane.add(menuBar);
		
			mnServicio = new JMenu("Servicios");
			mnServicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			menuBar.add(mnServicio);
			
				mntmAgregarServicio = new JMenuItem("Agregar");
				mntmAgregarServicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnServicio.add(mntmAgregarServicio);
				mntmAgregarServicio.addActionListener(this);
				
				mntmModificarServicio = new JMenuItem("Modificar");
				mntmModificarServicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnServicio.add(mntmModificarServicio);
				mntmModificarServicio.addActionListener(this);
			
			mnProveedores = new JMenu("Proveedores");
			mnProveedores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			menuBar.add(mnProveedores);
			
				mntmAgregarProveedor = new JMenuItem("Agregar");
				mntmAgregarProveedor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnProveedores.add(mntmAgregarProveedor);
				mntmAgregarProveedor.addActionListener(this);
				
				mntmModificarProveedor = new JMenuItem("Modificar");
				mntmModificarProveedor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnProveedores.add(mntmModificarProveedor);
				mntmModificarProveedor.addActionListener(this);
				
				mntmEliminarProveedor = new JMenuItem("Eliminar");
				mntmEliminarProveedor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnProveedores.add(mntmEliminarProveedor);
				mntmEliminarProveedor.addActionListener(this);
				
			mnImpresoras = new JMenu("Impresoras");
			mnImpresoras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			menuBar.add(mnImpresoras);
			
				mntmAgregarNuevaImpresora = new JMenuItem("Agregar Nueva Impresora");
				mntmAgregarNuevaImpresora.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnImpresoras.add(mntmAgregarNuevaImpresora);
				mntmAgregarNuevaImpresora.addActionListener(this);
				
				mntmEntregaImpresoraNueva = new JMenuItem("Entregar Impresora Nueva");
				mntmEntregaImpresoraNueva.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnImpresoras.add(mntmEntregaImpresoraNueva);
				mntmEntregaImpresoraNueva.addActionListener(this);
				
				mntmEntregarImpresoraUsada = new JMenuItem("Entregar Impresora Usada");
				mntmEntregarImpresoraUsada.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnImpresoras.add(mntmEntregarImpresoraUsada);
				mntmEntregarImpresoraUsada.addActionListener(this);
				
				mntmQuitarImpresoraDelServicio = new JMenuItem("Quitar Impresora del Servicio");
				mntmQuitarImpresoraDelServicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnImpresoras.add(mntmQuitarImpresoraDelServicio);
				mntmQuitarImpresoraDelServicio.addActionListener(this);
				
				mntmActualizarSerie = new JMenuItem("Actualizar Serie Impresora");
				mntmActualizarSerie.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnImpresoras.add(mntmActualizarSerie);
				mntmActualizarSerie.addActionListener(this);
				
				mntmBajaImpresora = new JMenuItem("Dar de Baja Impresora");
				mntmBajaImpresora.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnImpresoras.add(mntmBajaImpresora);
				mntmBajaImpresora.addActionListener(this);
				
			mnInsumosImpresoras = new JMenu("Insumos de Impresoras");
			mnInsumosImpresoras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			menuBar.add(mnInsumosImpresoras);			
				
				mntmnuevoInsumoImpresora = new JMenuItem("Nuevo Insumo");
				mntmnuevoInsumoImpresora.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnInsumosImpresoras.add(mntmnuevoInsumoImpresora);
				mntmnuevoInsumoImpresora.addActionListener(this);
			
				mntmIngresoInsumosImp = new JMenuItem("Ingresar Insumos");
				mntmIngresoInsumosImp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnInsumosImpresoras.add(mntmIngresoInsumosImp);
				mntmIngresoInsumosImp.addActionListener(this);
				
				mntmSalidaInsumosImp = new JMenuItem("Salida Insumos");
				mntmSalidaInsumosImp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnInsumosImpresoras.add(mntmSalidaInsumosImp);
				mntmSalidaInsumosImp.addActionListener(this);
				
			mnInsumosVarios = new JMenu("Insumos Varios");
			mnInsumosVarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			menuBar.add(mnInsumosVarios);
				
				mntmNuevoInsumoVarios = new JMenuItem("Nuevo Insumo");
				mntmNuevoInsumoVarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnInsumosVarios.add(mntmNuevoInsumoVarios);
				mntmNuevoInsumoVarios.addActionListener(this);
			
				mntmIngresoInsumosVarios = new JMenuItem("Ingresar Insumos");
				mntmIngresoInsumosVarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnInsumosVarios.add(mntmIngresoInsumosVarios);
				mntmIngresoInsumosVarios.addActionListener(this);
				
				mntmSalidaInsumosVarios = new JMenuItem("Salida Insumos");
				mntmSalidaInsumosVarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnInsumosVarios.add(mntmSalidaInsumosVarios);
				mntmSalidaInsumosVarios.addActionListener(this);
				
			mnEstadisticas = new JMenu("Estadisticas");
			mnEstadisticas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			menuBar.add(mnEstadisticas);
			
				mntmStock = new JMenuItem("Consultar Stock");
				mntmStock.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnEstadisticas.add(mntmStock);
				mntmStock.addActionListener(this);
					
				mntmmovimientoXProveedor = new JMenu("Ingreso de Insumos");
				mntmmovimientoXProveedor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mnEstadisticas.add(mntmmovimientoXProveedor);
					
					mntmingresoPorInsumo = new JMenuItem("Ingreso por Insumo");
					mntmingresoPorInsumo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					mntmmovimientoXProveedor.add(mntmingresoPorInsumo);
					
						mntmingresoPorProveedor = new JMenuItem("Ingreso por Proveedor");
						mntmingresoPorProveedor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						mntmmovimientoXProveedor.add(mntmingresoPorProveedor);
						mntmingresoPorProveedor.addActionListener(this);
					
					mntmmovimientoXInsumo = new JMenu("Salida de Insumos");
					mntmmovimientoXInsumo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					mnEstadisticas.add(mntmmovimientoXInsumo);
					
							mntmSalidasPorInsumo = new JMenuItem("Salidas por Insumo");
							mntmSalidasPorInsumo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							mntmmovimientoXInsumo.add(mntmSalidasPorInsumo);
							mntmSalidasPorInsumo.addActionListener(this);
							
							mntmSalidasPorServicio = new JMenuItem("Salidas por Servicio");
							mntmSalidasPorServicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							mntmmovimientoXInsumo.add(mntmSalidasPorServicio);
							mntmSalidasPorServicio.addActionListener(this);
					mntmingresoPorInsumo.addActionListener(this);
					
		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Inicial.class.getResource("/Imagenes/Logo Soporte.jpg")));
		lblLogo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(198, 58, 443, 387);
		contentPane.add(lblLogo);			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mntmAgregarServicio) {
			miCoordinador.iniciarPantallaNuevoServicio();
		}
		if(e.getSource()==mntmModificarServicio) {
			miCoordinador.iniciarPantallaModificacionServicio();
		}		
		if(e.getSource()== mntmAgregarProveedor) {
			miCoordinador.iniciarPantallaNuevoProveedor();
		}
		if(e.getSource()==mntmModificarProveedor) {
			miCoordinador.iniciarPantallaModificarProveedor();
		}
		if(e.getSource()==mntmEliminarProveedor) {
			miCoordinador.iniciarPantallaBajaProveedor();
		}
		if(e.getSource()==mntmAgregarNuevaImpresora) {
			miCoordinador.iniciarPantallaNuevaImpresora();
		}
		if(e.getSource()== mntmActualizarSerie) {
			miCoordinador.iniciarPantallaActualizarSerieImpresora();
		}
		if(e.getSource()== mntmEntregaImpresoraNueva) {
			miCoordinador.iniciarPantallaEntregarImpresoraNuevaServicio();
		}
		if(e.getSource()== mntmEntregarImpresoraUsada) {
			miCoordinador.iniciarPantallaEntregarImpresoraUsadaServicio();
		}
		
		if(e.getSource()==mntmQuitarImpresoraDelServicio) {
			miCoordinador.iniciarPantallaQuitarImpresoraServicio();
		}
		if(e.getSource()==mntmBajaImpresora) {
			miCoordinador.iniciarPantallaBajaImpresoraServicio();
		}
		if(e.getSource()==mntmIngresoInsumosImp) {
			miCoordinador.iniciarPantallaIngresoInsumos();
		}
		if(e.getSource()==mntmSalidaInsumosImp) {
			miCoordinador.iniciarPantallaIngresoInsumos();
		}
		if(e.getSource()== mntmnuevoInsumoImpresora){
			miCoordinador.iniciarPantallaNuevoInsumoImpresora();
		}
		if(e.getSource()==mntmNuevoInsumoVarios) {
			miCoordinador.iniciarPantallaNuevoInsumoVarios();
		}
		if(e.getSource()==mntmIngresoInsumosVarios) {
			miCoordinador.iniciarPantallaIngresoInsumosVarios();
		}
		if(e.getSource()==mntmSalidaInsumosVarios) {
			miCoordinador.iniciarPantallaSalidaInsumosVarios();
		}
		if(e.getSource()==mntmStock) {
			
		}
		if(e.getSource()==mntmSalidasPorInsumo) {
			miCoordinador.iniciarPantallaSalidaPorInsumos();
		}
		if(e.getSource()==mntmSalidasPorServicio) {
			miCoordinador.iniciarPantallaSalidaPorServicio();
		}
		if(e.getSource()==mntmingresoPorProveedor) {
			miCoordinador.iniciarPantallaIngresosPorProveedor();
		}
		if(e.getSource()==mntmingresoPorInsumo) {
			miCoordinador.iniciarPantallaIngresosPorInsumo();
		}
		
	}
}
