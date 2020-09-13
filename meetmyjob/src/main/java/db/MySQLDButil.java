package db;

public class MySQLDButil {
	private static final String INSTANCE = "meetmyjob-db.cln3f5d3f05e.us-east-2.rds.amazonaws.com";
	private static final String PORT_NUM = "3306";
	public static final String DB_NAME = "meetmyjobDB";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "meetmyjob12345678";
	
	public static final String URL = "jdbc:mysql://"
			+ INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD
			+ "&autoReconnect=true&serverTimezone=UTC";
}
