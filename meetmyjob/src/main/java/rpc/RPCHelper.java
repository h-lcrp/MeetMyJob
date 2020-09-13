package rpc;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import entity.Item;
import entity.Item.ItemBuilder;

public class RPCHelper {
	public static void writeJsonArray(HttpServletResponse response, JSONArray array) throws IOException {
		response.setContentType("application/json");
		response.getWriter().print(array);
		
	}
	
	public static void writeJsonObject(HttpServletResponse response, JSONObject obj) throws IOException {
		response.setContentType("application/json");
		response.getWriter().print(obj);
	}
	
	public static Item parseFavoriteItem(JSONObject favoriteItem) {
		Set<String> keywords = new HashSet<>();
		JSONArray array = favoriteItem.getJSONArray("keywords");
		for (int i = 0; i < array.length(); ++i) {
			keywords.add(array.getString(i));
		}
		
		ItemBuilder builder = new ItemBuilder();
		builder.setAddress(favoriteItem.getString("address"));
		builder.setImageUrl(favoriteItem.getString("image_url"));
		builder.setItemId(favoriteItem.getString("item_id"));
		builder.setName(favoriteItem.getString("name"));
		builder.setUrl(favoriteItem.getString("url"));
		builder.setKeywords(keywords);
		
		return builder.build();
	}
}
