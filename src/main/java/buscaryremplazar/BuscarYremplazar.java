package buscaryremplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYremplazar extends Application {

	private Label buscarLabel, remplazarLabel;
	private Button buscar, reemplazar, reemplazarTodo, cerrar, ayuda;
	private TextField buscarTextField, remplazarTextField;
	private CheckBox mayusMinChk, resaltResultChk, exprRegulChk, buscAtraChk;

	@Override
	public void start(Stage primaryStage) throws Exception {

		buscarTextField = new TextField();
		buscarTextField.setPrefColumnCount(4);
		buscarLabel = new Label("Buscar: ");

		remplazarTextField = new TextField();
		remplazarTextField.setPrefColumnCount(4);
		remplazarLabel = new Label("Remplazar con: ");

		buscar = new Button("Buscar");
		buscar.setPrefWidth(125);
		buscar.setPrefHeight(30);

		reemplazar = new Button("Reemplazar");
		reemplazar.setPrefWidth(125);
		reemplazar.setPrefHeight(30);

		reemplazarTodo = new Button("Reemplazar todo");
		reemplazarTodo.setPrefWidth(125);
		reemplazarTodo.setPrefHeight(30);

		cerrar = new Button("Cerrar");
		cerrar.setPrefWidth(125);
		cerrar.setPrefHeight(30);

		ayuda = new Button("Ayuda");
		ayuda.setPrefWidth(125);
		ayuda.setPrefHeight(30);

		mayusMinChk = new CheckBox("Mayusculas y Minusculas");
		resaltResultChk = new CheckBox("Resaltar Resultado");
		exprRegulChk = new CheckBox("Exprecion Regular");
		buscAtraChk = new CheckBox("Buscar Hacia Atras");

		VBox labelVBox = new VBox();
		labelVBox.setSpacing(5);
		labelVBox.getChildren().addAll(buscarLabel, remplazarLabel);

		VBox checkboxVBoxArriba = new VBox();
		checkboxVBoxArriba.setSpacing(5);
		checkboxVBoxArriba.getChildren().addAll(mayusMinChk, exprRegulChk);

		VBox checkboxVBoxAbajo = new VBox();
		checkboxVBoxAbajo.setSpacing(5);
		checkboxVBoxAbajo.getChildren().addAll(resaltResultChk, buscAtraChk);

		HBox checkboxHBoxContains = new HBox();
		checkboxHBoxContains.setSpacing(5);
		checkboxHBoxContains.getChildren().addAll(checkboxVBoxArriba, checkboxVBoxAbajo);

		VBox buttonsVBox = new VBox();
		buttonsVBox.setSpacing(5);
		buttonsVBox.getChildren().addAll(buscar, reemplazar, reemplazarTodo, cerrar, ayuda);

		VBox textFieldHBox = new VBox();
		textFieldHBox.setSpacing(5);
		textFieldHBox.getChildren().addAll(buscarTextField, remplazarTextField, checkboxHBoxContains);

		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(5));
		gridPane.setVgap(5);
		gridPane.setHgap(5);
		gridPane.setGridLinesVisible(false);

		gridPane.addRow(0, labelVBox, textFieldHBox, buttonsVBox);
		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), new ColumnConstraints() };
		gridPane.getColumnConstraints().setAll(cols);
		cols[1].setHalignment(HPos.CENTER);
		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setFillWidth(true);

		Scene escena = new Scene(gridPane, 640, 480);
		primaryStage.setScene(escena);
		primaryStage.setTitle("Buscar y Reemplazar");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
