
import java.sql.*;


public class Mini1 {
	public static void main(String[]args)throws Exception{
		getData();
	}
	public static void getData() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/student";
		String username="root";
		String password="3396";
		String Query="select * from lokeshkanagaraj";
		Connection con=DriverManager.getConnection(url, username, password);
		Statement pst=con.createStatement();
		ResultSet rst=pst.executeQuery(Query);
	 while(rst.next()) {
		 System.out.println("MANAGARAM IS"+rst.getString(1));
		 System.out.println("KAITHI IS"+rst.getString(2));
		 System.out.println("VIKRAM IS"+rst.getString(3));
		 System.out.println("LEO IS"+rst.getString(4));
	 }
		con.close();

	}
}




