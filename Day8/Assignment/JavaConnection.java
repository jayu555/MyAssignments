package Day8.Assignment;

public class JavaConnection extends MySqlConnection implements Database{
	
	@Override
	public void connect() {
		System.out.println("Connect with selenium session");
		
	}

	@Override
	public void disConnect() {
		System.out.println("Disconnected from the Internet");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Maven updates are in progress");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("SQL inputs are executed");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disConnect();
		jc.executeUpdate();
		jc.executeQuery();
		}

	}


