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

public class TelaPrincipal extends Application
{		
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage stage)
	{
		
		// Criar botões
		Button btnUsuarios = new Button("Usuários");
		Button btnClientes = new Button("Clientes");
		Button btnProdutos = new Button("Produtos");
		Button btnPedidos = new Button("Pedidos");
		
		// Definir tamanho dos botões
		btnUsuarios.setMinWidth(150);
		btnUsuarios.setMinHeight(50);
		btnClientes.setMinWidth(150);
		btnClientes.setMinHeight(50);
		btnProdutos.setMinWidth(150);
		btnProdutos.setMinHeight(50);
		btnPedidos.setMinWidth(150);
		btnPedidos.setMinHeight(50);
		
		// Adicionar evento aos botões		
		// Botão Usuários
		btnUsuarios.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{				
				//Abrir tela Usuários
				Stage menuStage = new Stage();
				TelaUsuarios p = new TelaUsuarios();
				p.start(menuStage);				
				menuStage.show();		
			}
		});
		
		// Botão Clientes
		btnClientes.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				//Abrir tela Clientes
				Stage menuStage = new Stage();
				TelaClientes p = new TelaClientes();
				p.start(menuStage);				
				menuStage.show();	
			}
		});	
		
		// Botão Produtos
		btnProdutos.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				//Abrir tela Produtos
				Stage menuStage = new Stage();
				TelaProdutos p = new TelaProdutos();
				p.start(menuStage);				
				menuStage.show();	
			}
		});	
		
		// Botão Pedidos
		btnPedidos.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override public void handle(ActionEvent e) 
			{
				//Abrir tela Pedidos
				Stage menuStage = new Stage();
				TelaPedidos p = new TelaPedidos();
				p.start(menuStage);				
				menuStage.show();	
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
		root.addRow(0, btnUsuarios, btnClientes);
		root.addRow(1, btnProdutos, btnPedidos);		

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
		stage.setTitle("Padaria - Menu");
		// Mostrar tela
		stage.show();
	}
}