package ventanas.impresoras;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

//import logicaSistema.CargaComboBox;
import principal.Coordinador;
import javax.swing.JRadioButton;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class PantallaEntregarImpresoraNuevaServicio extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblTitulo;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private JLabel lblModelo;
	private JLabel lblMarca;
	private JLabel lblServicio;
	private JComboBox<String> cmbModelo;
	private JComboBox<String> cmbMarca;
	private JComboBox<String> cmbServicio;
	private Coordinador miCoordinador;
	private JLabel lblSerie;
	private ButtonGroup grupo;
	private JTextField txtSerieImpresora;

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

	public PantallaEntregarImpresoraNuevaServicio() {
		setPreferredSize(new Dimension(490, 290));
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setMinimumSize(new Dimension(490, 290));
		setModal(true);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		lblTitulo = new JLabel("Asignar Impresora nueva al Servicio");
		lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblTitulo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitulo.setBounds(0, 11, 484, 25);
		getContentPane().add(lblTitulo);

		lblServicio = new JLabel("Servicio:");
		lblServicio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblServicio.setBounds(10, 48, 75, 23);
		getContentPane().add(lblServicio);

		lblMarca = new JLabel("Marca:");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMarca.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblMarca.setBounds(10, 82, 75, 23);
		getContentPane().add(lblMarca);

		lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblModelo.setBounds(10, 119, 75, 23);
		getContentPane().add(lblModelo);

		btnAceptar = new JButton("");
		btnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAceptar
				.setIcon(new ImageIcon(PantallaEntregarImpresoraNuevaServicio.class.getResource("/iconos/aceptar-48px.png")));
		btnAceptar.setFocusable(false);
		btnAceptar.setFocusPainted(false);
		btnAceptar.setContentAreaFilled(false);
		btnAceptar.setBorderPainted(false);
		btnAceptar.setBorder(null);
		btnAceptar.setAlignmentX(0.5f);
		btnAceptar.setBounds(350, 190, 48, 48);
		getContentPane().add(btnAceptar);
		btnAceptar.addActionListener(this);

		btnCancelar = new JButton("");
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setIcon(
				new ImageIcon(PantallaEntregarImpresoraNuevaServicio.class.getResource("/iconos/cerrar-ventana-48px.png")));
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
		btnCancelar.setBounds(416, 190, 48, 48);
		getContentPane().add(btnCancelar);
		btnCancelar.addActionListener(this);

		cmbServicio = new JComboBox<String>();
		cmbServicio.setFocusable(false);
		cmbServicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbServicio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cmbServicio.setBounds(92, 48, 372, 23);
		getContentPane().add(cmbServicio);
		cmbServicio.insertItemAt("Seleccione un Servicio", 0);
		cmbServicio.setSelectedIndex(0);
		cmbServicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent ev) {
				// cmb.cargarCmbServicio(cmbServicio);
				cmbServicio.insertItemAt("Seleccione un Servicio", 0);
				cmbServicio.setSelectedIndex(0);
				cmbMarca.removeAllItems();
				cmbMarca.insertItemAt("Seleccione una Marca", 0);
				cmbMarca.setSelectedIndex(0);
				cmbModelo.removeAllItems();
				cmbModelo.insertItemAt("Seleccione un Modelo", 0);
				cmbModelo.setSelectedIndex(0);
				
			}
		});

		cmbMarca = new JComboBox<String>();
		cmbMarca.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cmbMarca.setFocusable(false);
		cmbMarca.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbMarca.setBounds(92, 82, 372, 23);
		getContentPane().add(cmbMarca);
		cmbMarca.insertItemAt("Seleccione una Marca", 0);
		cmbMarca.setSelectedIndex(0);

		cmbModelo = new JComboBox<String>();
		cmbModelo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cmbModelo.setFocusable(false);
		cmbModelo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbModelo.setBounds(92, 119, 372, 23);
		getContentPane().add(cmbModelo);
		cmbModelo.insertItemAt("Seleccione un Modelo", 0);
		cmbModelo.setSelectedIndex(0);

		lblSerie = new JLabel("Serie:");
		lblSerie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSerie.setBounds(10, 152, 46, 23);
		getContentPane().add(lblSerie);
		
		txtSerieImpresora = new JTextField();
		txtSerieImpresora.setBounds(92, 153, 372, 20);
		getContentPane().add(txtSerieImpresora);
		txtSerieImpresora.setColumns(10);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnAceptar) {
			/*
			 * if(!chckbxActualizarSerie.isSelected()) { if (rdbtnAsignar.isSelected()) { if
			 * (cmbServicio.getSelectedIndex() > 0) { if (cmbMarca.getSelectedIndex() > 0) {
			 * if (cmbModelo.getSelectedIndex() > 0) { if (cmbSerie.getSelectedIndex() > 0)
			 * { if (miCoordinador.asignarImpresoraAServicio(cmbServicio, cmbMarca,
			 * cmbModelo, cmbSerie)) { dispose(); JOptionPane.showMessageDialog(null,
			 * "Impresora asignada al servicio: " +
			 * cmbServicio.getSelectedItem().toString()); limpiar();
			 * 
			 * } else { JOptionPane.showMessageDialog(null,
			 * "No se pudo asignar la impresora ", "Advertencia",
			 * JOptionPane.ERROR_MESSAGE); } } else { JOptionPane.showMessageDialog(null,
			 * "Debe seleccionar un numero de serie de impresora ", "Advertencia",
			 * JOptionPane.ERROR_MESSAGE); } } else { JOptionPane.showMessageDialog(null,
			 * "Debe seleccionar un Modelo de Impresora ", "Advertencia",
			 * JOptionPane.ERROR_MESSAGE); } } else { JOptionPane.showMessageDialog(null,
			 * "Debe seleccionar una Marca de Impresora ", "Advertencia",
			 * JOptionPane.ERROR_MESSAGE); } } else { JOptionPane.showMessageDialog(null,
			 * "Debe seleccionar un Servicio ", "Advertencia", JOptionPane.ERROR_MESSAGE); }
			 */
		}
		/*
		 * if (rdbtnDesasignar.isSelected()) { if (cmbServicio.getSelectedIndex() > 0) {
		 * if (cmbMarca.getSelectedIndex() > 0) { if (cmbModelo.getSelectedIndex() > 0)
		 * { if (cmbSerie.getSelectedIndex() > 0) { if
		 * (miCoordinador.desasignarImpresoraAServicio(cmbServicio, cmbMarca, cmbModelo,
		 * cmbSerie)) { JOptionPane.showMessageDialog(null,
		 * "Impresora desasignada del servicio: " +
		 * cmbServicio.getSelectedItem().toString()); limpiar(); dispose(); } else {
		 * JOptionPane.showMessageDialog(null, "No se pudo desasignar la impresora ",
		 * "Advertencia", JOptionPane.ERROR_MESSAGE); } } else {
		 * JOptionPane.showMessageDialog(null,
		 * "Debe seleccionar un numero de serie de impresora ", "Advertencia",
		 * JOptionPane.ERROR_MESSAGE); } } else { JOptionPane.showMessageDialog(null,
		 * "Debe seleccionar un Modelo de Impresora ", "Advertencia",
		 * JOptionPane.ERROR_MESSAGE); } } else { JOptionPane.showMessageDialog(null,
		 * "Debe seleccionar una Marca de Impresora ", "Advertencia",
		 * JOptionPane.ERROR_MESSAGE); } } else { JOptionPane.showMessageDialog(null,
		 * "Debe seleccionar un Servicio ", "Advertencia", JOptionPane.ERROR_MESSAGE); }
		 * } if (rdbtnDarDeBaja.isSelected()) { if (cmbServicio.getSelectedIndex() > 0)
		 * { if (cmbMarca.getSelectedIndex() > 0) { if (cmbModelo.getSelectedIndex() >
		 * 0) { if (cmbSerie.getSelectedIndex() > 0) { String nl =
		 * System.getProperty("line.separator"); int resp=JOptionPane.showConfirmDialog(
		 * null,"Esta seguro de dar de baja la impresora. "
		 * +nl+"Es irreversibe la acción de dar de baja"); if (JOptionPane.OK_OPTION ==
		 * resp){ if (miCoordinador.darDeBajaImpresora(cmbServicio, cmbMarca, cmbModelo,
		 * cmbSerie)) { JOptionPane.showMessageDialog(null, "Impresora dada de baja");
		 * limpiar(); dispose(); } else { JOptionPane.showMessageDialog(null,
		 * "No se pudo dada de baja la impresora ", "Advertencia",
		 * JOptionPane.ERROR_MESSAGE); } }else { limpiar();
		 * rdbtnAsignar.setSelected(true); }
		 * 
		 * } else { JOptionPane.showMessageDialog(null,
		 * "Debe seleccionar un numero de serie de impresora ", "Advertencia",
		 * JOptionPane.ERROR_MESSAGE); } } else { JOptionPane.showMessageDialog(null,
		 * "Debe seleccionar un Modelo de Impresora ", "Advertencia",
		 * JOptionPane.ERROR_MESSAGE); } } else { JOptionPane.showMessageDialog(null,
		 * "Debe seleccionar una Marca de Impresora ", "Advertencia",
		 * JOptionPane.ERROR_MESSAGE); } } else { JOptionPane.showMessageDialog(null,
		 * "Debe seleccionar un Servicio ", "Advertencia", JOptionPane.ERROR_MESSAGE); }
		 * } }else { if(cmbSerie.getSelectedIndex()>0) {
		 * if(!txtNuevaSerie.getText().equals("")) { String nl =
		 * System.getProperty("line.separator"); int resp=JOptionPane.showConfirmDialog(
		 * null,"Esta seguro de actualizar el numero de serie:"+nl
		 * +cmbSerie.getSelectedItem().toString() +"Por "+txtNuevaSerie.getText()); if
		 * (JOptionPane.OK_OPTION == resp){ if
		 * (miCoordinador.actualizarSerieImpresora(cmbSerie, txtNuevaSerie)) {
		 * JOptionPane.showMessageDialog(null, "Serie Actualizada"); limpiar();
		 * dispose(); } else { JOptionPane.showMessageDialog(null,
		 * "No se pudo actualizar la serie de la impresora ", "Advertencia",
		 * JOptionPane.ERROR_MESSAGE); } }else { limpiar();
		 * rdbtnAsignar.setSelected(true); } }else { JOptionPane.showMessageDialog(null,
		 * "Debe ingresar el nuevo numero de serie ", "Advertencia",
		 * JOptionPane.ERROR_MESSAGE); } }else { JOptionPane.showMessageDialog(null,
		 * "Debe seleccionar el numero de serie a modificar ", "Advertencia",
		 * JOptionPane.ERROR_MESSAGE); }
		 * 
		 * }
		 * 
		 * }
		 */

		if (e.getSource() == btnCancelar) {
			limpiar();
			dispose();
		}

	}

	private void limpiar() {
		cmbServicio.setSelectedIndex(0);
		cmbMarca.removeAllItems();
		cmbModelo.removeAllItems();
		cmbMarca.insertItemAt("Seleccione una Marca", 0);
		cmbMarca.setSelectedIndex(0);
		cmbModelo.insertItemAt("Seleccione un Modelo", 0);
		cmbModelo.setSelectedIndex(0);
	}
}
