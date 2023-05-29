package in.ashokit.generator;


import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;


public class OrderIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix="OD";
		String suffix="";
		try {
			 Connection con=session.connection();
			 Statement stm=con.createStatement();
			 String sql="select * order_id_seq.nextval from dual";
			 ResultSet rs=stm.executeQuery(sql);
			 if(rs.next())
			 {
				 int seqval=rs.getInt(1);
				 suffix=String.valueOf(seqval);
			 }
			 
			
		}catch(Exception e) {
			
		}
		return prefix+suffix;
	}

	
	

}
