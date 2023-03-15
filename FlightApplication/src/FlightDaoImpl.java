
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

public class FlightDaoImpl implements FlightDao{

	private DataSource dataSource;
	public FlightDaoImpl() {}
	public DataSource getDataSource() {
		return dataSource;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
	}
	@Override
	public void save(Flight flight) {
		System.out.println(" This is Flight ticket information");
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		
		
	}

}
