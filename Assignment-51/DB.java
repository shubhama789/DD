import java.sql.*;
public class DB{
    private static Connection con = null;
    public static void main(String[] args){
    try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con = DriverManager.getConnection("jdbc:odbc:S_DNS");
        if(con!=null){
            Statement stm = con.createStatement();
            stm.execute("create table data ( no number, name varchar(20) )");
            stm.execute("insert into data values(01,'Ankush')");
            stm.execute("insert into data values(02,'Rahul')");
            stm.execute("DELETE FROM data WHERE name='Rahul'");
           stm.execute("select * from data");
           ResultSet rs = stm.getResultSet();
           if (rs != null){
               while ( rs.next() ){
                   System.out.println("--------------------------------------" );
                   System.out.println("Roll Number : " + rs.getString(1) );
                   System.out.println("Name : " + rs.getString(2) );
             }
         }
        stm.execute("delete * from studentdata");
   }
   con.close();
} catch (Exception e) {
e.printStackTrace();
}
}
}


