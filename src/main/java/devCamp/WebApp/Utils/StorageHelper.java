package devCamp.WebApp.Utils;

import org.springframework.beans.factory.annotation.Value;

public class StorageHelper {

	//configuration values from the system Environment
	private String account;
	private String key;
	private String AZURE_STORAGE_BLOB_CONTAINER;
	private String AZURE_STORAGE_QUEUE;
	private static String blobStorageConnectionString;
	
	public StorageHelper() {
		
		account = System.getenv("INCIDENT_API_URL");;
		key = System.getenv("AZURE_STORAGE_ACCESS_KEY");;
		AZURE_STORAGE_QUEUE = System.getenv("AZURE_STORAGE_QUEUE");
		AZURE_STORAGE_BLOB_CONTAINER = System.getenv("AZURE_STORAGE_BLOB_CONTAINER");
		blobStorageConnectionString = String.format("DefaultEndpointsProtocol=https;AccountName=%s;accountKey=%s", account,key);
	}

	
	
	public static String AddMessageToQueue(String IncidentID, String ImageFileName)
	{
		
		return null;
	}
	
	public static String UploadFileToBlobStorage(String IncidentID, String imageFile){

		
		return null;
		
	}

}
