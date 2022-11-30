package python.intermediate;

import python.type.Typespec.*;

import java.util.ArrayList;

import python.type.Typespec;;

public class SymEntry {
    String name;
    DataStructure data;
    Typespec type;

    public SymEntry(String name, Object data, Typespec type) {
        this.name = name;
        this.type = type;
        createDS(data);
    }

    private void createDS(Object data) {
        if (type == Typespec.STRING || type == Typespec.INTEGER || type == Typespec.FLOAT) {
            data = new Primitive(data);
        } else if (type == Typespec.LIST) {
            data = new List(data);
        }
    }

    public String getName() {
        return name;
    }

    public Object getData() {
        return data.getData();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(Object data) {

    }

    public Typespec getType() {
        return type;
    }

    public void setType(Typespec type) {
        this.type = type;
    }

    private interface DataStructure {
        Object getData();

        void setData(Object data);
    }

    private class Primitive implements DataStructure {
        Object data;

        public Primitive(Object data) {
            this.data = data;
        }

        @Override
        public Object getData() {
            return data;
        }

        @Override
        public void setData(Object data) {
            this.data = data;
        }

    }

    private class List implements DataStructure {
        ArrayList<SymEntry> list;

        List(Object data) {
            list = (ArrayList<SymEntry>) data;
        }

        @Override
        public Object getData() {
            System.out.println("hi!");
            return list;
        }

        @Override
        public void setData(Object data) {
            list = (ArrayList<SymEntry>) data;

        }

    }

}
