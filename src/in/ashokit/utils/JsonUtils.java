package in.ashokit.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonUtils {
   
	private static ObjectMapper mapper;
	
	static {
		mapper = new ObjectMapper();
	}
	
	public static String convertJavaToJson(Object object) {
		String jsonResult="";
		
			try {
				jsonResult= mapper.writeValueAsString(object);
			} catch (JsonProcessingException e) {
				System.out.println("Exception occured while converting java object to json"+e.getMessage());
				e.printStackTrace();
			}
		
		return jsonResult;
		
	}
	public static <T> T convertJsonToJava(String jsonString, Class<T> cls) {
		T result = null;
		try {
			result = mapper.readValue(jsonString, cls);
		} catch (JsonProcessingException e) {
			System.out.println("Exception occured while convertting json into java"+e.getMessage());
			e.printStackTrace();
		}
		return result;
	}
	
	
	
}
