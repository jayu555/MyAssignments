package Day7.Assignment_Polymorphism;

public class APIClient {
	
	public void sendRequest(String endPoint) {
		
		System.out.println("endPoint : "+endPoint);
	}
	public void sendRequest(String endPoint, String requestBody, String requestStatus) {
		
		System.out.println("endPoint : "+endPoint+","+"requestBody : "+requestBody+","+"requestStatus : "+requestStatus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient api = new APIClient();
		api.sendRequest("Arjun");
		api.sendRequest("Kiran", "Java", "Anbu");

	}

}
