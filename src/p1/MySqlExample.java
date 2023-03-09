package p1;
import java.sql.*;
public class MySqlExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","Root112");
		Statement stmt= con.createStatement();
		String query="select emp.EmpId, emp.FirstName, emp.LastName, dep.deptId ,dep.deptName from employee emp, department dep where emp.deptId=dep.deptId";
		ResultSet rs= stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString("deptId"));
			System.out.println(rs.getString(3));
		}
		
		//stmt.executeUpdate("INSERT INTO Employee VALUES(3,'Nidhi','Tohronton','nidhitohronton@gmail.com','9876543210',100000,1);");

	}

}

