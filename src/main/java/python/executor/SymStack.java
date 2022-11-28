package python.executor;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Stack;

public class SymStack {
    private Stack<SymTab> stack;

    SymStack() {
        stack = new Stack<>();
        stack.add(new SymTab());
    }

    void addStack() {
        stack.push(new SymTab());
    }

    void pop() {
        stack.pop();
    }

    void insert(String key, Object data) {
        stack.peek().insert(key, data);
    }

    SymEntry lookup(String key) {
        ListIterator<SymTab> it = stack.listIterator(stack.size());
        while (it.hasPrevious()) {
            SymEntry data = it.previous().lookup(key);
            if (data != null)
                return data;
        }
        return null;
    }
}