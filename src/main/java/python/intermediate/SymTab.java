package python.intermediate;

import java.util.HashMap;

import python.type.Typespec;

public class SymTab extends HashMap<String, SymEntry> {

    SymEntry lookup(String key) {
        return getOrDefault(key, null);
    }

    void insert(String key, Object data, Typespec type) {
        put(key, new SymEntry(key, data, type));
    }
}
