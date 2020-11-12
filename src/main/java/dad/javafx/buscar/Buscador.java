package dad.javafx.buscar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class Buscador extends Application {

	private Button buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton;
	private TextField buscarText, reemplazarText;
	private CheckBox mayMinusCheck, exprRegularCheck, buscarAtrasCheck, resaltarResulCheck;

	@Override
	public void start(Stage primaryStage) throws Exception {
		buscarButton = new Button("Buscar");
		reemplazarButton = new Button("Reemplazar");
		reemplazarTodoButton = new Button("Reemplazar todo");
		cerrarButton = new Button("Cerrar");
		ayudaButton = new Button("Ayuda");
		buscarButton.setMaxWidth(Double.MAX_VALUE);
		reemplazarButton.setMaxWidth(Double.MAX_VALUE);
		reemplazarTodoButton.setMaxWidth(Double.MAX_VALUE);
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		ayudaButton.setMaxWidth(Double.MAX_VALUE);

		buscarText = new TextField();
		reemplazarText = new TextField();

		mayMinusCheck = new CheckBox("Mayúsculas y minúsculas");
		exprRegularCheck = new CheckBox("Expresión regular");
		buscarAtrasCheck = new CheckBox("Buscar hacia atrás");
		resaltarResulCheck = new CheckBox("Resaltar resultados");

		GridPane buscarGrid = new GridPane();
		buscarGrid.setPadding(new Insets(5));
		buscarGrid.setHgap(5);
		buscarGrid.setVgap(5);
		buscarGrid.addRow(0, new Label("Buscar:"), buscarText);
		buscarGrid.addRow(1, new Label("Reemplazar con:"), reemplazarText);
		buscarGrid.add(mayMinusCheck, 1, 2);
		buscarGrid.add(buscarAtrasCheck, 2, 2);
		buscarGrid.add(exprRegularCheck, 1, 3);
		buscarGrid.add(resaltarResulCheck, 2, 3);
		buscarGrid.add(buscarButton, 3, 0);
		buscarGrid.add(reemplazarButton, 3, 1);
		buscarGrid.add(reemplazarTodoButton, 3, 2);
		buscarGrid.add(cerrarButton, 3, 3);
		buscarGrid.add(ayudaButton, 3, 4);

		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), new ColumnConstraints(), };
		buscarGrid.getColumnConstraints().setAll(cols);

		cols[2].setHgrow(Priority.ALWAYS);
		cols[2].setFillWidth(true);

		
		GridPane.setColumnSpan(buscarText, 2); 
		GridPane.setColumnSpan(reemplazarText, 2);
		

		Scene scene = new Scene(buscarGrid, 500, 200);

		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
