import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TelaClientes extends Application
{		
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage stage)
	{
		// Criar os campos de texto
		TextField txtID = new TextField();
		TextField txtNome = new TextField();
		TextField txtTelefone = new TextField();
		TextField txtEmail = new TextField();
		TextField txtEndereco = new TextField();
		TextField txtNumero = new TextField();
		TextField txtComplemento = new TextField();
		TextField txtBairro = new TextField();
		TextField txtCidade = new TextField();
		TextField txtCEP = new TextField();

		// Definir o tamanho dos campos de texto
		txtID.setPrefColumnCount(10);
		txtNome.setPrefColumnCount(10);
		txtTelefone.setPrefColumnCount(10);
		txtEmail.setPrefColumnCount(10);	
		txtEndereco.setPrefColumnCount(10);	
		txtNumero.setPrefColumnCount(10);	
		txtComplemento.setPrefColumnCount(10);
		txtBairro.setPrefColumnCount(10);
		txtCidade.setPrefColumnCount(10);
		txtCEP.setPrefColumnCount(10);
		
		
		// Criar botões
		Button btnIncluir = new Button("Incluir");
		Button btnAlterar = new Button("Alterar");
		Button btnExcluir = new Button("Excluir");
		Button btnSalvar = new Button("Salvar");
		Button btnCancelar = new Button("Cancelar");
		Button btnPrimeiro = new Button("<<");
		Button btnAnterior = new Button("<");
		Button btnProximo = new Button(">");
		Button btnUltimo = new Button(">>");
		Button btnPesquisar = new Button("Pesquisar");
		
		// Definir largura dos botões
		double btnLargura = 90;
		btnIncluir.setMinWidth(btnLargura);		
		btnAlterar.setMinWidth(btnLargura);
		btnExcluir.setMinWidth(btnLargura);
		btnSalvar.setMinWidth(btnLargura);
		btnCancelar.setMinWidth(btnLargura);
		btnPrimeiro.setMinWidth(btnLargura);
		btnAnterior.setMinWidth(btnLargura);
		btnProximo.setMinWidth(btnLargura);
		btnUltimo.setMinWidth(btnLargura);
		btnPesquisar.setMinWidth(btnLargura);
				
		// Adicionar evento aos botões
		
		//Preencher
		
		// Criar o gridpane
		GridPane root = new GridPane();		
		
		// Definir alinhamento
		root.setAlignment(Pos.TOP_CENTER);;
		
		// Definir o espaçamento horizontal
		root.setHgap(10);
		
		// Definir o espaçamento vertical
		root.setVgap(30);
		
		// Mostrar o grid (Apenas para debugar)
		//root.setGridLinesVisible(true);

		// Adicionar labels e campos de texto ao gridpane				
		root.add(btnIncluir, 0, 0);
		root.add(btnAlterar, 1, 0);
		root.add(btnExcluir, 2, 0);
		root.add(btnSalvar, 3, 0);
		root.add(btnCancelar, 4, 0);
		root.add(btnPrimeiro, 5, 0);
		root.add(btnAnterior, 6, 0);
		root.add(btnProximo, 7, 0);
		root.add(btnUltimo, 8, 0);
		root.add(btnPesquisar, 9, 0);
		root.add(new Label("ID:"), 0, 1);
		root.add(txtID, 1, 1, 2, 1);
		root.add(new Label("Nome:"), 3, 1);
		root.add(txtNome, 4, 1, 6, 1);
		root.add(new Label("Telefone:"), 0, 2);
		root.add(txtTelefone, 1, 2, 2, 1);
		root.add(new Label("Email:"), 3, 2);
		root.add(txtEmail, 4, 2, 6, 1);
		root.add(new Label("Endereço:"), 0, 3);
		root.add(txtEndereco, 1, 3, 4, 1);
		root.add(new Label("Número:"), 5, 3);
		root.add(txtNumero, 6, 3, 4, 1);
		root.add(new Label("Complemento:"), 0, 4);
		root.add(txtComplemento, 1, 4, 4, 1);
		root.add(new Label("Bairro:"), 5, 4);
		root.add(txtBairro, 6, 4, 4, 1);		
		root.add(new Label("Cidade:"), 0, 5);
		root.add(txtCidade, 1, 5, 4, 1);
		root.add(new Label("CEP:"), 5, 5);
		root.add(txtCEP, 6, 5, 4, 1);

		// Definir tamanho do grid pane
		root.setMinSize(800, 600);

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
		stage.setTitle("Padaria - Clientes");
		// Mostrar tela
		stage.show();
	}
}