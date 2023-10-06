import java.sql.*;

public class Mini2 {

	public static void main(String[]args)throws Exception{
		UpdateData();
	}
	public static void UpdateData() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/student";
		String username="root";
		String password="3396";
		String Query="update lokeshkanagaraj set leo='released' where kaithi='2019'";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
        int rows=pst.executeUpdate();
        System.out.println(rows);
		con.close();

	}
}




