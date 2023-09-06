package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final String DATABASEURL ="jdbc:mysql://localhost:3306/petshop";
    private  static final String USER = "root";

    private static final  String PASSWORD = "";


    public static Connection conexaoMySQL()throws Exception{

        Connection connection = DriverManager.getConnection(DATABASEURL, USER, PASSWORD);

        return  connection;

    }

    public static void main(String[] args)throws Exception{

        Connection  connection = conexaoMySQL();

        if (connection!=null){
            System.out.println("Conectado com sucesso");

            connection.close();
        }
    }

}
