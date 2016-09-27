package devCamp.WebApp.Utils;

import org.springframework.beans.factory.annotation.Value;

public class StorageHelper {

	//configuration values from the system Environment
	@Value("#{systemEnvironment['AZURE_STORAGE_ACCOUNT']}")
	static String account;
	@Value("#{systemEnvironment['AZURE_STORAGE_ACCESS_KEY']}")
	static String key;
	@Value("#{systemEnvironment['AZURE_STORAGE_BLOB_CONTAINER']}")
	static String AZURE_STORAGE_BLOB_CONTAINER;
	@Value("#{systemEnvironment['AZURE_STORAGE_QUEUE']}")
	static String AZURE_STORAGE_QUEUE;

	static String bloblStorageConnectionString = String.format("DefaultEndpointsProtocol=https;AccountName=%s;accountKey=%s", account,key);
		
	public static String AddMessageToQueue(String IncidentID, String ImageFileName)
	{
		
		return null;
	}
	
	public static String UploadFileToBlobStorage(String IncidentID, String imageFile){

		
		return null;
		
	}
}
