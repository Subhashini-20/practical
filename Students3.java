1.prepare students table with sid,sname, marks,course in my sql



sql query


use students

create table student(sid int,sname varchar(30),marks int,course varchar(50))


2.insert,update,delete,select operations on student table

insert into  student values(1,'regi',480,'computer science'),(2,'saki',390,'Biology'),(5,'sutha',500,'business')

select * from student

update student set sid=3 where sid=5

delete from student where sid=3



3.preparedstatement,statement interface methods on students table

statement interface:


package first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student1 {

	public static void main(String[] args)throws SQLException,ClassNotFoundException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "admin");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			
		}
				
		con.close();		
	}



preparedstatement:


package first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Student2 {

	public static void main(String[] args)throws SQLException,ClassNotFoundException
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "admin");
			PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?,?)");
			stmt.setInt(1,4);
			stmt.setString(2,"suthahar");
			stmt.setInt(3, 490);
			stmt.setString(4, "maths");
			int i=stmt.executeUpdate();
			System.out.println(i+"row inserted");
			con.close();
	}

}




}
