package python.intermediate;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Stack;

import python.type.Typespec;

public class SymStack {
    private Stack<SymTab> stack;

    public SymStack() {
        stack = new Stack<>();
        stack.add(new SymTab());
    }

    public void addStack() {
        stack.push(new SymTab());
    }

    public void pop() {
        stack.pop();
    }

    public void insert(String key, Object data, Typespec type) {
        SymEntry entry = lookup(key);
        if (entry != null) {
            entry.setData(data);
            entry.setType(type);
        } else
            stack.peek().insert(key, data, type);
    }

    public SymEntry lookup(String key) {
        ListIterator<SymTab> it = stack.listIterator(stack.size());
        while (it.hasPrevious()) {
            SymEntry data = it.previous().lookup(key);
            if (data != null)
                return data;
        }
        return null;
    }
}