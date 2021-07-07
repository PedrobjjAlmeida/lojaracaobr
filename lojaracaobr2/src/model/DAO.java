package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Camada model do modelo MVC
 * @author Pedro Noga
 *
 */

public class DAO {
	/*conecao com o banco de dados*/
	//Parâmetros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://10.26.49.102:3306/dbloja?useTimezone=true&serverTimezone=UTC";
	private String user = "dba";
	private String password = "Senac@123456";

	/**
	 * conexao com o banco
	 * @return con
	 */
	
	private Connection conectar() {
		//criando o objeto de nome con e atribuindo nulo (porta da geladeira fechada)
		Connection con = null;
		//tratamento de exceçoes
		try {
			//ativacao do driver
			Class.forName(driver);
			//conexao estabelecida
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	/**
	 * teste de conexao
	 */
	public void testarConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/* crud create */
	/* crud read */
	public ArrayList<JavaBeans> listarProdutos(){
		//Criar um objeto para armazenar a lista no javaBeans
		ArrayList<JavaBeans> javabeans = new ArrayList<>();
		//Criar uma Variável para executar a query (comando do banco de dados)
		String read = "select * from produtos order by nomeproduto";
		//tratamento de exceções(não é possível a resolução pelo desenvolvedor)
		try {
			//se tudo ok
			//abrir a conexão com o banco("abrir a porta da geladeira")
			Connection con = conectar();
			//preparar a conexão (execução do query (comando sql))
			PreparedStatement pst = con.prepareStatement(read);
			//executar a query(comando) - Passo 3
			ResultSet rs = pst.executeQuery();
			//enquanto houver produtos no banco
			while (rs.next()) {
				//aramazenar os produtos na lista(ArrayList) JavaBeans (Passo 4)
				String idpro = rs.getString(1);
				String produto = rs.getString(2);
				String tipo = rs.getString(3);
				String quantidade = rs.getString(4);
				String valor = rs.getString(5);
				//Passo 5 
				javabeans.add(new JavaBeans(idpro,produto,tipo,quantidade,valor));
				//teste de recebimento da listagem do banco
				//System.out.println(rs.getString(1));
				//System.out.println(rs.getString(2));
				//System.out.println(rs.getString(3));
				//System.out.println(rs.getString(4));
				//System.out.println(rs.getString(5));
			}
			//fechar a conexão ("fechar a porta da geladeira")
			con.close();
			return javabeans;
		} catch (Exception e) {
			//caso ocorra uma exceção, mostrar(e);
			//System.out.println -> escrever no console ("só o desenvolvedor")
			System.out.println(e);
			//Encerrar a conexão "fechar a porta da geladeira"
			return null;
		}
	}
	/* crud update */
	/* crud delete */
}
