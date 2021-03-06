package ventanas.insumos;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.border.BevelBorder;

//import logicaSistema.CargaComboBox;
import principal.Coordinador;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaNuevosInsumosImpresora extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField txtInsumos;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private JLabel lblInsumos;
	private JLabel lblTitulo;
	private Coordinador miCoordinador;
	private JComboBox<String> cmbMarca;
	private JLabel lblMarca;
	private JLabel lblModelo;
	private JComboBox<String> cmbModelo;

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

//	CargaComboBox cmb = new CargaComboBox();

	public PantallaNuevosInsumosImpresora() {
		getContentPane().setMaximumSize(new Dimension(450, 240));
		getContentPane().setMinimumSize(new Dimension(460, 250));
		getContentPane().setPreferredSize(new Dimension(450, 240));
		setMaximumSize(new Dimension(450, 240));
		setPreferredSize(new Dimension(450, 240));
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setMinimumSize(new Dimension(460, 250));
		setResizable(false);
		setModal(true);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		lblTitulo = new JLabel("Nuevo Insumo");
		lblTitulo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 11, 454, 25);
		getContentPane().add(lblTitulo);

		lblMarca = new JLabel("Marca:");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMarca.setBounds(10, 47, 62, 23);
		getContentPane().add(lblMarca);

		cmbMarca = new JComboBox<String>();
		cmbMarca.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbMarca.setFocusable(false);
		cmbMarca.setBounds(69, 49, 365, 21);
		getContentPane().add(cmbMarca);

		lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblModelo.setBounds(10, 81, 62, 23);
		getContentPane().add(lblModelo);

		cmbModelo = new JComboBox<String>();
		cmbModelo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbModelo.setFocusable(false);
		cmbModelo.setBounds(69, 81, 365, 23);
		getContentPane().add(cmbModelo);
		cmbModelo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//cmb.cargarCmbModelo(cmbModelo, cmbMarca);
			}
		});

		lblInsumos = new JLabel("Insumos:");
		lblInsumos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblInsumos.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblInsumos.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblInsumos.setBounds(10, 113, 62, 23);
		getContentPane().add(lblInsumos);

		txtInsumos = new JTextField();
		txtInsumos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtInsumos.setToolTipText("Ingrese el codigo del insumo de la impresora");
		txtInsumos.setBounds(69, 113, 365, 23);
		getContentPane().add(txtInsumos);
		txtInsumos.setColumns(10);

		btnAceptar = new JButton("");
		btnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAceptar.setIcon(new ImageIcon(PantallaNuevosInsumosImpresora.class.getResource("/iconos/aceptar-48px.png")));
		btnAceptar.setFocusable(false);
		btnAceptar.setFocusPainted(false);
		btnAceptar.setContentAreaFilled(false);
		btnAceptar.setBorderPainted(false);
		btnAceptar.setBorder(null);
		btnAceptar.setAlignmentX(0.5f);
		btnAceptar.setBounds(338, 147, 48, 48);
		getContentPane().add(btnAceptar);

		btnCancelar = new JButton("");
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setIcon(new ImageIcon(PantallaNuevosInsumosImpresora.class.getResource("/iconos/cerrar-ventana-48px.png")));
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
		btnCancelar.setBounds(396, 147, 48, 48);
		getContentPane().add(btnCancelar);

		//cmb.cargarCmbMarca(cmbMarca);
		btnAceptar.addActionListener(this);
		btnCancelar.addActionListener(this);
		cmbMarca.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cmbMarca) {
			//cmb.cargarCmbModelo(cmbModelo, cmbMarca);
		}
		if (e.getSource() == btnCancelar) {
			limpiar();
			dispose();
		}
		/*if (e.getSource() == btnAceptar) {
				if (!txtInsumos.getText().equals("")) {// verifico que no este vacio el campo del nombre
					if (!miCoordinador.existeInsumo(txtInsumos)) {// verifico que no exista ya cargado en BD
						if (miCoordinador.nuevoInsumo(cmbModelo, txtInsumos)) {// cargo en la BD el nueva Marca
							JOptionPane.showMessageDialog(null, "Insumo agregada con exito");
							txtInsumos.setText("");
							limpiar();
							dispose();
						} else {
							JOptionPane.showMessageDialog(null, "El insumo no se pudo agregar", "Advertencia",
									JOptionPane.WARNING_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(null,
								"El Insumo '" + txtInsumos.getText() + "'  ya se encuentra cargado");
						txtInsumos.setText("");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Debe agregar el Nombre del Insumo", "Advertencia",
							JOptionPane.ERROR_MESSAGE);
				}

			
		}*/
	}

	private void limpiar() {
		cmbMarca.setSelectedIndex(0);
		cmbModelo.removeAllItems();
		txtInsumos.setText("");
	}
}
