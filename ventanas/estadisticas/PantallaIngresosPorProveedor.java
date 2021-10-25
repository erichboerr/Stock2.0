package ventanas.estadisticas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import com.toedter.calendar.JCalendar;

//import connection.ConnectionDB;
//import loggers.Logs;
//import logicaSistema.CargaComboBox;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperExportManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.engine.util.JRLoader;
//import net.sf.jasperreports.view.JasperViewer;
import principal.Coordinador;
import java.awt.Cursor;

public class PantallaIngresosPorProveedor extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JComboBox<String> cmbProveedor;
	private JLabel lblFechaDesde;
	private JLabel lblFechaHasta;
	private JLabel lblTitulo;
	private ButtonGroup grupo;
	private JCalendar calendarDesde;
	private JCalendar calendarHasta;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private int insumoId;
	private int anio;
	private int mes;
	private int dia;
	private Date fDesde = null;
	private Date fHasta = null;
	private String fechaDesde;
	private String fechaHasta;
	private Coordinador miCoordinador;
	
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

//	CargaComboBox cmb = new CargaComboBox();
	private int proveedorId;

	public PantallaIngresosPorProveedor() {
		setPreferredSize(new Dimension(460, 410));
		setResizable(false);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setAlwaysOnTop(false);
		setBounds(100, 100, 450, 410);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		contentPanel.setLayout(null);

		lblTitulo = new JLabel("Ingreso de Insumos por Proveedor");
		lblTitulo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblTitulo.setBounds(0, 10, 444, 28);
		contentPanel.add(lblTitulo);
		
		lblFechaDesde = new JLabel("Seleccione Fecha Desde");
		lblFechaDesde.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaDesde.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblFechaDesde.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFechaDesde.setBounds(10, 95, 194, 25);
		contentPanel.add(lblFechaDesde);

		cmbProveedor = new JComboBox<String>();
		cmbProveedor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbProveedor.setBounds(10, 56, 410, 28);
		contentPanel.add(cmbProveedor);

		lblFechaHasta = new JLabel("Seleccione Fecha Hasta");
		lblFechaHasta.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaHasta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFechaHasta.setBounds(216, 95, 204, 25);
		contentPanel.add(lblFechaHasta);

		calendarDesde = new JCalendar();
		calendarDesde.getDayChooser().getDayPanel().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		calendarDesde.getYearChooser().getSpinner().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		calendarDesde.getMonthChooser().getComboBox().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		calendarDesde.setBounds(10, 145, 198, 155);
		contentPanel.add(calendarDesde);		

		calendarHasta = new JCalendar();
		calendarHasta.getDayChooser().getDayPanel().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		calendarHasta.getYearChooser().getSpinner().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		calendarHasta.getMonthChooser().getComboBox().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		calendarHasta.setBounds(222, 145, 198, 155);
		contentPanel.add(calendarHasta);

		btnAceptar = new JButton("");
		btnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAceptar.setIcon(new ImageIcon(PantallaIngresosPorProveedor.class.getResource("/iconos/aceptar-48px.png")));
		btnAceptar.setFocusable(false);
		btnAceptar.setFocusPainted(false);
		btnAceptar.setContentAreaFilled(false);
		btnAceptar.setBorderPainted(false);
		btnAceptar.setBorder(null);
		btnAceptar.setAlignmentX(0.5f);
		btnAceptar.setBounds(301, 311, 48, 48);
		contentPanel.add(btnAceptar);
		btnAceptar.addActionListener(this);

		btnCancelar = new JButton("");
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar
				.setIcon(new ImageIcon(PantallaIngresosPorProveedor.class.getResource("/iconos/cerrar-ventana-48px.png")));
		btnCancelar.setSize(new Dimension(48, 48));
		btnCancelar.setPreferredSize(new Dimension(48, 48));
		btnCancelar.setMinimumSize(new Dimension(48, 48));
		btnCancelar.setMaximumSize(new Dimension(48, 48));
		btnCancelar.setFocusable(false);
		btnCancelar.setFocusPainted(false);
		btnCancelar.setContentAreaFilled(false);
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBorder(null);
		btnCancelar.setAlignmentX(0.5f);
		btnCancelar.setBounds(376, 311, 48, 48);
		contentPanel.add(btnCancelar);
		btnCancelar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	/*	if (e.getSource() == btnAceptar) {
			if (rdbtnPorInsumo.isSelected()) {
				if (cmbInsumo.getSelectedIndex() > 0) {
					insumoId = miCoordinador.insumoId(cmbInsumo);
					
					anio = calendarDesde.getCalendar().get(Calendar.YEAR);
					mes = calendarDesde.getCalendar().get(Calendar.MARCH) + 1;
					dia = calendarDesde.getCalendar().get(Calendar.DAY_OF_MONTH);
					fechaDesde = (anio + "-" + mes + "-" + dia);
					
					anio = calendarHasta.getCalendar().get(Calendar.YEAR);
					mes = calendarHasta.getCalendar().get(Calendar.MARCH) + 1;
					dia = calendarHasta.getCalendar().get(Calendar.DAY_OF_MONTH);
					fechaHasta = (anio + "-" + mes + "-" + dia);
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

					try {
						fDesde = formatter.parse(fechaDesde);
						fHasta = formatter.parse(fechaHasta);
						if (fDesde.before(fHasta)) {							
							dispose();							
							Map<String, Object> parametros = new HashMap<String, Object>();
							parametros.put("fechaDesde", fDesde);
							parametros.put("fechaHasta", fHasta);
							parametros.put("insumoId", insumoId);
							JasperReport reporte = (JasperReport) JRLoader
									.loadObject(getClass().getResource("/jrReportes/movIngresosInsumos.jasper"));
							JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametros,
									ConnectionDB.getConnection());
							JasperExportManager.exportReportToPdfFile(jasperPrint,
									"C:\\reportes\\movInsumo-(" + getFecha() + ")-" + numeroAleatorio() + ".pdf");
							JasperViewer viewer = new JasperViewer(jasperPrint, false);
							viewer.setVisible(true);

						}else {
							JOptionPane.showMessageDialog(null, "La Fecha DESDE no puede ser superior a la fecha HASTA", "Advertencia",
									JOptionPane.ERROR_MESSAGE);
						}
						
					} catch (JRException | ParseException ex) {
						String error = ex.getMessage();
						Logs miLogs = new Logs();
						miLogs.cargarArchivo(error);
						System.out.println("error al generar el reporte " + ex.getMessage());
					}

				} else {
					JOptionPane.showMessageDialog(null, "Debe seleccionar un Insumo para la estadistica", "Advertencia",
							JOptionPane.ERROR_MESSAGE);
				}
			} else {// rdbtnProveedor seleccionado
				if (cmbProveedor.getSelectedIndex() > 0) {
					proveedorId = miCoordinador.idProveedor(cmbProveedor);
					anio = calendarDesde.getCalendar().get(Calendar.YEAR);
					mes = calendarDesde.getCalendar().get(Calendar.MARCH) + 1;
					dia = calendarDesde.getCalendar().get(Calendar.DAY_OF_MONTH);

					fechaDesde = (anio + "-" + mes + "-" + dia);
					anio = calendarHasta.getCalendar().get(Calendar.YEAR);
					mes = calendarHasta.getCalendar().get(Calendar.MARCH) + 1;
					dia = calendarHasta.getCalendar().get(Calendar.DAY_OF_MONTH);
					fechaHasta = (anio + "-" + mes + "-" + dia);
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
					try {

						fDesde = formatter.parse(fechaDesde);
						fHasta = formatter.parse(fechaHasta);
						if (fDesde.before(fHasta)) {
							Map<String, Object> parametros = new HashMap<String, Object>();
							parametros.put("fechaDesde", fDesde);
							parametros.put("fechaHasta", fHasta);
							parametros.put("proveedorId", proveedorId);
							JasperReport reporte = (JasperReport) JRLoader
									.loadObject(getClass().getResource("/jrReportes/movIngresosProveedor.jasper"));

							JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametros,
									ConnectionDB.getConnection());
							JasperExportManager.exportReportToPdfFile(jasperPrint,
									"C:\\reportes\\movIngresosInsumos-(" + getFecha() + ")-" + numeroAleatorio() + ".pdf");
							JasperViewer viewer = new JasperViewer(jasperPrint, false);
							viewer.setVisible(true);
						}else {
							JOptionPane.showMessageDialog(null, "La Fecha DESDE no puede ser superior a la fecha HASTA", "Advertencia",
									JOptionPane.ERROR_MESSAGE);
						}
						

					} catch (JRException | ParseException ex) {
						String error = ex.getMessage();
						Logs miLogs = new Logs();
						miLogs.cargarArchivo(error);
						System.out.println("error al generar el reporte " + ex.getMessage());
					}

				} else {
					JOptionPane.showMessageDialog(null, "Debe seleccionar un Proveedor para la estadistica",
							"Advertencia", JOptionPane.ERROR_MESSAGE);
				}
			}
		}*/
		if (e.getSource() == btnCancelar) {
			limpiar();
			dispose();
		}

	}

	private void limpiar() {		
		cmbProveedor.setEnabled(false);
		cmbProveedor.removeAllItems();
	}

	private static String getFecha() {
		Date fechaActual = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yy");
		return formateador.format(fechaActual);
	}

	private int numeroAleatorio() {
		int valorEntero = (int) Math.floor(Math.random() * (999 - 1 + 1) + 1);
		return valorEntero;
	}
}
