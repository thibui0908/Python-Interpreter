package python.executor;

import java.util.HashMap;

public class SymTab extends HashMap<String, SymEntry> {

    SymEntry lookup(String key) {
        return getOrDefault(key, null);
    }

    void insert(String key, Object data) {
        put(key, new SymEntry(key, data));
    }
}
