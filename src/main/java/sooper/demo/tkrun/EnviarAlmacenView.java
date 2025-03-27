package sooper.demo.tkrun;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class EnviarAlmacenView {
	protected JFrame frmSupermercado;
	private JTable table;
	private DefaultTableModel añadirArticulo; // e) El modelo de la tabla hay que declararlo como atributo de la clase vista correspondiente e inicializarlo con las columnas
											  // que toquen antes de asignárselo a la tabla mediante un setModel()
	
	public EnviarAlmacenView() { // a) Inicialización de la vista para que se muestre en la pantalla
		initialize();
	}

	private void initialize() {
		frmSupermercado = new JFrame();
		frmSupermercado.setBounds(0, 0, 400, 500); // b) Tamaño de la ventana tiene que ser de 400x500 
		frmSupermercado.getContentPane().setLayout(null);
		
		Label label = new Label("Artículos a embolsar"); // c) Una etiqueta en la parte superior con el texto que aparece en la captura de pantalla
		label.setFont(new Font("Dialog", Font.BOLD, 12));
		label.setBounds(10, 9, 167, 23);
		frmSupermercado.getContentPane().add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 38, 364, 376);
		frmSupermercado.getContentPane().add(scrollPane);
		
		table = new JTable(); // d) Una tabla que me muestre la cabecera tal y como aparece en la captura de pantalla
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"  idArticulo", " idContenedor"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Añadir Artículo"); // f) Un botón bajo la tabla tal y como se muestra en la captura de pantalla
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(10, 427, 125, 23);
		frmSupermercado.getContentPane().add(btnNewButton);
		
	}


}

