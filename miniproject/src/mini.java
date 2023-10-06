import java.sql.*;

public class mini {
public static void main(String[]args) throws Exception{
	
insertData();

}
public static void insertData() throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/student";
	String username="root";
	String password="3396";
	String Query="insert into lokeshkanagaraj values(?,?,?,?)";
	Connection con=DriverManager.getConnection(url, username, password);
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setString(1, "2017");
	pst.setString(2, "2019");
	pst.setString(3, "2022");
	pst.setString(4, "not released");
	pst.executeUpdate();
	
	con.close();

}



}

