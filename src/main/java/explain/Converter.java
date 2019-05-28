package explain;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

class Converter {
    private final Map<String, Class> map = new HashMap<>();

    void setMapping(String header, Class modelClass) {
        map.put(header, modelClass);
    }

    <T> T convert(String header, String json) {
        Class<T> targetClass = map.get(header);
        return new Gson().fromJson(json, targetClass);
    }
}
