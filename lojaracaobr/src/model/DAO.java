package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Camada model do modelo MVC
 * @author Pedro Noga
 *
 */

public class DAO {
	/*conecao com o banco de dados*/
	//Parâmetros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://10.26.49.102:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
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
	/* crud update */
	/* crud delete */
}
