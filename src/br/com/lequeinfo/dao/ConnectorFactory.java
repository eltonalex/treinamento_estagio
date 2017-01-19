package br.com.lequeinfo.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorFactory {

	public void abreCnx() {

		try {
			
			DriverManager.getConnection("jdbc:mysql://localhost/cadastro", "root", "");
		
		} catch (SQLException e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}

}
