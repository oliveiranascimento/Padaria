import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TelaLogin extends Application
{		
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage stage)
	{
		// Criar os campos de texto
		TextField txtLogin = new TextField();
		TextField txtSenha = new TextField();

		// Definir o tamanho dos campos de texto
		txtLogin.setPrefColumnCount(10);
		txtSenha.setPrefColumnCount(10);	
		
		// Criar botões
		Button btnLogin = new Button("Login");
		Button btnSair = new Button("Sair");
		Button btnSobre = new Button("Sobre");
		
		// Definir largura dos botões
		btnLogin.setMinWidth(150);
		btnSair.setMinWidth(150);
		btnSobre.setMinWidth(150);
		
		// Adicionar evento aos botões
		// Botão Login
		btnLogin.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				Alert dialogoResultado = new Alert(Alert.AlertType.INFORMATION);
				dialogoResultado.setHeaderText("Login");
				if (txtLogin.getText().equals("Admin") && txtSenha.getText().equals("12345"))							
					dialogoResultado.setContentText("Sucesso");	            				
				else
					dialogoResultado.setContentText("Falhou");
				dialogoResultado.showAndWait();
				//Abrir tela principal
				Stage menuStage = new Stage();
				TelaPrincipal p = new TelaPrincipal();
				p.start(menuStage);				
				menuStage.show();				
			}
		});	
		
		// Botão Sair
		btnSair.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				stage.close();
			}
		});		
		
		// Botão Sobre
		btnSobre.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				Alert dialogoResultado = new Alert(Alert.AlertType.INFORMATION);
				dialogoResultado.setHeaderText("Sobre");
				dialogoResultado.setContentText("Cinthia\t081160033\nMichele\t081160025\nWagner\t082150393");
				dialogoResultado.showAndWait();
			}
		});	

		
		// Criar o gridpane
		GridPane root = new GridPane();
		
		// Definir alinhamento
		root.setAlignment(Pos.CENTER);;
		
		// Definir o espaçamento horizontal
		root.setHgap(10);
		
		// Definir o espaçamento vertical
		root.setVgap(5);

		// Adicionar labels e campos de texto ao gridpane				
		root.addRow(0, new Label("Login:"), txtLogin);
		root.addRow(1, new Label("Senha:"), txtSenha);
		root.addRow(2, new Label(""), btnLogin);
		root.addRow(3, new Label(""), btnSair);
		root.addRow(4, new Label(""), btnSobre);

		// Definir tamanho do grid pane
		root.setMinSize(640, 480);

		/* 
		 * Set the padding of the GridPane
		 * Set the border-style of the GridPane
		 * Set the border-width of the GridPane
		 * Set the border-insets of the GridPane
		 * Set the border-radius of the GridPane
		 * Set the border-color of the GridPane
		 */
		root.setStyle("-fx-padding: 10;" +
				"-fx-border-style: solid inside;" +
				"-fx-border-width: 2;" +
				"-fx-border-insets: 5;" +
				"-fx-border-radius: 5;" +
				"-fx-border-color: blue;");

		// Criar a scene
		Scene scene = new Scene(root);
		// Adicionar scene ao stage
		stage.setScene(scene);
		// Definir título
		stage.setTitle("Padaria - Login");
		// Mostrar tela
		stage.show();
	}
}