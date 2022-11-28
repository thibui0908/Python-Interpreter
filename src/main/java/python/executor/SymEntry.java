package python.executor;

import python.type.Typespec;

public class SymEntry {
    String name;
    Object data;
    Typespec type;

    public SymEntry(String name, Object data, Typespec type) {
        this.name = name;
        this.data = data;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Object getData() {
        return data;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Typespec getType() {
        return type;
    }

    public void setType(Typespec type) {
        this.type = type;
    }
}
