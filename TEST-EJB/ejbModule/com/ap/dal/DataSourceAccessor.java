package com.ap.dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

public class DataSourceAccessor {

	public static Connection getConnection() {
		Context ctx = null;
		Hashtable ht = new Hashtable();
		ht.put(Context.INITIAL_CONTEXT_FACTORY,
				"weblogic.jndi.WLInitialContextFactory");
		ht.put(Context.PROVIDER_URL, "t3://hostname:port");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
//			ctx = new InitialContext(ht);
			ctx = new InitialContext();
			javax.sql.DataSource ds = (javax.sql.DataSource) ctx
					.lookup("ATCS_DATA_SOURCE");
			conn = ds.getConnection();
			return conn;
			// You can now use the conn object to create
			// Statements and retrieve result sets:
			/*
			 * stmt = conn.createStatement();
			 * stmt.execute("select * from dbo.CHARGE_REQUESTS"); rs =
			 * stmt.getResultSet();
			 * 
			 * // Close JDBC objects as soon as possible stmt.close(); stmt =
			 * null; conn.close(); conn = null;
			 */
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
