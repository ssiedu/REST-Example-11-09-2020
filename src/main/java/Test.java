import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;

import org.json.JSONArray;
import org.json.JSONObject;

public class Test {

	public static void main(String[] args) {

		JSONObject json1=new JSONObject();
		
		json1.put("code", "1111");
		json1.put("title", "jsoncourse");
		json1.put("subject", "webapp");
		json1.put("duration", 3);
		json1.put("fees", 5000);
		
		JSONObject json2=new JSONObject();
		
		json2.put("code", "2222");
		json2.put("title", "javascript");
		json2.put("subject", "webapp");
		json2.put("duration", 2);
		json2.put("fees", 4000);
		
		JSONArray jarray=new JSONArray();
		jarray.put(json1); jarray.put(json2);
		//String jsonArr=jarray.toString();
		//System.out.println(jsonArr);
		
		JSONObject info=new JSONObject();
		info.put("courses", jarray);
		
		System.out.println(info);
		
		
	}

}
